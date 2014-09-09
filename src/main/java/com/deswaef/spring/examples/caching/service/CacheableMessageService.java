package com.deswaef.spring.examples.caching.service;

import com.deswaef.spring.examples.caching.model.CacheableMessage;
import com.deswaef.spring.examples.caching.repository.ICachingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * User: Quinten
 * Date: 11-4-2014
 * Time: 11:13
 *
 * @author Quinten De Swaef
 */
@Service
public class CacheableMessageService implements IMessageService {

    private ICachingRepository cachingRepository;

    @Autowired
    public CacheableMessageService(ICachingRepository cachingRepository) {
        this.cachingRepository = cachingRepository;
    }

    @Cacheable(value = "messagesCache")
    @Override
    public CacheableMessage getById(Long id) {
        return cachingRepository.getById(id);
    }
}
