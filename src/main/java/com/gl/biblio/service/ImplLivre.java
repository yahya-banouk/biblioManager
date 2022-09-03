package com.gl.biblio.service;

import java.util.List;

import com.gl.biblio.model.Livre;
import com.gl.biblio.repository.LivreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ImplLivre implements ILivreService {
	
	@Autowired
	public LivreRepository livreRepository;
	
	@Override
	public List<Livre> getAllLivre() {
		
		return livreRepository.findAll();
	}

	@Override
	public Livre getLivre(Long Id) {
		
		return livreRepository.findById(Id).orElse(null);
	}

	@Override
	public void AddLivre(Livre livre) {
		livreRepository.save(livre);
		
	}

	@Override
	public Livre updateLivre(Livre livre, Long Id) {
		
		livreRepository.findById(Id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Livre not found with id : " + Id));
		return livreRepository.save(livre);
	}

	@Override
	public void deleteLivre(Long livreId) {
		livreRepository.deleteById(livreId);
		
	}

}
