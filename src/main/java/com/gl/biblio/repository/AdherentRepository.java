package com.gl.biblio.repository;

import com.gl.biblio.model.Adherent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public  interface AdherentRepository extends JpaRepository<Adherent, Long> {
	
}
