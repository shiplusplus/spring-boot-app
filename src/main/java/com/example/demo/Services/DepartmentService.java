
package com.example.demo.Services;

import com.example.demo.dto.DepartmentDTO;
import com.example.demo.model.Department;

import java.util.List;

public interface DepartmentService {

	DepartmentDTO saveDepartment(DepartmentDTO department);
	List<Department> fetchDepartments();
	Department updateDepartment(Department department,
								Long departmentId);
	void deleteDepartmentById(Long departmentId);

	Department fetchDepartmentById(Long id);
}

