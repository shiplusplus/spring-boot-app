package com.example.demo.Impl;

import com.example.demo.Services.CourseService;
import com.example.demo.dto.CourseDTO;
import com.example.demo.error.DemoProjectException;
import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.example.demo.error.ErrorInterface.ErrorEnum;

@Service
public class CourseServiceImpl implements CourseService {

    public static final Logger LOGGER= LoggerFactory.getLogger(CourseService.class);
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public CourseDTO saveCourse(CourseDTO courseDTO) {
        LOGGER.info("Entering saveCourse service");
        Course course=new Course();
        course.setCourseName(courseDTO.getCourseName());
        course.setCredits(courseDTO.getCredits());
        return new CourseDTO(courseRepository.save(course));
    }

    @Override
    public List<Course> fetchCourses() {
        LOGGER.info("Entering fetchCourses service");
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course updateCourse(Course course, Long courseId) {
        Optional<Course> optionalCourse = courseRepository.findById(courseId);
        if (!optionalCourse.isPresent()) {
            throw new DemoProjectException(ErrorEnum.ID_NOT_FOUND.getHttpStatus(), ErrorEnum.ID_NOT_FOUND.getErrorMessage());
        }

        Course currentCourse = optionalCourse.get();

        if (Objects.nonNull(course.getCourseName()) && !"".equalsIgnoreCase(course.getCourseName())) {
            currentCourse.setCourseName(course.getCourseName());
        }

        return courseRepository.save(currentCourse);
    }

    @Override
    public void deleteCourseById(Long courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        if (!course.isPresent()) {
            throw new DemoProjectException(ErrorEnum.ID_NOT_FOUND.getHttpStatus(), ErrorEnum.ID_NOT_FOUND.getErrorMessage());
        }
        courseRepository.deleteById(courseId);
    }

    @Override
    public Course fetchCourseById(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        if (!course.isPresent()) {
            throw new DemoProjectException(ErrorEnum.ID_NOT_FOUND.getHttpStatus(), ErrorEnum.ID_NOT_FOUND.getErrorMessage());
        }
        return course.get();
    }
}

