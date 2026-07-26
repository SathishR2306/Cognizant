package com.cognizant.jwthandson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtHandsonApplication {

    private static final Logger logger = LoggerFactory.getLogger(JwtHandsonApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JwtHandsonApplication.class, args);
        logger.info("JWT Auth Handson Application Started on port 8080");
    }
}
