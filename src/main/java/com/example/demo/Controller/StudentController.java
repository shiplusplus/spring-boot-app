
package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import com.example.demo.Services.StudentService;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired private StudentService studentService;
    @PostMapping("/")
    public Student saveStudent(@Valid @RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }
    @GetMapping("/")
    public List<Student> fetchStudentList()
    {
        return studentService.fetchStudentList();
    }
//    @PutMapping("/students/{id}")
//    public Student
//    updateStudent(@RequestBody Student student,
//                     @PathVariable("id") Long studentId)
//    {
//        return studentService.updateStudent(
//                student, studentId);
//    }
    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId)
    {
        studentService.deleteStudentById(studentId);
        return "Deleted Successfully";
    }
}

