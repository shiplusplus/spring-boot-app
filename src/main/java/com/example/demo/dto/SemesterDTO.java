package com.example.demo.dto;

import com.example.demo.model.Marks;
import com.example.demo.model.Semester;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class SemesterDTO {

    private Long semesterNumber;
    private List<MarksDTO> coursesCompleted = new ArrayList<>();

    public SemesterDTO(Semester semester) {
        this.semesterNumber = semester.getSemesterNumber();
        if (semester.getMarks() != null) {
            coursesCompleted=semester.getMarks().stream().map(MarksDTO::new).collect(Collectors.toList());
        }

    }

}
