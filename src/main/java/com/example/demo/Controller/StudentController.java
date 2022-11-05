
package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import com.example.demo.Services.StudentService;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired private StudentService studentService;
    @PostMapping("/add")
    public Student saveStudent(@Valid @RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }
    @GetMapping("/getAll")
    public List<Student> fetchStudentList()
    {
        return studentService.fetchStudentList();
    }
    @PutMapping("/updateId/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") Long studentId)
    {
        return studentService.updateStudent(student, studentId);
    }

    @GetMapping("/getId/{id}")
    public Student fetchStudentById(@PathVariable("id")Long id)
    {
        return studentService.fetchStudentById(id);
    }
    @DeleteMapping("/deleteId/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId)
    {
        studentService.deleteStudentById(studentId);
        return "Deleted Successfully";
    }
}

