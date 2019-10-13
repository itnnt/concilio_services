package concilio.data_batch.job_configuration;

import concilio.data_batch.model.FxMarketEvent;
import concilio.data_batch.model.Trade;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@Configuration
@EnableBatchProcessing
public class FxMarketBatchConfig {
    @Bean
    Job jobFxMarket(JobBuilderFactory jobBuilderFactory,
            StepBuilderFactory stepBuilderFactory,
            @Qualifier("flatFileItemReader") ItemReader<FxMarketEvent> itemReader,
            @Qualifier("objectTransformItemProcessor") ItemProcessor<FxMarketEvent, Trade> itemProcessor,
            @Qualifier("flatFileItemWriter") ItemWriter<Trade> itemWriter
    ) {
        Step step = stepBuilderFactory.get("FxMarket Step")
                .<FxMarketEvent, Trade>chunk(100)
                .reader(itemReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();
        return jobBuilderFactory.get("FxMarket Job").start(step).build();
    }

    @Bean
    @Qualifier("flatFileItemReader")
    FlatFileItemReader<FxMarketEvent> flatFileItemReader(@Value("${file_path_csv_trades}") Resource resource) {
        FlatFileItemReader<FxMarketEvent> itemReader = new FlatFileItemReader<>();
        itemReader.setResource(resource);
        itemReader.setLinesToSkip(1);
        itemReader.setLineMapper(lineMapper(resource));
        itemReader.setStrict(false);
        return itemReader;
    }

    @Bean
    @Qualifier("objectTransformItemProcessor")
    ItemProcessor<FxMarketEvent, Trade> objectTransformItemProcessor() {
        return fxMarketEvent -> new Trade(
                fxMarketEvent.getStock(),
                fxMarketEvent.getTime(),
                NumberUtils.toDouble(fxMarketEvent.getPrice()),
                NumberUtils.toLong(fxMarketEvent.getShares())
        );
    }

    @Bean
    @Qualifier("flatFileItemWriter")
    FlatFileItemWriter<Trade> flatFileItemWriter() {
        Resource resource = new FileSystemResource("output/output_trades.csv");
        FlatFileItemWriter<Trade> itemWriter = new FlatFileItemWriter<>();
        itemWriter.setResource(resource);
        // all jobs repetitions should 'append' to the same output file
        itemWriter.setAppendAllowed(true);
        itemWriter.setLineAggregator(
                new DelimitedLineAggregator<Trade>() {
                    {
                        setDelimiter(",");
                        setFieldExtractor(
                                new BeanWrapperFieldExtractor<Trade>() {
                                    {
                                        setNames(new String[]{"stock", "time", "price", "shares"});
                                    }
                                }
                        );
                    }
                }
        );
        return itemWriter;
    }

    private DefaultLineMapper<FxMarketEvent> lineMapper(Resource resource) {
        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
        tokenizer.setDelimiter(",");
        tokenizer.setNames("stock", "time", "price", "shares");
        tokenizer.setStrict(true);

        BeanWrapperFieldSetMapper<FxMarketEvent> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(FxMarketEvent.class);

        DefaultLineMapper<FxMarketEvent> lineMapper = new DefaultLineMapper<>();
        lineMapper.setFieldSetMapper(fieldSetMapper);
        lineMapper.setLineTokenizer(tokenizer);

        return lineMapper;
    }
}
