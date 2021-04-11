package com.consolecode.tiendamusicalservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consolecode.tiendamusicaldata.dao.PersonaDAO;
import com.consolecode.tiendamusicalentities.entities.Persona;
import com.consolecode.tiendamusicalservices.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private PersonaDAO personaDAOImpl;

	@Override
	public Persona consultarUsuarioLogin(String usuario, String password) {
		
		return this.personaDAOImpl.findByUsuarioAndPassword(usuario, password);
	}

}
