package com.gl.biblio.service;

import java.util.List;
import com.gl.biblio.model.Dictionnaire;
import com.gl.biblio.repository.DictionnaireRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ImplDictionnaire implements IDictionnaireService {
	@Autowired
	public DictionnaireRepository dictionnaireRepository;

	
	@Override
	public Dictionnaire getDictionnaire(Long Id) {
		
		return dictionnaireRepository.findById(Id).orElse(null);
	}

	@Override
	public void addDictionnaire(Dictionnaire dictionnaire) {
		dictionnaireRepository.save(dictionnaire);
		
	}

	@Override
	public Dictionnaire updateDictionnaire(Dictionnaire dictionnaire, Long Id) {
		dictionnaireRepository.findById(Id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Livre not found with id : " + Id));
		return dictionnaireRepository.save(dictionnaire);
		
	}

	@Override
	public void deleteDictionnaire(Long dictionnaireId) {
		dictionnaireRepository.deleteById(dictionnaireId);
		
	}

	@Override
	public List<Dictionnaire> getAllDictionnaire() {
		
		return dictionnaireRepository.findAll();
	}

}
