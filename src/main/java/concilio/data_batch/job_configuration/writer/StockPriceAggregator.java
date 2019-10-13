package concilio.data_batch.job_configuration.writer;

import concilio.data_batch.model.FxMarketPricesStore;
import concilio.data_batch.model.StockPriceDetails;
import concilio.data_batch.model.Trade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StockPriceAggregator implements ItemWriter<Trade> {
    @Autowired
    private FxMarketPricesStore fxMarketPricesStore;

    private static final Logger log = LoggerFactory.getLogger(StockPriceAggregator.class);

    @Override
    public void write(List<? extends Trade> trades) throws Exception {
        trades.forEach(t -> {
            if (fxMarketPricesStore.containsKey(t.getStock())) {
                double tradePrice = t.getPrice();
                StockPriceDetails priceDetails = fxMarketPricesStore.get(t.getStock());
                // Set highest price
                if (tradePrice > priceDetails.getHigh()) {
                    priceDetails.setHigh(tradePrice);
                }
                // Set lowest price
                if (tradePrice < priceDetails.getLow()) {
                    priceDetails.setLow(tradePrice);
                }
                // Set close price
                priceDetails.setClose(tradePrice);
            } else {
                log.trace("Adding new stock {}", t.getStock());
                fxMarketPricesStore.put(t.getStock(),
                        new StockPriceDetails(t.getStock(), t.getPrice(), t.getPrice(), t.getPrice(), t.getPrice()));
            }
        });
    }
}
