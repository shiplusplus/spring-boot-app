// java Program to Illustrate MarksController File

// Importing required packages modules
package com.example.demo.Controller;

import com.example.demo.Services.MarksService;
import com.example.demo.dto.MarksDTO;
import com.example.demo.model.Marks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/marks")
public class MarksController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MarksController.class);
	@Autowired private MarksService marksService;
	@PostMapping
	public Marks saveMarks(@Valid @RequestBody Marks marks)
	{
		LOGGER.info("Adding a Marks entry to the repository");
		return marksService.saveMarks(marks);
	}
	@GetMapping
	public List<Marks> fetchMarksList()
	{
		LOGGER.info("Fetching all the marks list");
		return marksService.fetchMarksList();
	}
	@GetMapping("/{id}")
	public MarksDTO fetchMarksById(@PathVariable("id")Long id)
	{
		LOGGER.info("Fetching a marks entry with given ID {}",id);
		return new MarksDTO(marksService.fetchMarksById(id));
	}
	@PutMapping("/{id}")
	public Marks
	updateMarks(@RequestBody Marks marks, @PathVariable("id") Long marksId)
	{
		LOGGER.info("Updating a marks entry with given ID {}",marksId);

		return marksService.updateMarks(marks, marksId);
	}
	@DeleteMapping("/{id}")
	public String deleteMarksById(@PathVariable("id") Long marksId)
	{
		LOGGER.info("Deleting a marks entry with given ID {}",marksId);
		marksService.deleteMarksById(marksId);
		return "Deleted Successfully";
	}
}

