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
public class Semester {

    @Id
    private long semesterId;

    @ManyToOne
    @JoinColumn(name="departmentId")
    private Department department;
}
