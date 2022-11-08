package com.example.demo.Controller;

import com.example.demo.Services.StudentService;
import com.example.demo.dto.StudentDTO;
import com.example.demo.dto.TranscriptDTO;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@Valid @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> fetchStudentList() {
        return studentService.fetchStudentList();
    }

    @PutMapping("/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") Long studentId) {
        return studentService.updateStudent(student, studentId);
    }

    @GetMapping("/{id}")
    public StudentDTO fetchStudentById(@PathVariable("id") Long id) {
        return new StudentDTO(studentService.fetchStudentById(id));
    }//todo do this in student service not in controller

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId) {
        studentService.deleteStudentById(studentId);
        return "Deleted Successfully";
    }

    //todo add requestparam or httpservletrequest for semester
    @GetMapping("/{id}")
    public TranscriptDTO fetchTranscript(@PathVariable("id") Long studentId) {
        return studentService.fetchTranscriptById(studentId);
    }
}

