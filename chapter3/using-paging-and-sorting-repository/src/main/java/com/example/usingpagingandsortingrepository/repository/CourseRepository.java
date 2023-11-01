package com.example.usingpagingandsortingrepository.repository;

import com.example.usingpagingandsortingrepository.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
