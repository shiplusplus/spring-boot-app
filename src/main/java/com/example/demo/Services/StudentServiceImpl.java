package com.example.demo.Services;

import java.util.List;
import java.util.Objects;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl
        implements StudentService {

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
//    @Override
//    public Student updateStudent(Student student, Long studentId)
//    {
//        Student depDB = studentRepository.findById(studentId).get();
//
//        if (Objects.nonNull(student.getStudentName()) && !"".equalsIgnoreCase(student.getStudentName())) {
//            depDB.setStudentName(student.getStudentName());
//        }
//
//        if (Objects.nonNull(student.getDepartment())
//                && !"".equalsIgnoreCase(student.getDepartment())) {
//            depDB.setStudentAddress(student.getStudentAddress());
//        }
//
//        if (Objects.nonNull(student.getStudentCode()) && !"".equalsIgnoreCase(student.getStudentCode())) {
//            depDB.setStudentCode(student.getStudentCode());
//        }
//
//        return studentRepository.save(depDB);
//    }
    @Override
    public void deleteStudentById(Long studentId)
    {
        studentRepository.deleteById(studentId);
    }
}


