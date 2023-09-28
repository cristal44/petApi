package com.xue.petapi;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@SpringBootTest
class PetApiApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(PetApiApplication.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        logger.info("Test case executing second log statement...");
        assertEquals(true,true);
    }

}
