package com.example.demo.dto;

import com.example.demo.model.Marks;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MarksDTO {

    String courseDescription;
    Integer grade;
    Integer credits;

    public MarksDTO(Marks marks) {
        this.courseDescription = (marks.getCourse() != null) ? marks.getCourse().getCourseDescription() : null;
        this.grade = marks.getGrade();
        this.credits= marks.getCourse().getCredits();
    }
}
