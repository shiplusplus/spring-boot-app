package com.example.demo.dto;

import lombok.Data;

@Data
public class DepartmentDto {

    private Long departmentId;
    private String departmentName;

//    @OneToMany(mappedBy = "department")
//    private List<Student> students;
//
//    @OneToMany(mappedBy = "department")
//    private List<Course> courses;

}
