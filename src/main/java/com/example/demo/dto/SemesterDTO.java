package com.example.demo.dto;

import com.example.demo.model.Marks;
import com.example.demo.model.Semester;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SemesterDTO {

    private Long semesterNumber;
    private List<MarksDTO> coursesCompleted = new ArrayList<>();

    public SemesterDTO(Semester semester) {
        this.semesterNumber = semester.getSemesterNumber();
        if (semester.getMarks() != null) {
            //todo use lambda
            for (Marks m : semester.getMarks()) {
                this.coursesCompleted.add(new MarksDTO(m));
            }
        }

    }

}
