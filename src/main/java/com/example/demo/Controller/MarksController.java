package com.example.demo.Controller;

import com.example.demo.Services.MarksService;
import com.example.demo.dto.MarksDTO;
import com.example.demo.error.DemoProjectException;
import com.example.demo.model.Marks;
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
@RequestMapping("/markss")
public class MarksController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MarksController.class);
	@Autowired
	private MarksService marksService;

	@ApiOperation(value = "POST marks to DB")
	@PostMapping
	public Marks saveMarks(@Valid @RequestBody Marks marks)
	{
		LOGGER.info("Adding a Marks entry to the repository");
		return marksService.saveMarks(marks);
	}
	@ApiOperation(value = "GET all markss")
	@GetMapping
	public List<Marks> fetchMarks() {
		LOGGER.info("Fetching all the markss");
		List<Marks> marks= marksService.fetchMarksList();
		return marks.stream().map(x -> x).collect(Collectors.toList());
	}
	@ApiOperation(value = "GET marks by id")
	@GetMapping("/{id}")
	public ResponseEntity<Object> fetchMarksById(@PathVariable("id") Long id) {
		LOGGER.info("Fetching a marks with given ID {}", id);
		try {
			Marks marks = marksService.fetchMarksById(id);
			return ResponseEntity.ok(new MarksDTO(marks));
		} catch (DemoProjectException e) {
			LOGGER.error("Caught error: {}", e.getMessage());
			return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
		}
	}

	@ApiOperation("PUT updated marks by ID")
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateMarks(@RequestBody Marks marks, @PathVariable("id") Long marksId) {
		LOGGER.info("Updating a marks with given ID {}", marksId);
		try {
			Marks c = marksService.updateMarks(marks, marksId);
			;
			return ResponseEntity.ok(marks);
		} catch (DemoProjectException e) {
			LOGGER.error("Caught error {}", e.getMessage());
			return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
		}

	}
	@ApiOperation("DELETE marks by ID")
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteMarksById(@PathVariable("id") Long marksId) {
		LOGGER.info("Deleting a marks with given ID {}", marksId);
		try {
			marksService.fetchMarksById(marksId);
			return ResponseEntity.ok("Deleted Successfully");
		} catch (DemoProjectException e) {
			LOGGER.error("Caught error {}", e.getMessage());
			return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
		}
	}
}

