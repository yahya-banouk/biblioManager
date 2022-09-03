package com.gl.biblio.repository;

import com.gl.biblio.model.Revue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public  interface RevueRepository extends JpaRepository<Revue, Long>{

}
