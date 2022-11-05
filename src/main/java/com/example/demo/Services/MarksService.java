
package com.example.demo.Services;

import com.example.demo.model.Marks;

import java.util.List;

public interface MarksService {

	Marks saveMarks(Marks marks);

	List<Marks> fetchMarksList();
	Marks updateMarks(Marks marks,
								Long marksId);
	void deleteMarksById(Long marksId);

	Marks fetchMarksById(Long id);
}

