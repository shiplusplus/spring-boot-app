package com.example.demo.Controller;

import com.example.demo.Services.DepartmentService;
import com.example.demo.dto.DepartmentDTO;
import com.example.demo.error.DemoProjectException;
import com.example.demo.model.Department;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "POST department to DB")
    @PostMapping
    public DepartmentDTO saveDepartment(@Valid @RequestBody DepartmentDTO department) {
        LOGGER.info("Adding department to the repository");
        return departmentService.saveDepartment(department);
    }
    @ApiOperation(value = "GET all departments")
    @GetMapping
    public List<DepartmentDTO> fetchDepartments() {
        LOGGER.info("Fetching all the departments");
        List<Department> departments= departmentService.fetchDepartments();
        return departments.stream().map(x -> new DepartmentDTO(x)).collect(Collectors.toList());
    }
    @ApiOperation(value = "GET department by id")
    @GetMapping("/{id}")
    public ResponseEntity<Object> fetchDepartmentById(@PathVariable("id") Long id) {
        LOGGER.info("Fetching a department with given ID {}", id);
        try {
            Department department = departmentService.fetchDepartmentById(id);
            return ResponseEntity.ok(new DepartmentDTO(department));
        } catch (DemoProjectException e) {
            LOGGER.error("Caught error: {}", e.getMessage());
            return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
        }
    }

    @ApiOperation("PUT updated department by ID")
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId) {
        LOGGER.info("Updating a department with given ID {}", departmentId);
        try {
            Department c = departmentService.updateDepartment(department, departmentId);
            ;
            return ResponseEntity.ok(department);
        } catch (DemoProjectException e) {
            LOGGER.error("Caught error {}", e.getMessage());
            return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
        }

    }
    @ApiOperation("DELETE department by ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteDepartmentById(@PathVariable("id") Long departmentId) {
        LOGGER.info("Deleting a department with given ID {}", departmentId);
        try {
            departmentService.fetchDepartmentById(departmentId);
            return ResponseEntity.ok("Deleted Successfully");
        } catch (DemoProjectException e) {
            LOGGER.error("Caught error {}", e.getMessage());
            return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
        }
    }
}

