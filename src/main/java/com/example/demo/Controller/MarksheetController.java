// java Program to Illustrate MarksheetController File

// Importing required packages modules
package com.example.demo.Controller;

import com.example.demo.Services.MarksheetService;
import com.example.demo.model.Marksheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/marksheets")
public class MarksheetController {
	@Autowired private MarksheetService marksheetService;
//	@Autowired
//	private MarksheetDto marksheetDto;
	@PostMapping("/add")
	public Marksheet saveMarksheet(@Valid @RequestBody Marksheet marksheet)
	{
		return marksheetService.saveMarksheet(marksheet);
	}
	@GetMapping("/getAll")
	public List<Marksheet> fetchMarksheetList()
	{
		return marksheetService.fetchMarksheetList();
	}
	@GetMapping("getId/{id}")
	public Marksheet fetchMarksheetbyId(@PathVariable("id")Long id)
	{
		return marksheetService.fetchMarksheetById(id);
	}
	@PutMapping("updateId/{id}")
	public Marksheet
	updateMarksheet(@RequestBody Marksheet marksheet, @PathVariable("id") Long marksheetId)
	{
		return marksheetService.updateMarksheet(marksheet, marksheetId);
	}
	@DeleteMapping("DeleteId/{id}")
	public String deleteMarksheetById(@PathVariable("id") Long marksheetId)
	{
		marksheetService.deleteMarksheetById(marksheetId);
		return "Deleted Successfully";
	}
}

