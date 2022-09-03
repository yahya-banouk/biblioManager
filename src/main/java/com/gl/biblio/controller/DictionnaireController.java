package com.gl.biblio.controller;

import java.util.List;

import javax.validation.Valid;

import com.gl.biblio.model.Dictionnaire;
import com.gl.biblio.model.Dictionnaire;
import com.gl.biblio.service.IDictionnaireService;

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
public class DictionnaireController {
	@Autowired
	public IDictionnaireService dictionnaireService;
	 @GetMapping("/dic")
	    public List<Dictionnaire> getAllDictionnaire() {
		 	
	        return dictionnaireService.getAllDictionnaire();
	    }
	 
	 
	 @GetMapping("/dictionnaire/{dictionnaireId}")
	    public Dictionnaire getDictionnaire(@PathVariable Long dictionnaireId) {
	        return dictionnaireService.getDictionnaire(dictionnaireId);
	    }
	 
	 
	 @PostMapping("/Dictionnaires")
	    public void addDictionnaire(@RequestBody @Valid Dictionnaire Dictionnaire) {
	         dictionnaireService.addDictionnaire(Dictionnaire);
	    }
	 
	 

	    @PutMapping("/Dictionnaires/{DictionnaireId}")
	    public Dictionnaire updateDictionnaire(@RequestBody @Valid Dictionnaire Dictionnaire, @PathVariable Long DictionnaireId) {
	        return dictionnaireService.updateDictionnaire(Dictionnaire, DictionnaireId);
	    }
	    
	    

	    @DeleteMapping("/Dictionnaires/{DictionnaireId}")
	    void deleteDictionnaire(@PathVariable Long DictionnaireId) {
	        dictionnaireService.deleteDictionnaire(DictionnaireId);
	    }

}
