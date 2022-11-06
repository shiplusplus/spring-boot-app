package com.example.demo.Services;

import com.example.demo.dto.TranscriptDTO;
import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    List<Student> fetchStudentList();
    Student updateStudent(Student student, Long studentId);
    void deleteStudentById(Long studentId);

    Student fetchStudentById(Long id);

    TranscriptDTO fetchTranscriptById(Long studentId);

    //TranscriptDTO fetchTranscriptById(Long studentId);
}