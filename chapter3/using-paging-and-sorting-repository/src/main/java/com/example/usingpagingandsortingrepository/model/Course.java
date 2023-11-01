package com.example.usingpagingandsortingrepository.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "COURSES")
@NoArgsConstructor
@Data
public class Course {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    private int rating;

    private String description;

}
