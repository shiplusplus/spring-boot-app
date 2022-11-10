package com.example.demo.Impl;

import com.example.demo.Services.MarksService;
import com.example.demo.dto.MarksDTO;
import com.example.demo.model.Marks;
import com.example.demo.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MarksServiceImpl implements MarksService {

	@Autowired
	private MarksRepository marksRepository;
	@Override
	public Marks saveMarks(Marks marks)
	{
		return marksRepository.save(marks);}
	@Override public List<Marks> fetchMarksList()
	{
		return (List<Marks>) marksRepository.findAll();
	}
	@Override
	public Marks updateMarks(Marks marks, Long marksId)
	{
		Marks depDB = marksRepository.findById(marksId).get();

//		if (Objects.nonNull(marks.getMarksName()) && !"".equalsIgnoreCase(marks.getMarksName())) {
//			depDB.setMarksName(marks.getMarksName());
//		}

		return marksRepository.save(depDB);
	}
	@Override
	public void deleteMarksById(Long marksId)
	{
		marksRepository.deleteById(marksId);
	}

	@Override
	public Marks fetchMarksById(Long id) {
		return marksRepository.findById(id).get();
	}
}

