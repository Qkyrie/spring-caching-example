package com.deswaef.spring.examples.caching;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@IntegrationTest("server.port:0")
@SpringApplicationConfiguration(classes = CachingApplication.class)
public class CachingApplicationTest {

    @Test
    public void buildUp(){
        //empty test to buildup environment
    }

}