// java Program to Illustrate SemesterController File

// Importing required packages modules
package com.example.demo.Controller;

import com.example.demo.Services.SemesterService;
import com.example.demo.dto.SemesterDTO;
import com.example.demo.model.Semester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/semesters")
public class SemesterController {
    @Autowired
    private SemesterService semesterService;

    @PostMapping
    public Semester saveSemester(@Valid @RequestBody Semester semester) {
        return semesterService.saveSemester(semester);
    }

    //todo use dto not model
    @GetMapping
    public List<Semester> fetchSemesters() {
        return semesterService.fetchSemesters();
    }

    @GetMapping("/{id}")
    public SemesterDTO fetchSemesterById(@PathVariable("id") Long id) {
        return new SemesterDTO(semesterService.fetchSemesterById(id));
    }

    @PutMapping("/{id}")
    public Semester updateSemester(@RequestBody Semester semester, @PathVariable("id") Long semesterId) {
        return semesterService.updateSemester(semester, semesterId);
    }

    @DeleteMapping("/{id}")
    public String deleteSemesterById(@PathVariable("id") Long semesterId) {
        semesterService.deleteSemesterById(semesterId);
        return "Deleted Successfully";
    }
}

