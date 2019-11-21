package concilio.config.batchjob;

import concilio.config.routing.DatabaseContextHolder;
import concilio.config.routing.DatabaseEnvironment;
import concilio.entity.local.LocalCandidate;
import concilio.entity.vinc.Candidate;
import concilio.repository.local.LocalCandidateRepository;
import concilio.repository.remote.RemoteCandidateRepository;
import org.modelmapper.ModelMapper;
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
import org.springframework.batch.item.data.RepositoryItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@EnableBatchProcessing
@EnableAutoConfiguration(exclude={
        org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class,
        org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class
})
public class CandidateSynchBatchConfig {
    Logger logger = LoggerFactory.getLogger(CandidateSynchBatchConfig.class);
    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    RemoteCandidateRepository remoteCandidateRepository;

    @Autowired
    LocalCandidateRepository localCandidateRepository;

    @Bean
    Step stepLoadCandidate(
            @Qualifier("readCandidate") ItemReader<Candidate> reader,
            @Qualifier("processCandidate") ItemProcessor<Candidate, LocalCandidate> processor,
            @Qualifier("writeCandidate") ItemWriter<LocalCandidate> writer) {
        return stepBuilderFactory.get("stepLoadCandidate")
                .<Candidate, LocalCandidate>chunk(100)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean
    Job jobCandidateSynch(
            @Qualifier("readCandidate") ItemReader<Candidate> reader,
            @Qualifier("processCandidate") ItemProcessor<Candidate, LocalCandidate> processor,
            @Qualifier("writeCandidate") ItemWriter<LocalCandidate> writer) {
        return jobBuilderFactory.get("jobCandidateSynch")
                .start(stepLoadCandidate(reader, processor, writer))
                .build();
    }
    private Map<String, Sort.Direction> sorts;
    @Bean
    RepositoryItemReader<Candidate> readCandidate() {
        RepositoryItemReader<Candidate> candidateRepositoryItemReader = new RepositoryItemReader<>();
        candidateRepositoryItemReader.setRepository(remoteCandidateRepository);
        candidateRepositoryItemReader.setPageSize(100);

        sorts = new HashMap<>();
        sorts.put("id", Sort.Direction.ASC);
        candidateRepositoryItemReader.setSort(sorts);
        candidateRepositoryItemReader.setMethodName("findAll");
        return candidateRepositoryItemReader;
    }

    @Bean
    ItemProcessor<Candidate, LocalCandidate> processCandidate() {
        return new ItemProcessor<Candidate, LocalCandidate>() {
            @Override
            public LocalCandidate process(Candidate candidate) throws Exception {
//                LocalCandidate cand = (LocalCandidate)candidate;
                ModelMapper modelMapper = new ModelMapper();
                LocalCandidate localCandidate = modelMapper.map(candidate, LocalCandidate.class);
                return localCandidate;
            }
        };
    }

    @Bean
    ItemWriter<LocalCandidate> writeCandidate() {
        return new ItemWriter<LocalCandidate>() {
            @Override
            public void write(List<? extends LocalCandidate> list) throws Exception {
                DatabaseContextHolder.set(DatabaseEnvironment.local_tung_vincere_io);

                localCandidateRepository.saveAll(list);
            }
        };
    }
}
