package com.example.demo.Impl;

import java.util.List;
import java.util.Objects;

import com.example.demo.Services.StudentService;
import com.example.demo.dto.TranscriptDTO;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);}
    @Override public List<Student> fetchStudentList()
    {
        return (List<Student>)
                studentRepository.findAll();
    }
    @Override
    public Student updateStudent(Student newStudentDetails, Long studentId)
    {
        Student currentStudentDetails = studentRepository.findById(studentId).get();

        if (Objects.nonNull(newStudentDetails.getStudentName()) && !"".equalsIgnoreCase(newStudentDetails.getStudentName())) {
            currentStudentDetails.setStudentName(newStudentDetails.getStudentName());
        }
        if (Objects.nonNull(newStudentDetails.getPhone()) && !"".equalsIgnoreCase(newStudentDetails.getPhone())) {
            currentStudentDetails.setPhone(newStudentDetails.getPhone());
        }
        if (Objects.nonNull(newStudentDetails.getAadhar()) && !"".equalsIgnoreCase(newStudentDetails.getAadhar())) {
            currentStudentDetails.setAadhar(newStudentDetails.getAadhar());
        }

        return studentRepository.save(currentStudentDetails);
    }
    @Override
    public void deleteStudentById(Long studentId)
    {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student fetchStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public TranscriptDTO fetchTranscriptById(Long studentId) {
        Student student=studentRepository.findById(studentId).get();
        return new TranscriptDTO(student);
    }

//    @Override
//    public TranscriptDTO fetchTranscriptById(Long studentId) {
//        return null;
//    }
}


