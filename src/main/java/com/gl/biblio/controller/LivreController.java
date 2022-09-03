package com.gl.biblio.controller;

import java.util.List;

import javax.validation.Valid;

import com.gl.biblio.model.Livre;
import com.gl.biblio.model.Dictionnaire;
import com.gl.biblio.model.Livre;
import com.gl.biblio.service.IDictionnaireService;
import com.gl.biblio.service.ILivreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*" )
@RestController
@RequestMapping(value = "/api")
public class LivreController {
	@Autowired
	public ILivreService livreService;
	 @GetMapping("/liv")
	    public List<Livre> getAllLivre() {
		 	
	        return livreService.getAllLivre();
}
	 
	 @GetMapping("/livre/{livreId}")
	    public Livre getlivre(@PathVariable Long livreId) {
	        return livreService.getLivre(livreId);
	    }
	 
	 
	 @PostMapping("/livres")
	    public void addlivre(@RequestBody @Valid Livre livre) {
	         livreService.AddLivre(livre);
	    }
	 
	 

	    @PutMapping("/livres/{livreId}")
	    public Livre updatelivre(@RequestBody @Valid Livre livre, @PathVariable Long livreId) {
	        return livreService.updateLivre(livre, livreId);
	    }
	    
	    

	    @DeleteMapping("/livres/{livreId}")
	    void deletelivre(@PathVariable Long livreId) {
	        livreService.deleteLivre(livreId);
	    }
}
