package com.example.demo.dto;

import com.example.demo.model.Course;

public class CourseDTO {

    private long courseId;
    private String courseName;
    private String departmentName;
    private int credits;

    public CourseDTO(Course course){

        try {
            this.courseId = course.getCourseId();
            this.courseName = course.getCourseName();
            this.credits = course.getCredits();
            //this.departmentName = course.getDepartment().getDepartmentName();
        }
        catch(NullPointerException e)
        {
            //todo npe
        }
    }
}
