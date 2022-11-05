// java Program to Illustrate CourseController File

// Importing required packages modules
package com.example.demo.Controller;

import com.example.demo.Services.CourseService;
import com.example.demo.dto.CourseDto;
import com.example.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
	@Autowired private CourseService courseService;
//	@Autowired
//	private CourseDto courseDto;
	@PostMapping("/add")
	public CourseDto saveCourse(@Valid @RequestBody Course course)
	{
		return new CourseDto(courseService.saveCourse(course));
	}
	@GetMapping("/getAll")
	public List<Course> fetchCourseList()
	{
		return courseService.fetchCourseList();
	}
	@GetMapping("getId/{id}")
	public Course fetchCoursebyId(@PathVariable("id")Long id)
	{
		return courseService.fetchCourseById(id);
	}
	@PutMapping("updateId/{id}")
	public Course
	updateCourse(@RequestBody Course course, @PathVariable("id") Long courseId)
	{
		return courseService.updateCourse(course, courseId);
	}
	@DeleteMapping("DeleteId/{id}")
	public String deleteCourseById(@PathVariable("id") Long courseId)
	{
		courseService.deleteCourseById(courseId);
		return "Deleted Successfully";
	}
}

