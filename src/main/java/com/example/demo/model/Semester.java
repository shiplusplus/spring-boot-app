package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class Semester {

    @Id
    private Long semesterId;
    private Long semesterNumber;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToMany(mappedBy = "semester")
    private List<Marks> marks;

    @JsonBackReference
    public Student getStudent() {
        return student;
    }

    @JsonManagedReference
    public List<Marks> getMarks() {
        return marks;
    }
}
