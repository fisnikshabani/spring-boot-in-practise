package com.example.managingmanytomanyrelationship.dto;

public class AuthorCourseDTO {

    private Long id;
    private String authorName;
    private String courseName;
    private String description;

    public AuthorCourseDTO(Long id, String authorName, String courseName, String description) {
        this.id = id;
        this.authorName = authorName;
        this.courseName = courseName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
