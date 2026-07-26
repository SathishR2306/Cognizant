package com.cognizant.springrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringRestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class, args);
        logger.info("========================================");
        logger.info("  Spring REST Application Started       ");
        logger.info("  Server running on port: 8083          ");
        logger.info("========================================");
    }
}
