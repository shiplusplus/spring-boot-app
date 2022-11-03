package com.example.demo.Impl;

import com.example.demo.Services.CourseService;
import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	@Override
	public Course saveCourse(Course course)
	{
		return courseRepository.save(course);}
	@Override public List<Course> fetchCourseList()
	{
		return (List<Course>) courseRepository.findAll();
	}
	@Override
	public Course updateCourse(Course course, Long courseId)
	{
		Course depDB = courseRepository.findById(courseId).get();

		if (Objects.nonNull(course.getCourseName()) && !"".equalsIgnoreCase(course.getCourseName())) {
			depDB.setCourseName(course.getCourseName());
		}

		return courseRepository.save(depDB);
	}
	@Override
	public void deleteCourseById(Long courseId)
	{
		courseRepository.deleteById(courseId);
	}

	@Override
	public Course fetchCourseById(Long id) {
		return courseRepository.findById(id).get();
	}
}

