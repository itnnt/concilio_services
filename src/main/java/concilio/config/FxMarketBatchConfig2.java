package concilio.config;

import concilio.config.listener.JobCompletionNotificationListener;
import concilio.config.processor.FxMarketEventProcessor;
import concilio.config.writer.StockPriceAggregator;
import concilio.entity.FxMarketEvent;
import concilio.entity.FxMarketPricesStore;
import concilio.entity.Trade;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The Class BatchConfiguration.
 */
@Configuration
@EnableBatchProcessing
public class FxMarketBatchConfig2 {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public FxMarketPricesStore fxMarketPricesStore() {
        return new FxMarketPricesStore();
    }

    // FxMarketEventReader (Reader)
//    @Bean
//    public FxMarketEventReader fxMarketEventReader(@Value("${file_path_csv_trades}") Resource resource) {
//        return new FxMarketEventReader(resource);
//    }

    // FxMarketEventProcessor (Processor)
    @Bean
    public FxMarketEventProcessor fxMarketEventProcessor() {
        return new FxMarketEventProcessor();
    }

    // StockPriceAggregator (Writer)
    @Bean
    public StockPriceAggregator stockPriceAggregator() {
        return new StockPriceAggregator();
    }

    // JobCompletionNotificationListener (File loader)
    @Bean
    public JobExecutionListener listener() {
        return new JobCompletionNotificationListener();
    }

    // Configure job step
    @Bean
    public Job fxMarketPricesETLJob(@Qualifier(value = "FxMarketEventReader") ItemReader itemReader) {
        Step step = stepBuilderFactory.get("Extract -> Transform -> Aggregate -> Load")
                .<FxMarketEvent, Trade>chunk(10000)
//                .reader(fxMarketEventReader())
                .reader(itemReader)
                .processor(fxMarketEventProcessor())
                .writer(stockPriceAggregator())
                .build();
        return jobBuilderFactory.get("FxMarket Prices ETL Job")
                .incrementer(new RunIdIncrementer())
                .listener(listener())
                .flow(step)
                .end()
                .build();
    }
}
