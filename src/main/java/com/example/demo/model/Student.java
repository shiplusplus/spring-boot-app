package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @OneToOne
    @JoinColumn(name = "marksheetId")
    private Marksheet marksheet;
//    @ManyToOne
//    @JoinColumn(name="departmentId", nullable=false)
//    private Department department;



}
