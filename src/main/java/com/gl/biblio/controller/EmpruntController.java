package com.gl.biblio.controller;

import java.util.List;

import javax.validation.Valid;

import com.gl.biblio.model.Emprunt;
import com.gl.biblio.model.Dictionnaire;
import com.gl.biblio.service.IDictionnaireService;
import com.gl.biblio.service.IEmpruntService;

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
public class EmpruntController {
	@Autowired
	public IEmpruntService empruntService;
	 @GetMapping("/emp")
	    public List<Emprunt> getAllEmprunt() {
		 	
	        return empruntService.getAllEmprunt();
	        
}
	 
	 @GetMapping("/emprunt/{empruntId}")
	    public Emprunt getemprunt(@PathVariable Long empruntId) {
	        return empruntService.getEmprunt(empruntId);
	    }
	 
	 
	 @PostMapping("/emprunts")
	    public void addemprunt(@RequestBody @Valid Emprunt emprunt) {
	         empruntService.AddEmprunt(emprunt);
	    }
	 
	 

	    @PutMapping("/emprunts/{empruntId}")
	    public Emprunt updateemprunt(@RequestBody @Valid Emprunt emprunt, @PathVariable Long empruntId) {
	        return empruntService.updateEmprunt(emprunt, empruntId);
	    }
	    
	    

	    @DeleteMapping("/emprunts/{empruntId}")
	    void deleteemprunt(@PathVariable Long empruntId) {
	        empruntService.deleteEmprunt(empruntId);
	    }
}
