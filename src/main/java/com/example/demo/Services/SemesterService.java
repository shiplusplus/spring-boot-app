
package com.example.demo.Services;

import com.example.demo.entity.Semester;

import java.util.List;

public interface SemesterService {

	Semester saveSemester(Semester semester);
	List<Semester> fetchSemesterList();
	Semester updateSemester(Semester semester,
								Long semesterId);
	void deleteSemesterById(Long semesterId);

	Semester fetchSemesterById(Long id);
}

