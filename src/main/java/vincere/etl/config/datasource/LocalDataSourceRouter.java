package vincere.etl.config.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Returns environment identifier by current context.
 */
public class LocalDataSourceRouter extends AbstractRoutingDataSource {
    private static final Logger log = LoggerFactory.getLogger(LocalDataSourceRouter.class);

    @Override
    protected Object determineCurrentLookupKey() {
        log.info(">>> determineCurrentLookupKey thread: {}", Thread.currentThread().getName() );
        log.info(">>> RoutingDataSource: {}", LocalDatabaseContextHolder.getEnvironment());
        return LocalDatabaseContextHolder.getEnvironment();
    }
}
