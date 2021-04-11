package com.consolecode.tiendamusicaldata.dao.impl;

import com.consolecode.tiendamusicaldata.common.CommonDAO;
import com.consolecode.tiendamusicaldata.dao.PersonaDAO;
import com.consolecode.tiendamusicalentities.entities.Persona;

public class PersonaDAOImpl extends CommonDAO<Persona, PersonaDAO> {
	
	public Persona findByUsuarioAndPassword(String usuario, String password) {
		return this.repository.findByUsuarioAndPassword(usuario, password);
	}

}
