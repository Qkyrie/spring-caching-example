package com.deswaef.spring.examples.caching.repository;

import com.deswaef.spring.examples.caching.model.CacheableMessage;

/**
 * User: Quinten
 * Date: 11-4-2014
 * Time: 11:11
 *
 * @author Quinten De Swaef
 */
public interface ICachingRepository {
    CacheableMessage getById(Long id) ;
}
