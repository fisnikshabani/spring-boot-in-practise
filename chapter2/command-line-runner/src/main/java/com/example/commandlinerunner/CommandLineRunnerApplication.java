package com.example.commandlinerunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerApplication implements CommandLineRunner {

    public static final Logger log = LoggerFactory.getLogger(CommandLineRunnerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CommandLineRunnerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("CommandLineRunnerApplication CommandLineRunner has executed!");
    }
}
