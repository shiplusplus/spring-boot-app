package com.example.demo.dto;

import com.example.demo.model.Semester;
import com.example.demo.model.Student;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class TranscriptDTO {

    String studentName;
    Long studentId;
    String departmentName;
    List<SemesterDTO> semesters = new ArrayList<>();

    public TranscriptDTO(Student student) {
        if (student == null) return;
        this.studentName = student.getStudentName();
        this.departmentName = (student.getDepartment()!=null)?student.getDepartment().getDepartmentName():null;
        this.studentId = student.getStudentId();
        if (student.getSemesters() != null) {
            for (Semester s : student.getSemesters()) {
                this.semesters.add(new SemesterDTO(s));
            }
        } else this.semesters = null;
    }
}
