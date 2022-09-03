package com.gl.biblio.repository;

import com.gl.biblio.model.Dictionnaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public  interface DictionnaireRepository extends JpaRepository<Dictionnaire, Long> {

}
