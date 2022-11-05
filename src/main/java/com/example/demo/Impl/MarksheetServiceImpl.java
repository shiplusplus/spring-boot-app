package com.example.demo.Impl;

import com.example.demo.Services.MarksheetService;
import com.example.demo.model.Marksheet;
import com.example.demo.repository.MarksheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MarksheetServiceImpl implements MarksheetService {

	@Autowired
	private MarksheetRepository marksheetRepository;
	@Override
	public Marksheet saveMarksheet(Marksheet marksheet)
	{
		return marksheetRepository.save(marksheet);}
	@Override public List<Marksheet> fetchMarksheetList()
	{
		return (List<Marksheet>) marksheetRepository.findAll();
	}
	@Override
	public Marksheet updateMarksheet(Marksheet marksheet, Long marksheetId)
	{
		Marksheet depDB = marksheetRepository.findById(marksheetId).get();

//		if (Objects.nonNull(marksheet.getMarksheetName()) && !"".equalsIgnoreCase(marksheet.getMarksheetName())) {
//			depDB.setMarksheetName(marksheet.getMarksheetName());
//		}

		return marksheetRepository.save(depDB);
	}
	@Override
	public void deleteMarksheetById(Long marksheetId)
	{
		marksheetRepository.deleteById(marksheetId);
	}

	@Override
	public Marksheet fetchMarksheetById(Long id) {
		return marksheetRepository.findById(id).get();
	}
}

