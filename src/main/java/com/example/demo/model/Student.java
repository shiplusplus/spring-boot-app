package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String studentName;
    private String phone;
    private String aadhar;

    @OneToMany(mappedBy = "student")
    private List<Address> addresses;
    @OneToMany(mappedBy = "student")
    private List<Semester> semesters;
    @ManyToOne
    @JoinColumn(name="departmentId")
    private Department department;

    //Getters
    @JsonManagedReference
    public List<Semester> getSemesters() {
        return semesters;
    }
    @JsonManagedReference
    public List<Address> getAddresses() {
        return addresses;
    }

    @JsonBackReference
    public Department getDepartment() {
        return department;
    }


}
