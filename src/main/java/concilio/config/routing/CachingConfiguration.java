package concilio.config.routing;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CachingConfiguration extends CachingConfigurerSupport {

    @Override
    public KeyGenerator keyGenerator() {
        return new EnvironmentAwareCacheKeyGenerator();
    }

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("entities");
    }
}
