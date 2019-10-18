package concilio.data_batch.job_configuration;

import concilio.data_batch.model.card.User;
import concilio.data_batch.repository.card.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@EnableBatchProcessing
public class UserBatchConfig {
    private Logger logger = LoggerFactory.getLogger(UserBatchConfig.class);
    @Bean
    Job job(JobBuilderFactory jobBuilderFactory,
            StepBuilderFactory stepBuilderFactory,
            ItemReader<User> itemReader,
            ItemProcessor<User, User> itemProcessor,
            ItemWriter<User> itemWriter) {
        Step step = stepBuilderFactory.get("User-step")
                .<User, User>chunk(100)
                .reader(itemReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();
        return jobBuilderFactory.get("User-job")
                .start(step)
                .build();
    }

    /**
     * implement itemReader
     */
    @Bean
    FlatFileItemReader<User> userItemReader(@Value("${file_path_csv_user}") Resource resource) {
        logger.info("########## userItemReader is running");
        FlatFileItemReader<User> flatFileItemReader = new FlatFileItemReader<>();
        flatFileItemReader.setResource(resource);
        flatFileItemReader.setLinesToSkip(1);
        flatFileItemReader.setEncoding("utf8");
        flatFileItemReader.setStrict(false);
        flatFileItemReader.setLineMapper(lineMapper(resource));
        return flatFileItemReader;
    }

    /**
     * implement itemProcessor
     */
    @Bean
    ItemProcessor<User, User> userItemProcessor() {
        return new ItemProcessor<User, User>() {
            @Override
            public User process(User user) throws Exception {
                logger.info("########## userItemProcessor is running");

                Map<String, String> map = new HashMap<>();
                map.put("001", "Data Migration");
                map.put("002", "Dev Opt");
                map.put("003", "Fullstack Dev");
                user.setDept(map.get(user.getDept()));
                return user;
            }
        };
    }

    @Autowired
    UserRepository userRepository;

    /**
     * implement itemWriter
     * @return
     */
    @Bean
    ItemWriter<User> userItemWriter() {
        return new ItemWriter<User>() {
            @Override
            public void write(List<? extends User> list) throws Exception {
                logger.info("########## userItemWriter is running");
                userRepository.saveAll(list);
            }
        };
    }

    private DefaultLineMapper<User> lineMapper(Resource resource) {
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setDelimiter(";");
        delimitedLineTokenizer.setNames(new String[]{"id", "firstname", "lastname", "email", "dept", "salary"});
        delimitedLineTokenizer.setStrict(false);

        BeanWrapperFieldSetMapper<User> beanWrapper = new BeanWrapperFieldSetMapper<>();
        beanWrapper.setTargetType(User.class);

        DefaultLineMapper<User> defaultLineMapper = new DefaultLineMapper<>();
        defaultLineMapper.setFieldSetMapper(beanWrapper);
        defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
        return defaultLineMapper;
    }
}
