package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    private String courseDescription;
    private int credits;

    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private List<Marks> courseMarksList;

//    @ManyToOne
//    @JoinColumn(name="departmentId")
//    private Department department;

    @JsonManagedReference
    public List<Marks> getCourseMarksList() {
        return courseMarksList;
    }

    public void setCourseMarksList(List<Marks> courseMarksList) {
        this.courseMarksList = courseMarksList;
    }
}
