package com.dto;

import com.entity.Trainee;

public class EntityMapper {
	
	public static TraineeDTO convertEntityToDto(Trainee tr) {
		return new TraineeDTO(tr.getTraineeId(),tr.getTraineeName(),tr.getTraineeDomain(),tr.getTraineeLocation());
	}
	
	public static Trainee convertDtotoTrainee(TraineeDTO tr) {
		return new Trainee(tr.getTraineeName(),tr.getTraineeDomain(),tr.getTraineeLocation());
	}

}
