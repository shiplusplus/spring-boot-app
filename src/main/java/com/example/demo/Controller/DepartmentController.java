// java Program to Illustrate DepartmentController File

// Importing required packages modules
package com.example.demo.Controller;

import com.example.demo.Services.DepartmentService;
import com.example.demo.model.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Adding a department to the repository");

        return departmentService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> fetchDepartments() {
        LOGGER.info("Fetching all the departments");

        return departmentService.fetchDepartments();
    }

    @GetMapping("/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long id) {
        LOGGER.info("Fetching a department with given ID {}", id);

        return departmentService.fetchDepartmentById(id);
    }

    @PutMapping("/{id}")
    public Department
    updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId) {
        LOGGER.info("Updating a department with given ID {}",departmentId);

        return departmentService.updateDepartment(department, departmentId);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        LOGGER.info("Deleting a course with given ID {}",departmentId);

        departmentService.deleteDepartmentById(departmentId);
        return "Deleted Successfully";
    }
}

