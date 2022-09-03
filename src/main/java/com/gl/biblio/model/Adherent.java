package com.gl.biblio.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adherent {
	
	@Id
	public long id;
	
	public String nom;
	public String prenom;
	public String cin;
	public Date date;
	

}
