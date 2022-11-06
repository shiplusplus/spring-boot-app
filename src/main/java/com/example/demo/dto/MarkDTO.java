package com.example.demo.dto;

import com.example.demo.model.Marks;
import lombok.Data;

@Data
public class MarkDTO {

    String courseName;
    Integer grade;

    public MarkDTO(Marks m)
    {
        this.courseName=(m.getCourse()!=null)?m.getCourse().getCourseName():null;
        //this.grade=(m.getGrade()!=null)?m.getGrade:null;
        this.grade=m.getGrade();
    }
}
