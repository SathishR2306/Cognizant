package com.cognizant.springrest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/app")
public class AppInfoController {

    private static final Logger logger = LoggerFactory.getLogger(AppInfoController.class);

    @GetMapping("/info")
    public Map<String, String> getAppInfo() {
        logger.trace("TRACE level log - AppInfoController.getAppInfo() called");
        logger.debug("DEBUG level log - Processing /app/info request");
        logger.info("INFO  level log - Application info requested");
        logger.warn("WARN  level log - This is a sample warning");
        logger.error("ERROR level log - This is a sample error (demo only)");

        Map<String, String> info = new HashMap<>();
        info.put("applicationName", "Spring REST API");
        info.put("description",     "Cognizant Digital Nurture - Spring REST Assessment");
        info.put("version",         "1.0.0");
        info.put("author",          "Cognizant Trainee");
        info.put("port",            "8083");
        info.put("framework",       "Spring Boot 3.2.5");
        info.put("javaVersion",     "Java 17");

        logger.info("Returning app info map with {} entries", info.size());
        return info;
    }

    @GetMapping("/status")
    public Map<String, String> getStatus() {
        logger.info("GET /app/status - Health check requested");

        Map<String, String> status = new HashMap<>();
        status.put("status",  "UP");
        status.put("message", "Spring REST API is running successfully");

        logger.debug("Status response: {}", status);
        return status;
    }
}
