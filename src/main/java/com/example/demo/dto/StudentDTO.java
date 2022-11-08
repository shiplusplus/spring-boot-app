package com.example.demo.dto;

import com.example.demo.model.Address;
import com.example.demo.model.Student;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class StudentDTO {

    private Long studentId;
    private String firstName;
    private String lastName;
    private String studentName;
    private String phone;
    private String aadhar;
    private String motherName;
    private String fatherName;
    private String departmentName;
    private List<Address> addresses;

    public StudentDTO(Student student)
    {
       this.studentId= student.getStudentId();
       this.firstName=student.getFirstName();
       this.lastName=student.getLastName();
       this.studentName= student.getStudentName();
       this.aadhar=student.getAadhar();
       this.motherName=student.getMotherName();
       this.fatherName=student.getFatherName();
       this.departmentName=student.getDepartment().getDepartmentName();
       this.addresses=student.getAddresses();
       this.phone=student.getPhone();
    }
}
