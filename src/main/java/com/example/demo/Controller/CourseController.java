package com.example.demo.Controller;

import com.example.demo.Services.CourseService;
import com.example.demo.dto.CourseDTO;
import com.example.demo.error.DemoProjectException;
import com.example.demo.model.Course;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CourseController.class);
    @Autowired
    private CourseService courseService;

    @PostMapping
    public CourseDTO saveCourse(@Valid @RequestBody CourseDTO course) {
        LOGGER.info("Adding course to the repository");
        return courseService.saveCourse(course);
    }

    @GetMapping
    public List<CourseDTO> fetchCourses() {
        LOGGER.info("Fetching all the courses");
        List<Course> courses= courseService.fetchCourses();
        return courses.stream().map(x -> new CourseDTO(x)).collect(Collectors.toList());

    }
    @ApiOperation(value = "get course by id")
    @GetMapping("/{id}")
    public ResponseEntity<Object> fetchCourseById(@PathVariable("id") Long id) {
        LOGGER.info("Fetching a course with given ID {}", id);
        try {
            Course course = courseService.fetchCourseById(id);
            return ResponseEntity.ok(new CourseDTO(course));
        } catch (DemoProjectException e) {
            LOGGER.error("Caught error: {}", e.getMessage());
            return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCourse(@RequestBody Course course, @PathVariable("id") Long courseId) {
        LOGGER.info("Updating a course with given ID {}", courseId);
        try {
            Course c = courseService.updateCourse(course, courseId);
            ;
            return ResponseEntity.ok(course);
        } catch (DemoProjectException e) {
            LOGGER.error("Caught error {}", e.getMessage());
            return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCourseById(@PathVariable("id") Long courseId) {
        LOGGER.info("Deleting a course with given ID {}", courseId);
        try {
            courseService.fetchCourseById(courseId);
            return ResponseEntity.ok("Deleted Successfully");
        } catch (DemoProjectException e) {
            LOGGER.error("Caught error {}", e.getMessage());
            return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
        }
    }
}

