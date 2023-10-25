package com.example.creatingcustomspringdatarepository.repository;

import com.example.creatingcustomspringdatarepository.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomizedCourseRepository extends BaseRepository<Course, Long> {

}
