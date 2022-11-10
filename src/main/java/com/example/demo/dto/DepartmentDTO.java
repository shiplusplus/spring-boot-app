package com.example.demo.dto;

import com.example.demo.model.Department;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DepartmentDTO {

    private Long departmentId;
    private String departmentName;

    public DepartmentDTO(Department department)
    {
        this.departmentId=department.getDepartmentId();
        this.departmentName=department.getDepartmentName();
    }
}
