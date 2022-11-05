package com.example.demo.repository;

import com.example.demo.model.Course;
import com.example.demo.model.Marks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends CrudRepository<Marks,Long> {


}
