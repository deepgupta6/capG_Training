package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dto.EntityMapper;
import com.dto.TraineeDTO;
import com.entity.Trainee;
import com.repo.ITraineeRepo;

@Service
public class TraineeService implements ITraineeService{
	private final ITraineeRepo repo;
	
	public TraineeService(ITraineeRepo repo) {
		this.repo = repo;
	}

	@Override
	public List<TraineeDTO> getAllTrainee() {
		
		return repo.findAll().stream().map(e->{
			return EntityMapper.convertEntityToDto(e);
		}).toList();
	}

	@Override
	public List<TraineeDTO> getTraineeByName(String name) {
		return repo.findByTraineeName(name).stream().map(e->{
			return EntityMapper.convertEntityToDto(e);
		}).toList();
	}

	@Override
	public TraineeDTO getTraineeById(int id) {
		
		return EntityMapper.convertEntityToDto(repo.findById(id).get());
	}

	@Override
	public String deleteTrainee(int id) {
		if(getTraineeById(id)!=null) {
			repo.deleteById(id);
			return "Trainee Deleted";
		} else {
			return "Invalid Id";
		}
	}

	@Override
	public TraineeDTO insertTrainee(TraineeDTO tr) {
		
		return EntityMapper.convertEntityToDto(repo.save(EntityMapper.convertDtotoTrainee(tr)));
	}

	@Override
	public TraineeDTO updateTrainee(TraineeDTO tr) {
		Trainee t = repo.findById(tr.getTraineeId()).get();
		if(tr.getTraineeName()!=null) {
			t.setTraineeName(tr.getTraineeName());
		}
		if(tr.getTraineeDomain()!=null) {
			t.setTraineeDomain(tr.getTraineeDomain());
		}
		if(tr.getTraineeLocation()!=null) {
			t.setTraineeLocation(tr.getTraineeLocation());
		}
		t.setTraineeId(tr.getTraineeId());
		return EntityMapper.convertEntityToDto(repo.saveAndFlush(t));
	}

	@Override
	public List<TraineeDTO> getTraineeByDomain(String domain) {
		
		return repo.findByTraineeDomain(domain).stream().map(e->{
			return EntityMapper.convertEntityToDto(e);
		}).toList();
	}

	@Override
	public List<TraineeDTO> getTraineeByLocation(String location) {
		
		return repo.findByTraineeLocation(location).stream().map(e->{
			return EntityMapper.convertEntityToDto(e);
		}).toList();
	}

}
