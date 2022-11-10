package com.example.demo.dto;

import com.example.demo.model.Marks;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MarksDTO {

    String courseName;
    Integer grade;

    public MarksDTO(Marks marks) {
        this.courseName = (marks.getCourse() != null) ? marks.getCourse().getCourseName() : null;
        this.grade = marks.getGrade();
    }
}
