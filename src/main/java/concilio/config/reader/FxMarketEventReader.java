package concilio.config.reader;

import concilio.entity.FxMarketEvent;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * The Class FxMarketEventReader: reads the trades.csv file
 */
@Component
@Qualifier("FxMarketEventReader")
public class FxMarketEventReader extends FlatFileItemReader<FxMarketEvent> {

    public FxMarketEventReader(@Value("${file_path_csv_trades}") Resource resource) {
        //Set input file
//        this.setResource(new ClassPathResource("trades.csv"));
        this.setResource(resource);
        //Skip the file header line
        this.setLinesToSkip(1);
        //Line is mapped to item (FxMarketEvent) using setLineMapper(LineMapper)
        this.setLineMapper(new DefaultLineMapper<FxMarketEvent>() {
            {
                setLineTokenizer(new DelimitedLineTokenizer() {
                    {
                        setNames("stock", "time", "price", "shares");
                    }
                });
                setFieldSetMapper(new BeanWrapperFieldSetMapper<FxMarketEvent>() {
                    {
                        setTargetType(FxMarketEvent.class);
                    }
                });
            }
        });
    }

}
