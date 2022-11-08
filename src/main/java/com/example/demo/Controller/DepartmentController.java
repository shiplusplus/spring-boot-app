// java Program to Illustrate DepartmentController File

// Importing required packages modules
package com.example.demo.Controller;

import com.example.demo.Services.DepartmentService;
import com.example.demo.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> fetchDepartments() {
        return departmentService.fetchDepartments();
    }

    @GetMapping("/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long id) {
        return departmentService.fetchDepartmentById(id);
    }

    @PutMapping("/{id}")
    public Department
    updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId) {
        return departmentService.updateDepartment(department, departmentId);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Deleted Successfully";
    }
}

