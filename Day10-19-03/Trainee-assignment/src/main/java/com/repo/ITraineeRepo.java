package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Trainee;

@Repository
public interface ITraineeRepo extends JpaRepository<Trainee, Integer>{
	
	public List<Trainee> findByTraineeName(String name);
	
	public List<Trainee> findByTraineeDomain(String domain);
	
	public List<Trainee> findByTraineeLocation(String location);

}
