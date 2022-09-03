package com.gl.biblio.controller;


import java.util.List;

import com.gl.biblio.model.Adherent;
import com.gl.biblio.model.Dictionnaire;
import com.gl.biblio.service.IAdherentService;
import com.gl.biblio.service.IDictionnaireService;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin("*" )
@Controller
@RequestMapping(value = "/api")
public class AdherentController {
	@Autowired
	public IAdherentService adherentService ;
	
	@RequestMapping("/")
	public String home(Model model) {
		
		List<Adherent> adherents = (List<Adherent>) adherentService.getAllAdherent();
	    model.addAttribute("adherents", adherents);
		return "home";
	}
	 @GetMapping("/allAdherent")
	    public List<Adherent> getAllAdherent() {
		 	
	        return adherentService.getAllAdherent();
	 }
	 
	 
	 
	 @GetMapping("/adherent/{adherentId}")
	    public Adherent getAdherent(@PathVariable Long adherentId) {
	        return adherentService.getAdherent(adherentId);
	    }
	 
	 
	 @PostMapping("/Adherents")
	    public String  addAdherent(@ModelAttribute("adherent") Adherent adherent) {
	         adherentService.AddAdherent(adherent);
	         return "redirect:/api/";
	         
	    }
	 
	 

	    @PutMapping("/Adherents/{AdherentId}")
	    public Adherent updateAdherent(@RequestBody @Valid Adherent Adherent, @PathVariable Long AdherentId) {
	        return adherentService.updateAdherent(Adherent, AdherentId);
	    }
	    
	    

	    @GetMapping("/Adherents/{AdherentId}")
	    public String deleteAdherent(@PathVariable (value = "AdherentId") long AdherentId) {
	        adherentService.deleteAdherent(AdherentId);
	        return "redirect:/api/";
	    }

	   

	    
	
	
	

}
