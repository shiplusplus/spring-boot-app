// java Program to Illustrate CourseController File

// Importing required packages modules
package com.example.demo.Controller;

import com.example.demo.Services.CourseService;
//import com.example.demo.dto.CourseDto;
import com.example.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
	@Autowired private CourseService courseService;
	@PostMapping
	public Course saveCourse(@Valid @RequestBody Course course)
	{
		return courseService.saveCourse(course);
	}
	@GetMapping
	public List<Course> fetchCourses()
	{
		return courseService.fetchCourses();
	}
	@GetMapping("/{id}")
	public Course fetchCourseById(@PathVariable("id")Long id)
	{
		return courseService.fetchCourseById(id);
	}
	@PutMapping("/{id}")
	public Course
	updateCourse(@RequestBody Course course, @PathVariable("id") Long courseId)
	{
		return courseService.updateCourse(course, courseId);
	}
	@DeleteMapping("/{id}")
	public String deleteCourseById(@PathVariable("id") Long courseId)
	{
		courseService.deleteCourseById(courseId);
		return "Deleted Successfully";
	}
}

