package com.example.managingmanytomanyrelationship.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "AUTHORS_COURSES")
@Table(name = "AUTHORS_COURSES")
public class AuthorCourse {

    @Id
    @Column(name = "author_id")
    private Long authorId;
    @Column(name = "course_id")
    private Long courseId;

    public AuthorCourse() {
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "AuthorCourse{" +
                "authorId=" + authorId +
                ", courseId=" + courseId +
                '}';
    }
}
