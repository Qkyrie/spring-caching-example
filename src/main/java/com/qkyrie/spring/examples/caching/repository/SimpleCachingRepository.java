package com.qkyrie.spring.examples.caching.repository;

import com.qkyrie.spring.examples.caching.model.CacheableMessage;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: Quinten
 * Date: 11-4-2014
 * Time: 11:11
 *
 * @author Quinten De Swaef
 */
@Component
public class SimpleCachingRepository implements ICachingRepository {
    private List<CacheableMessage> myCacheableMessages;

    @PostConstruct
    public void populateCacheableMessages() {
        myCacheableMessages = new ArrayList<>();
        myCacheableMessages = Arrays.asList(new CacheableMessage(1L, "Hello"),
                                            new CacheableMessage(2L, "World"));
    }


    @Override
    public CacheableMessage getById(Long id) {
        for (CacheableMessage myCacheableMessage : myCacheableMessages) {
            if (myCacheableMessage.getId().equals(id)) {
                return myCacheableMessage;
            }
        }
        return null;
    }
}
