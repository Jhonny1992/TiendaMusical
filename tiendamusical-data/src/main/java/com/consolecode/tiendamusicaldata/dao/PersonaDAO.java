package com.consolecode.tiendamusicaldata.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.consolecode.tiendamusicalentities.entities.Persona;

public interface PersonaDAO extends PagingAndSortingRepository<Persona, Long>{
	
	@Query("SELECT p FROM Persona p WHERE p.usuario = :usuario AND p.password = :password")
	Persona findByUsuarioAndPassword(@Param ("usuario")String usuario,@Param ("password")String password);

}
