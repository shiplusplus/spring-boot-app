package com.example.demo.Controller;

import com.example.demo.Services.StudentService;
import com.example.demo.dto.StudentDTO;
import com.example.demo.dto.TranscriptDTO;
import com.example.demo.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@Valid @RequestBody Student student) {
        LOGGER.info("Adding a student to the repository");
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> fetchStudentList() {
        LOGGER.info("Fetching a list of all the students");
        return studentService.fetchStudentList();
    }

    @PutMapping("/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") Long studentId) {
        LOGGER.info("Fetching a student with given ID {}", studentId);

        return studentService.updateStudent(student, studentId);
    }

    @GetMapping("/{id}")
    public StudentDTO fetchStudentById(@PathVariable("id") Long id) {
        LOGGER.info("Fetching a student with given ID {}", id);

        return new StudentDTO(studentService.fetchStudentById(id));
    }//todo do this in student service not in controller

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId) {
        LOGGER.info("Deleting a student with given ID {}", studentId);

        studentService.deleteStudentById(studentId);
        return "Deleted Successfully";
    }

    //todo add requestparam or httpservletrequest for semester
    @GetMapping("transcript/{id}")
    public TranscriptDTO fetchTranscript(@PathVariable("id") Long studentId) {
        LOGGER.info("Fetching the consolidated transcript of student {}", studentId);
        return studentService.fetchTranscriptById(studentId);
    }
}

