package com.example.managedomainobjectswithjpa.repository;

import com.example.managedomainobjectswithjpa.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {


}
