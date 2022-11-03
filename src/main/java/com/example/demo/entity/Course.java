package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long courseId;
    private String courseName;
    private int credits;

    @ManyToOne
    @JoinColumn(name="departmentId")
    private Department department;

    @ManyToOne
    @JoinColumn(name="semesterId")
    private Semester semester;
}
