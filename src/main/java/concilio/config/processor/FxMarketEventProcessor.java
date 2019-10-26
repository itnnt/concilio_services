package concilio.config.processor;

import concilio.model.FxMarketEvent;
import concilio.model.Trade;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

/**
 * The Class FxMarketEventProcessor.
 * Transform FxMarketEvent object to Trade object
 */
public class FxMarketEventProcessor implements ItemProcessor<FxMarketEvent, Trade> {

    private static final Logger log = LoggerFactory.getLogger(FxMarketEventProcessor.class);

    @Override
    public Trade process(final FxMarketEvent fxMarketEvent) throws Exception {

        final String stock = fxMarketEvent.getStock();
        final String time = fxMarketEvent.getTime();
        final double price = NumberUtils.toDouble(fxMarketEvent.getPrice());
        final long shares = NumberUtils.toLong(fxMarketEvent.getShares());
        final Trade trade = new Trade(stock, time, price, shares);

        log.trace("Converting (" + fxMarketEvent + ") into (" + trade + ")");

        return trade;
    }

}
