package concilio.config;

import concilio.config.routing.DatabaseContextHolder;
import concilio.config.routing.DatabaseEnvironment;
import concilio.entity.customer.Customer;
import concilio.repository.customer.CustomerRepository;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.*;
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

public class CustomerBatchConfig {
    @Bean
    Job customerBatchJob(
            StepBuilderFactory stepBuilderFactory,
            JobBuilderFactory jobBuilderFactory,
            @Qualifier("customerFlatFileItemReader") ItemReader<Customer> reader,
            @Qualifier("customerItemProcessor") ItemProcessor<Customer, Customer> processor,
            @Qualifier("customerItemWriter") ItemWriter<Customer> writer
    ) {
        Step step = stepBuilderFactory
                .get("customer batch job - step")
                .<Customer, Customer>chunk(100)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();

        return jobBuilderFactory.get("customer batch job")
                .start(step)
                .build();
    }

    private DefaultLineMapper<Customer> lineMapper(Resource resource) {
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setDelimiter(";");
        delimitedLineTokenizer.setNames(new String[]{"id", "firstname"});
        delimitedLineTokenizer.setStrict(false);

        BeanWrapperFieldSetMapper<Customer> beanWrapper = new BeanWrapperFieldSetMapper<>();
        beanWrapper.setTargetType(Customer.class);

        DefaultLineMapper<Customer> defaultLineMapper = new DefaultLineMapper<>();
        defaultLineMapper.setFieldSetMapper(beanWrapper);
        defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
        return defaultLineMapper;
    }

    @Bean(name="customerFlatFileItemReader")
    FlatFileItemReader<Customer> flatFileItemReader(@Value("${file_path_csv_user}")Resource resource) {
        FlatFileItemReader<Customer> reader = new FlatFileItemReader<>();
        reader.setResource(resource);
        reader.setLinesToSkip(1);
        reader.setLineMapper(lineMapper(resource));
        return reader;
    }

    @Bean(name = "customerItemProcessor")
    ItemProcessor<Customer, Customer> itemProcessor() {
        return new ItemProcessor<Customer, Customer>() {
            @Override
            public Customer process(Customer customer) throws Exception {
                return customer;
            }
        };
    }

    @Autowired
    CustomerRepository customerRepository;

    @Bean(name = "customerItemWriter")
    ItemWriter<Customer> itemWriter () {
        DatabaseEnvironment testing = DatabaseEnvironment.TESTING;
        DatabaseContextHolder.set(testing);
        return new ItemWriter<Customer>() {
            @Override
            public void write(List<? extends Customer> list) throws Exception {
                customerRepository.saveAll(list);
            }
        };
    }
}
