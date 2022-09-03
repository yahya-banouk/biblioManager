package com.gl.biblio.repository;

import com.gl.biblio.model.Emprunt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public  interface EmpruntRepository extends JpaRepository<Emprunt, Long>{

}
