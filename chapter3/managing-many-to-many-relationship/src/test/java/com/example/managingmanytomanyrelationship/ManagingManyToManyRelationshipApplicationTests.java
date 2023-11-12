package com.example.managingmanytomanyrelationship;

import com.example.managingmanytomanyrelationship.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ManagingManyToManyRelationshipApplicationTests {

    @Autowired
    private AuthorRepository authorRepository;

    @Test
    void whenCountAllCoursesThenExpectFiveCourses() {

        assertThat(authorRepository.getAuthorCourseInfo(2L)).hasSize(3);
    }
}
