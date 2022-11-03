package com.example.demo.Services;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    List<Student> fetchStudentList();
    Student updateStudent(Student student, Long studentId);
    void deleteStudentById(Long studentId);
}