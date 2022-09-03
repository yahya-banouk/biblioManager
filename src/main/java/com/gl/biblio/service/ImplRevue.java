package com.gl.biblio.service;

import java.util.List;

import com.gl.biblio.model.Revue;
import com.gl.biblio.repository.RevueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ImplRevue implements IRevueService {
	
	@Autowired
	public RevueRepository revueRepository ;
	
	@Override
	public List<Revue> getAllRevue() {
		
		return revueRepository.findAll();
	}

	@Override
	public Revue getRevue(Long Id) {
		
		return revueRepository.findById(Id).orElse(null);
	}

	@Override
	public void AddRevue(Revue revue) {
		revueRepository.save(revue);
		
	}

	@Override
	public Revue updateRevue(Revue revue, Long Id) {
		
		revueRepository.findById(Id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Revue not found with id : " + Id));
		return revueRepository.save(revue);
	}

	@Override
	public void deleteRevue(Long revueId) {
		revueRepository.deleteById(revueId);
		
	}

}
