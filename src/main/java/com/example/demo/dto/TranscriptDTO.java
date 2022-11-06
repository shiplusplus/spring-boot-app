package com.example.demo.dto;

import com.example.demo.model.Semester;
import com.example.demo.model.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TranscriptDTO {

    String studentName;
    Long studentId;
    List<SemesterDTO> semesters=new ArrayList<>();

    public TranscriptDTO(Student student)
    {
        this.studentName=(student.getStudentName()!=null)?student.getStudentName():null;

        this.studentId=student.getStudentId();
        if(student.getSemesters()!=null) {
            for (Semester s : student.getSemesters()) {
                this.semesters.add(new SemesterDTO(s));
            }
        }
        else this.semesters=null;
    }
}
