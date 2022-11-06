package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Address {

    @Id
    private String addressId;
    private String addressName;
    private String country;
    private String city;
    private String pincode;
    private String addressLine;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    @JsonBackReference
    public Student getStudent() {
        return student;
    }
}
