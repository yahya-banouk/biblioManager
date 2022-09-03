package com.gl.biblio.service;

import java.util.List;

import com.gl.biblio.model.Livre;

public interface ILivreService {

public List<Livre> getAllLivre();
	
	public Livre getLivre(Long Id);
	
	public void AddLivre(Livre livre);
	
	public Livre updateLivre(Livre livre , Long Id);
	
	public void deleteLivre(Long livreId);
}
