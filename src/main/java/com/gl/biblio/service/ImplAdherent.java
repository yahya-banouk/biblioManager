package com.gl.biblio.service;

import java.util.List;

import com.gl.biblio.model.Adherent;
import com.gl.biblio.repository.AdherentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ImplAdherent implements IAdherentService {
	
	@Autowired
	public AdherentRepository adherentRepository ;
	
	@Override
	public List<Adherent> getAllAdherent() {
		return adherentRepository.findAll();
		}
	
	
	@Override
	public Adherent getAdherent(Long Id) {
		
		return adherentRepository.findById( Id).orElse(null);
	}

	@Override
	public void AddAdherent(Adherent adherent) {
		adherentRepository.save(adherent);
		
	}

	@Override
	public Adherent updateAdherent(Adherent adherent, Long Id) {
		
		adherentRepository.findById(Id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Adherent not found with id : " + Id));
		return adherentRepository.save(adherent);
	}

	@Override
	public void deleteAdherent(long id) {
		adherentRepository.deleteById(id);
		
	}
	
	
}
