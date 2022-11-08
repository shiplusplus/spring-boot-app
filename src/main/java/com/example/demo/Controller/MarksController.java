// java Program to Illustrate MarksController File

// Importing required packages modules
package com.example.demo.Controller;

import com.example.demo.Services.MarksService;
import com.example.demo.dto.MarkDTO;
import com.example.demo.model.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/marks")
public class MarksController {
	@Autowired private MarksService marksService;
	@PostMapping
	public Marks saveMarks(@Valid @RequestBody Marks marks)
	{
		return marksService.saveMarks(marks);
	}
	@GetMapping
	public List<Marks> fetchMarksList()
	{
		return marksService.fetchMarksList();
	}
	@GetMapping("/{id}")
	public MarkDTO fetchMarksById(@PathVariable("id")Long id)
	{
		return new MarkDTO(marksService.fetchMarksById(id));
	}
	@PutMapping("/{id}")
	public Marks
	updateMarks(@RequestBody Marks marks, @PathVariable("id") Long marksId)
	{
		return marksService.updateMarks(marks, marksId);
	}
	@DeleteMapping("/{id}")
	public String deleteMarksById(@PathVariable("id") Long marksId)
	{
		marksService.deleteMarksById(marksId);
		return "Deleted Successfully";
	}
}

