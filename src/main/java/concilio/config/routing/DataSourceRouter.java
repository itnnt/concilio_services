package concilio.config.routing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Returns environment identifier by current context.
 */
public class DataSourceRouter extends AbstractRoutingDataSource {
    private static final Logger log = LoggerFactory.getLogger(DataSourceRouter.class);

    @Override
    protected Object determineCurrentLookupKey() {
        log.info(">>> determineCurrentLookupKey thread: {}", Thread.currentThread().getName() );
        log.info(">>> RoutingDataSource: {}", DatabaseContextHolder.getEnvironment());
        return DatabaseContextHolder.getEnvironment();
    }
}
