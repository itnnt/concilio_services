package concilio.config;

import concilio.model.concilio.Candidate;
import concilio.repository.local.tung.vincere.io.sin.CandidateRepositorySin;
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
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Configuration
@EnableAutoConfiguration(exclude={org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class, org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class})
@EnableBatchProcessing
public class TungVincereIoSynchDataBatchConfig {
    private Logger logger = LoggerFactory.getLogger(TungVincereIoSynchDataBatchConfig.class);

    @Bean
    Job jobSchynCandidate(
            JobBuilderFactory jobBuilderFactory,
            StepBuilderFactory stepBuilderFactory,
            ItemReader<Candidate> itemReader,
            ItemProcessor<Candidate, Candidate> itemProcessor,
            ItemWriter<Candidate> itemWriter
    ) {
        Step step = stepBuilderFactory
                .get("TungVincereIoSynchDataBatchConfig: Candiate synching step")
                .<Candidate, Candidate>chunk(100)
                .reader(itemReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();
        return jobBuilderFactory
                .get("TungVincereIoSynchDataBatchConfig: Candiate synching job")
                .start(step)
                .build();
    }

    @Bean
    JdbcCursorItemReader reader(@Qualifier("srcTungVincereIoDataSource") DataSource dataSource) {
        JdbcCursorItemReader<Candidate> jdbcCursorItemReader = new JdbcCursorItemReader<>();
        jdbcCursorItemReader.setSql("select * from candidate");
        jdbcCursorItemReader.setDataSource(dataSource);

        jdbcCursorItemReader.setRowMapper(new RowMapper<Candidate>() {
            @Override
            public Candidate mapRow(ResultSet resultSet, int i) throws SQLException {
                Candidate cand = new Candidate();
                cand.setId(resultSet.getLong("id"));
                cand.setExternalId(resultSet.getString("external_id"));
                cand.setEmail(resultSet.getString("email"));
                cand.setFirstName(resultSet.getString("first_name"));
                cand.setLastName(resultSet.getString("last_name"));
                return cand;
            }
        });
        return jdbcCursorItemReader;
    }

    @Bean
    ItemProcessor<Candidate, Candidate> processor() {
        return new ItemProcessor<Candidate, Candidate>() {
            @Override
            public Candidate process(Candidate o) throws Exception {
                return o;
            }
        };
    }

    @Autowired
    CandidateRepositorySin candidateRepositorySin;

    @Bean
    ItemWriter<Candidate> writer() {
        return new ItemWriter<Candidate>() {
            @Override
            public void write(List<? extends Candidate> list) throws Exception {
                candidateRepositorySin.saveAll(list);
            }
        };
    }
}
