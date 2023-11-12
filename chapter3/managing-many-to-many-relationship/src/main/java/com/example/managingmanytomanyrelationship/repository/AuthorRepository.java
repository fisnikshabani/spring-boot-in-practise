package com.example.managingmanytomanyrelationship.repository;

import com.example.managingmanytomanyrelationship.dto.AuthorCourseDTO;
import com.example.managingmanytomanyrelationship.model.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

    @Query("SELECT new com.example.managingmanytomanyrelationship.dto.AuthorCourseDTO" +
            "(c.id, a.name, c.name, c.description) FROM AUTHOR a," +
            "COURSE c, AUTHORS_COURSES ac " +
            "WHERE a.id = ac.authorId AND c.id = ac.courseId AND ac.authorId = ?1")
    Iterable<AuthorCourseDTO> getAuthorCourseInfo(Long authorId);
}
