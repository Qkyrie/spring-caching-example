package com.qkyrie.spring.examples.caching.model;

/**
 * User: Quinten
 * Date: 11-4-2014
 * Time: 11:10
 *
 * @author Quinten De Swaef
 */
public class CacheableMessage {
    private Long id;
    private String data;

    public CacheableMessage(Long id, String data) {
        this.id = id;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
