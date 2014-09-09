package com.deswaef.spring.examples.caching.configuration;

import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheFactoryBean;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Quinten
 * Date: 12-4-2014
 * Time: 00:25
 *
 * @author Quinten De Swaef
 */
@Configuration
@EnableCaching
public class SimpleCacheConfiguration {

    @Bean
    public SimpleCacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        List<Cache> caches = new ArrayList<>();
        caches.add(messagesCache().getObject());
        cacheManager.setCaches(caches );
        return cacheManager;
    }

    @Bean
    public ConcurrentMapCacheFactoryBean messagesCache(){
        ConcurrentMapCacheFactoryBean cacheFactoryBean = new ConcurrentMapCacheFactoryBean();
        cacheFactoryBean.setName("messagesCache");
        return cacheFactoryBean;
    }

}
