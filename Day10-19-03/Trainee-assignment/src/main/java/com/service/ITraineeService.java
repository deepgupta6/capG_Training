package com.service;

import java.util.List;

import com.dto.TraineeDTO;

public interface ITraineeService {
	
	public List<TraineeDTO> getAllTrainee();
	public List<TraineeDTO> getTraineeByName(String name);
	public List<TraineeDTO> getTraineeByDomain(String domain);
	public List<TraineeDTO> getTraineeByLocation(String location);
	public TraineeDTO getTraineeById(int id);
	public String deleteTrainee(int id);
	public TraineeDTO insertTrainee(TraineeDTO tr);
	public TraineeDTO updateTrainee(TraineeDTO tr);
}
