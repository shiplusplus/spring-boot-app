package com.example.demo.Impl;

import com.example.demo.Services.SemesterService;
import com.example.demo.model.Semester;
import com.example.demo.repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemesterServiceImpl implements SemesterService {

	@Autowired
	private SemesterRepository semesterRepository;
	@Override
	public Semester saveSemester(Semester semester)
	{
		return semesterRepository.save(semester);}
	@Override public List<Semester> fetchSemesterList()
	{
		return (List<Semester>) semesterRepository.findAll();
	}
	@Override
	public Semester updateSemester(Semester semester, Long semesterId)
	{
		Semester depDB = semesterRepository.findById(semesterId).get();

//		if (Objects.nonNull(semester.getSemesterName()) && !"".equalsIgnoreCase(semester.getSemesterName())) {
//			depDB.setSemesterName(semester.getSemesterName());
//		}
		return semesterRepository.save(depDB);
	}
	@Override
	public void deleteSemesterById(Long semesterId)
	{
		semesterRepository.deleteById(semesterId);
	}

	@Override
	public Semester fetchSemesterById(Long id) {
		return semesterRepository.findById(id).get();
	}
}

