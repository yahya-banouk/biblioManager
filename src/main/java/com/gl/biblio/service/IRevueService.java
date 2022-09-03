package com.gl.biblio.service;

import java.util.List;

import com.gl.biblio.model.Revue;

public interface IRevueService {

public List<Revue> getAllRevue();
	
	public Revue getRevue(Long Id);
	
	public void AddRevue(Revue revue);
	
	public Revue updateRevue(Revue revue , Long Id);
	
	public void deleteRevue(Long revueId);
}
