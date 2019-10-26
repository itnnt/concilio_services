package concilio.config;

import concilio.config.processor.LoggingStudentProcessor;
import concilio.config.reader.RESTStudentReader;
import concilio.config.writer.LoggingStudentWriter;
import concilio.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@Configuration
public class RESTStudentBatchConfig {
    private final Logger LOGGER = LoggerFactory.getLogger(RESTStudentBatchConfig.class);
    private static final String PROPERTY_REST_API_URL = "rest.api.to.database.job.api.url";

    @Bean
    ItemReader<Student> restStudentReader(Environment environment, RestTemplate restTemplate) {
        LOGGER.info("########## restStudentReader is running");
        LOGGER.info("########## restStudentReader is calling: {}", environment.getRequiredProperty(PROPERTY_REST_API_URL));
        return new RESTStudentReader(environment.getRequiredProperty(PROPERTY_REST_API_URL), restTemplate);
    }

    @Bean
    ItemProcessor<Student, Student> restStudentProcessor() {
        return new LoggingStudentProcessor();
    }

    @Bean
    ItemWriter<Student> restStudentWriter() {
        return new LoggingStudentWriter();
    }

    @Bean
    Step restStudentStep(ItemReader<Student> restStudentReader,
                         ItemProcessor<Student, Student> restStudentProcessor,
                         ItemWriter<Student> restStudentWriter,
                         StepBuilderFactory stepBuilderFactory) {
        return stepBuilderFactory.get("restStudentStep")
                .<Student, Student>chunk(1)
                .reader(restStudentReader)
                .processor(restStudentProcessor)
                .writer(restStudentWriter)
                .build();
    }

    @Bean
    Job restStudentJob(JobBuilderFactory jobBuilderFactory,
                       @Qualifier("restStudentStep") Step restStudentStep) {
        return jobBuilderFactory.get("restStudentJob")
                .incrementer(new RunIdIncrementer())
                .flow(restStudentStep)
                .end()
                .build();
    }
}
