package com.deswaef.spring.examples.caching.service;

import com.deswaef.spring.examples.caching.model.CacheableMessage;

/**
 * User: Quinten
 * Date: 11-4-2014
 * Time: 11:12
 *
 * @author Quinten De Swaef
 */
public interface IMessageService {
    CacheableMessage getById(Long id);
}
