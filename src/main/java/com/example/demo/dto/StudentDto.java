package com.example.demo.dto;

import com.example.demo.model.Student;

public class StudentDto {

    private Long studentId;
    private String studentName;
    private String phone;
    private String aadhar;
    private String departmentName;

    public StudentDto(Student student)
    {
       this.studentId= student.getStudentId();
       this.studentName= student.getStudentName();
       this.aadhar=student.getAadhar();
       this.departmentName=student.getDepartment().getDepartmentName();
       this.phone=student.getPhone();
    }
}
