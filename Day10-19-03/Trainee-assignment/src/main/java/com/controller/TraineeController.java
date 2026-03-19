package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.TraineeDTO;
import com.service.ITraineeService;
import com.service.TraineeService;

@RestController
@RequestMapping("/api/trainees")
public class TraineeController {
	private ITraineeService service;

	public TraineeController(TraineeService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping
	public List<TraineeDTO> getAllTrainee(){
		return service.getAllTrainee();
	}
	
	@GetMapping("/name/{name}")
	public List<TraineeDTO> getTraineeByName(@PathVariable String name){
		return service.getTraineeByName(name);
	}
	
	@GetMapping("/id/{id}")
	public TraineeDTO getTraineeById(@PathVariable int id){
		return service.getTraineeById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public String deleteTrainee(@PathVariable int id) {
		return service.deleteTrainee(id);
	}
	
	@PostMapping
	public TraineeDTO insertTrainee(@RequestBody TraineeDTO tr) {
		return service.insertTrainee(tr);
	}
	
	@PutMapping
	public TraineeDTO updateTrainee(@RequestBody TraineeDTO tr) {
		return service.updateTrainee(tr);
	}
	
	
}
