package com.gl.biblio.service;

import java.util.List;

import com.gl.biblio.model.Dictionnaire;

public interface IDictionnaireService {

public List<Dictionnaire> getAllDictionnaire();
	
	public Dictionnaire getDictionnaire(Long Id);
	
	public void addDictionnaire(Dictionnaire dictionnaire);
	
	public Dictionnaire updateDictionnaire(Dictionnaire dictionnaire , Long Id);
	
	public void deleteDictionnaire(Long dictionnaireId);
}
