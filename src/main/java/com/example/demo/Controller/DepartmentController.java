// java Program to Illustrate DepartmentController File

// Importing required packages modules
package com.example.demo.Controller;

import java.util.List;
import javax.validation.Valid;

import com.example.demo.Services.DepartmentService;
import com.example.demo.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired private DepartmentService departmentService;
	@PostMapping("/")
	public Department saveDepartment(@Valid @RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/")
	public List<Department> fetchDepartmentList()
	{
		return departmentService.fetchDepartmentList();
	}
	@PutMapping("/{id}")
	public Department
	updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId)
	{
		return departmentService.updateDepartment(department, departmentId);
	}
	@DeleteMapping("/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId)
	{
		departmentService.deleteDepartmentById(departmentId);
		return "Deleted Successfully";
	}
}

