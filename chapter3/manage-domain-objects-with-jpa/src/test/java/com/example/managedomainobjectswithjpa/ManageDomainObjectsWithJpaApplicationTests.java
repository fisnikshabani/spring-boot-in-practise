package com.example.managedomainobjectswithjpa;

import com.example.managedomainobjectswithjpa.model.Course;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.managedomainobjectswithjpa.repository.CourseRepository;

@SpringBootTest
class ManageDomainObjectsWithJpaApplicationTests {

    @Autowired
   private CourseRepository courseRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void givenCreateCourseWhenLoadTheCourseThenExpectSameCourse() {

        Course course = new Course("Rapid Spring Boot Application Development", "Spring", 4,
                "'Spring Boot gives all the power of the Spring Framework without all of the complexities");
        Course savedCourse = courseRepository.save(course);

        Assertions.assertThat(courseRepository.findById(savedCourse.getId()).get())
                .isEqualTo(course);
    }

    @Test
    void givenUpdateCourseWhenLoadTheCourseThenExpectUpdatedCourse() {

        Course course = new Course("Rapid Spring Boot Application Development", "Spring", 4,
                "'Spring Boot gives all the power of the Spring Framework without all of the complexities");
        courseRepository.save(course);
        course.setRating(5);

        Course savedCourses = courseRepository.save(course);

        Assertions.assertThat(courseRepository.findById(savedCourses.getId()).get().getRating())
                .isEqualTo(5);
    }

    @Test
    void givenDeleteCourseWhenLoadTheCourseThenExpectNoCourse() {

        Course course = new Course("Rapid Spring Boot Application Development", "Spring", 4,
                "'Spring Boot gives all the power of the Spring Framework without all of the complexities");

        Course savedCourses = courseRepository.save(course);

        Assertions.assertThat(courseRepository.findById(savedCourses.getId()).get()).isEqualTo(course);

        courseRepository.delete(course);

        Assertions.assertThat(courseRepository.findById(savedCourses.getId()).isPresent()).isFalse();
    }
}
