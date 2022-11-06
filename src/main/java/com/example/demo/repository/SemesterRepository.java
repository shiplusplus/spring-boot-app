package com.example.demo.repository;

import com.example.demo.model.Semester;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepository extends CrudRepository<Semester,Long> {


}
