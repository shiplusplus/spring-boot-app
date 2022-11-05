package com.example.demo.dto;

import com.example.demo.model.Course;

public class CourseDto {

    private long courseId;
    private String courseName;
    private String departmentName;
    private int credits;
    private long semester;

    public CourseDto(Course course){

        try {
            this.courseId = course.getCourseId();
            this.courseName = course.getCourseName();
            this.credits = course.getCredits();
            this.semester = course.getSemester().getSemesterId();
            this.departmentName = course.getDepartment().getDepartmentName();
        }
        catch(NullPointerException e)
        {
            //todo npe
        }
    }
}
