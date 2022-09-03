package com.gl.biblio.service;

import java.util.List;

import com.gl.biblio.model.Adherent;

public interface IAdherentService {
	
	
	public List<Adherent> getAllAdherent();
	 
	public Adherent getAdherent(Long Id);
	
	public void AddAdherent(Adherent adherent);
	
	public Adherent updateAdherent(Adherent adherent , Long Id);
	
	public void deleteAdherent(long id);
}
