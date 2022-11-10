
package com.example.demo.Services;

import com.example.demo.dto.SemesterDTO;
import com.example.demo.model.Semester;

import java.util.List;

public interface SemesterService {

	SemesterDTO saveSemester(SemesterDTO semester);

	List<Semester> fetchSemesters();
	Semester updateSemester(Semester semester,
                             Long semesterId);
	void deleteSemesterById(Long semesterId);

	Semester fetchSemesterById(Long id);
}

