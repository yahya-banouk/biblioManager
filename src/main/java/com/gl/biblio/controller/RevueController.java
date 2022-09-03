package com.gl.biblio.controller;

import java.util.List;

import javax.validation.Valid;

import com.gl.biblio.model.Revue;
import com.gl.biblio.service.IRevueService;

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
public class RevueController {
	@Autowired
	public IRevueService revueService;
	 @GetMapping("/rev")
	    public List<Revue> getAllRevue() {
		 	
	        return revueService.getAllRevue();
}
	 
	 @GetMapping("/revue/{revueId}")
	    public Revue getAdherent(@PathVariable Long adherentId) {
	        return revueService.getRevue(adherentId);
	    }
	 
	 
	 @PostMapping("/Revue")
	    public void addAdherent(@RequestBody @Valid Revue revue) {
	         revueService.AddRevue(revue);
	    }
	 
	 

	    @PutMapping("/Revue/{RevueId}")
	    public Revue updateAdherent(@RequestBody @Valid Revue revue, @PathVariable Long revueId) {
	        return revueService.updateRevue(revue, revueId);
	    }
	    
	    

	    @DeleteMapping("/Revues/{RevueId}")
	    void deleteRevue(@PathVariable Long RevueId) {
	        revueService.deleteRevue(RevueId);
	    }
}
