
package com.example.demo.Services;

import com.example.demo.entity.Course;

import java.util.List;

public interface CourseService {

	Course saveCourse(Course course);
	List<Course> fetchCourseList();
	Course updateCourse(Course course,
								Long courseId);
	void deleteCourseById(Long courseId);

	Course fetchCourseById(Long id);
}

