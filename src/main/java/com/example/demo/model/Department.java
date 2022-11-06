
package com.example.demo.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class Department {

	@Id
	//todo what does this do
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	private String departmentName;

	@OneToMany(mappedBy = "department")
	private List<Student> students;

	@JsonManagedReference
	public List<Student> getStudents() {
		return students;
	}

}

