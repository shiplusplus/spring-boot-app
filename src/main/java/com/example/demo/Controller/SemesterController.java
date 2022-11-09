// java Program to Illustrate SemesterController File

// Importing required packages modules
package com.example.demo.Controller;

import com.example.demo.Services.SemesterService;
import com.example.demo.dto.SemesterDTO;
import com.example.demo.model.Semester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/semesters")
public class SemesterController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SemesterController.class);

    @Autowired
    private SemesterService semesterService;

    @PostMapping
    public Semester saveSemester(@Valid @RequestBody Semester semester) {
        LOGGER.info("Adding a semester to the repository");

        return semesterService.saveSemester(semester);
    }

    //todo use dto not model
    @GetMapping
    public List<Semester> fetchSemesters() {
        LOGGER.info("Fetching all the semesters");
        return semesterService.fetchSemesters();
    }

    @GetMapping("/{id}")
    public SemesterDTO fetchSemesterById(@PathVariable("id") Long id) {
        LOGGER.info("Fetching a semester with given ID {}",id);

        return new SemesterDTO(semesterService.fetchSemesterById(id));
    }

    @PutMapping("/{id}")
    public Semester updateSemester(@RequestBody Semester semester, @PathVariable("id") Long semesterId) {
        LOGGER.info("Updating a semester with given ID {}",semesterId);

        return semesterService.updateSemester(semester, semesterId);
    }

    @DeleteMapping("/{id}")
    public String deleteSemesterById(@PathVariable("id") Long semesterId) {
        LOGGER.info("Deleting a semester with given ID {}",semesterId);

        semesterService.deleteSemesterById(semesterId);
        return "Deleted Successfully";
    }
}

