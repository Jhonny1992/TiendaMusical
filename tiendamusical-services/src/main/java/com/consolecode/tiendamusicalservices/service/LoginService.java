package com.consolecode.tiendamusicalservices.service;

import com.consolecode.tiendamusicalentities.entities.Persona;

public interface LoginService {
	
	Persona consultarUsuarioLogin(String usuario, String password);

}
