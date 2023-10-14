package com.example.springbootappfinal;

import com.example.springbootappfinal.model.Course;
import com.example.springbootappfinal.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@SpringBootApplication
public class SpringBootAppFinalApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringBootAppFinalApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppFinalApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {

            Course course = new Course();
            course.setId(1);
            course.setRating(6);

            Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
            Set<ConstraintViolation<Course>> courseViolations = validator.validate(course);

            courseViolations.forEach(courseConstraintViolation -> logger.error("A constraint" +
                    "violation has accured! Violation details: [{}]", courseConstraintViolation));

            User user1 = new User("user1", "user1");

            Validator userValidator = Validation.buildDefaultValidatorFactory().getValidator();

            Set<ConstraintViolation<User>> userViolations = validator.validate(user1);

            logger.error("Password for user1 do not adhere to the password policy!");
            courseViolations
                    .forEach(courseConstraintViolation ->
                            logger.error("Violation details: [{}]", courseConstraintViolation.getMessage()));


            User user2 = new User("user2", "Sbip01$4UDfg");
            userViolations = userValidator.validate(user2);
            if (courseViolations.isEmpty()) {
                logger.info("Password for user2 adhere to the password policy!");
            }

            User user3 = new User("user3", "Sbip01$4UDfgggg");
            userViolations = validator.validate(user3);
            logger.error("Password for user3 violates maximum repetitive rule!");

            courseViolations.forEach(userConstraintViolation ->
                    logger.error("Violation details: [{}]", userConstraintViolation.getMessage()));

            User user4 = new User("user4", "Sbip014UDfgggg");
            userViolations = validator.validate(user4);
            logger.error("Password for user4 violates special character rule!");
            userViolations.forEach(userConstraintViolation ->
                    logger.error("Violation details: [{}]", userConstraintViolation.getMessage()));
        };
    }

}
