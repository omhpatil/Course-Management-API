package com.project.service;

import java.util.List;

import com.project.dto.CourseRequest;
import com.project.dto.CourseResponse;

public interface CourseService {
    CourseResponse createCourse(CourseRequest request);
    CourseResponse getCourseById(Long id);
    List<CourseResponse> getAllCourses();
    CourseResponse updateCourse(Long id, CourseRequest request);
    void deleteCourse(Long id);
}
