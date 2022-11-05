package com.example.demo.model;

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
public class Marksheet {

    @Id
    private Long marksheetId;
    //private List<Course> coursesTaken;
    @OneToOne(mappedBy = "marksheet")
    private Student studentProfile;

    @OneToMany(mappedBy = "marksheet")
    private List<Marks> marks;
}
