
package com.example.demo.Services;

import com.example.demo.dto.CourseDTO;
import com.example.demo.model.Course;

import java.util.List;

public interface CourseService {

	CourseDTO saveCourse(CourseDTO course);
	List<Course> fetchCourses();
	Course updateCourse(Course course,
								Long courseId);
	void deleteCourseById(Long courseId);

	Course fetchCourseById(Long id);
}

