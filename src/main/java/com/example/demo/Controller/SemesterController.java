package com.example.demo.Controller;

import com.example.demo.Services.SemesterService;
import com.example.demo.dto.SemesterDTO;
import com.example.demo.error.DemoProjectException;
import com.example.demo.model.Semester;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/semesters")
public class SemesterController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SemesterController.class);
    @Autowired
    private SemesterService semesterService;

    @ApiOperation(value = "POST semester to DB")
    @PostMapping
    public SemesterDTO saveSemester(@Valid @RequestBody SemesterDTO semester) {
        LOGGER.info("Adding semester to the repository");
        return semesterService.saveSemester(semester);
    }
    @ApiOperation(value = "GET all semesters")
    @GetMapping
    public List<SemesterDTO> fetchSemesters() {
        LOGGER.info("Fetching all the semesters");
        List<Semester> semesters= semesterService.fetchSemesters();
        return semesters.stream().map(x -> new SemesterDTO(x)).collect(Collectors.toList());
    }
    @ApiOperation(value = "GET semester by id")
    @GetMapping("/{id}")
    public ResponseEntity<Object> fetchSemesterById(@PathVariable("id") Long id) {
        LOGGER.info("Fetching a semester with given ID {}", id);
        try {
            Semester semester = semesterService.fetchSemesterById(id);
            return ResponseEntity.ok(new SemesterDTO(semester));
        } catch (DemoProjectException e) {
            LOGGER.error("Caught error: {}", e.getMessage());
            return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
        }
    }

    @ApiOperation("PUT updated semester by ID")
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateSemester(@RequestBody Semester semester, @PathVariable("id") Long semesterId) {
        LOGGER.info("Updating a semester with given ID {}", semesterId);
        try {
            Semester c = semesterService.updateSemester(semester, semesterId);
            ;
            return ResponseEntity.ok(semester);
        } catch (DemoProjectException e) {
            LOGGER.error("Caught error {}", e.getMessage());
            return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
        }

    }
    @ApiOperation("DELETE semester by ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteSemesterById(@PathVariable("id") Long semesterId) {
        LOGGER.info("Deleting a semester with given ID {}", semesterId);
        try {
            semesterService.fetchSemesterById(semesterId);
            return ResponseEntity.ok("Deleted Successfully");
        } catch (DemoProjectException e) {
            LOGGER.error("Caught error {}", e.getMessage());
            return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
        }
    }
}

