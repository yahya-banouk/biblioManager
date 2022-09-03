package com.gl.biblio.repository;

import com.gl.biblio.model.Livre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public  interface LivreRepository extends JpaRepository<Livre, Long>{

}
