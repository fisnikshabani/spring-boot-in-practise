package com.example.osenvvariables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class OsEnvVariablesApplication {

    public static final Logger log = LoggerFactory.getLogger(OsEnvVariablesApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext
                applicationContext = SpringApplication.run(OsEnvVariablesApplication.class, args);

        Environment env = applicationContext.getBean(Environment.class);

        log.info("Configuration application timout value: " + env.getProperty("app.timeout"));
    }

}
