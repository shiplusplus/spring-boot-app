package com.example.demo.dto;

import com.example.demo.model.Marks;
import lombok.Data;

@Data
public class MarkDTO {

    String courseName;
    Integer grade;

    public MarkDTO(Marks marks) {
        this.courseName = (marks.getCourse() != null) ? marks.getCourse().getCourseName() : null;
        this.grade = marks.getGrade();
    }
}
