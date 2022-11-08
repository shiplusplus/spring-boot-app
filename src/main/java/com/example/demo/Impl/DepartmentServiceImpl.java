package com.example.demo.Impl;

import java.util.List;
import java.util.Objects;

import com.example.demo.Services.DepartmentService;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department)
	{
		return departmentRepository.save(department);}
	@Override public List<Department> fetchDepartments()
	{
		return (List<Department>) departmentRepository.findAll();
	}
	@Override
	public Department updateDepartment(Department department, Long departmentId)
	{
		Department depDB = departmentRepository.findById(departmentId).get();

		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
		}
		return departmentRepository.save(depDB);
	}
	@Override
	public void deleteDepartmentById(Long departmentId)
	{
		departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department fetchDepartmentById(Long id) {
		return departmentRepository.findById(id).get();
	}
}

