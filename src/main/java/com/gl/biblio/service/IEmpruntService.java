package com.gl.biblio.service;

import java.util.List;

import com.gl.biblio.model.Emprunt;

public interface IEmpruntService {

public List<Emprunt> getAllEmprunt();
	
	public Emprunt getEmprunt(Long Id);
	
	public void AddEmprunt(Emprunt emprunt);
	
	public Emprunt updateEmprunt(Emprunt emprunt , Long Id);
	
	public void deleteEmprunt(Long empruntId);
}
