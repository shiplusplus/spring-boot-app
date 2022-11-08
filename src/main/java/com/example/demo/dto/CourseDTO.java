package com.example.demo.dto;

import com.example.demo.model.Course;
import lombok.Data;

@Data
public class CourseDTO {

    private long courseId;
    private String courseName;
    private String departmentName;
    private int credits;

    public CourseDTO(Course course) {

        if(course==null )
        this.courseId = course.getCourseId();
        this.courseName = course.getCourseName();
        this.credits = course.getCredits();

    }
}
