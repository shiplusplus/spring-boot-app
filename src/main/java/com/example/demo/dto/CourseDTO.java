package com.example.demo.dto;

import com.example.demo.model.Course;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class CourseDTO {
    @NotNull
    private String courseName;
    @Min(0)
    private int credits;

    public CourseDTO(Course course) {
        this.courseName = course.getCourseName();
        this.credits = course.getCredits();
    }
}
