package concilio.config.batchjob;

import concilio.config.routing.DatabaseContextHolder;
import concilio.config.routing.DatabaseEnvironment;
import concilio.entity.local.LocalCandidate;
import concilio.repository.customer.CustomerRepository;
import concilio.repository.local.LocalCandidateRepository;
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.util.List;

@Configuration
@EnableBatchProcessing
@EnableAutoConfiguration(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
})

public class CandidateSynchBatchConfig2 {
    @Bean
    Job customerBatchJob2(
            StepBuilderFactory stepBuilderFactory,
            JobBuilderFactory jobBuilderFactory,
            @Qualifier("localCandidateItemReader2") ItemReader<LocalCandidate> reader,
            @Qualifier("localCandidateItemProcessor2") ItemProcessor<LocalCandidate, LocalCandidate> processor,
            @Qualifier("localCandidateItemWriter2") ItemWriter<LocalCandidate> writer
    ) {
        Step step = stepBuilderFactory
                .get("customer batch job - step")
                .<LocalCandidate, LocalCandidate>chunk(100)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();

        return jobBuilderFactory.get("customer batch job")
                .start(step)
                .build();
    }

    private DefaultLineMapper<LocalCandidate> lineMapper(Resource resource) {
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setDelimiter(";");
        delimitedLineTokenizer.setNames(new String[]{"id", "firstname"});
        delimitedLineTokenizer.setStrict(false);

        BeanWrapperFieldSetMapper<LocalCandidate> beanWrapper = new BeanWrapperFieldSetMapper<>();
        beanWrapper.setTargetType(LocalCandidate.class);

        DefaultLineMapper<LocalCandidate> defaultLineMapper = new DefaultLineMapper<>();
        defaultLineMapper.setFieldSetMapper(beanWrapper);
        defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
        return defaultLineMapper;
    }

    @Bean(name="localCandidateItemReader2")
    FlatFileItemReader<LocalCandidate> flatFileItemReader(@Value("${file_path_csv_user}")Resource resource) {
        FlatFileItemReader<LocalCandidate> reader = new FlatFileItemReader<>();
        reader.setResource(resource);
        reader.setLinesToSkip(1);
        reader.setLineMapper(lineMapper(resource));
        return reader;
    }

    @Bean(name = "localCandidateItemProcessor2")
    ItemProcessor<LocalCandidate, LocalCandidate> itemProcessor() {
        return new ItemProcessor<LocalCandidate, LocalCandidate>() {
            @Override
            public LocalCandidate process(LocalCandidate customer) throws Exception {
                return customer;
            }
        };
    }

    @Autowired
    LocalCandidateRepository localCandidateRepository;

    @Bean(name = "localCandidateItemWriter2")
    ItemWriter<LocalCandidate> itemWriter () {
        DatabaseEnvironment testing = DatabaseEnvironment.local_tung_vincere_io;
        DatabaseContextHolder.set(testing);
        return new ItemWriter<LocalCandidate>() {
            @Override
            public void write(List<? extends LocalCandidate> list) throws Exception {
                localCandidateRepository.saveAll(list);
            }
        };
    }
}
