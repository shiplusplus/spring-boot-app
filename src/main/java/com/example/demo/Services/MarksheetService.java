
package com.example.demo.Services;

import com.example.demo.model.Marksheet;

import java.util.List;

public interface MarksheetService {

	Marksheet saveMarksheet(Marksheet marksheet);

	List<Marksheet> fetchMarksheetList();
	Marksheet updateMarksheet(Marksheet marksheet,
								Long marksheetId);
	void deleteMarksheetById(Long marksheetId);

	Marksheet fetchMarksheetById(Long id);
}

