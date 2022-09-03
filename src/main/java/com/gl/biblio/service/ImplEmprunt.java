package com.gl.biblio.service;

import java.util.List;

import com.gl.biblio.model.Emprunt;
import com.gl.biblio.repository.EmpruntRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ImplEmprunt implements IEmpruntService {
	
	@Autowired
	public EmpruntRepository empruntRepository;

	@Override
	public List<Emprunt> getAllEmprunt() {
		
		return empruntRepository.findAll();
	}

	@Override
	public Emprunt getEmprunt(Long Id) {
		
		return empruntRepository.findById(Id).orElse(null);
	}

	@Override
	public void AddEmprunt(Emprunt emprunt) {

		empruntRepository.save(emprunt);
		
	}

	@Override
	public Emprunt updateEmprunt(Emprunt emprunt, Long Id) {
		
		empruntRepository.findById(Id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Livre not found with id : " + Id));
		return empruntRepository.save(emprunt);
	}

	@Override
	public void deleteEmprunt(Long empruntId) {
		empruntRepository.deleteById(empruntId);
		
	}

}
