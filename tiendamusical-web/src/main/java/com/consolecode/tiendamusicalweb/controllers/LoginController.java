package com.consolecode.tiendamusicalweb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.consolecode.tiendamusicalentities.entities.Persona;
import com.consolecode.tiendamusicalservices.service.LoginService;
import com.consolecode.tiendamusicalweb.utils.CommonUtils;

@ManagedBean
@ViewScoped
public class LoginController {

	private String usuario;
	
	private String password;
	
	//Propiedad de la logica de negocio inyectada con JSF y Spring.
	@ManagedProperty("#{loginServiceImpl}")
	private LoginService loginServiceImpl;
	
	@PostConstruct
	public void init() {
		System.out.println("Inicializando Login");
	}
	
	//Metodo que permite a la persona ingresar a su pantalla de home.
	public void entrar() {
		
		Persona personaConsultada = this.loginServiceImpl.consultarUsuarioLogin(this.usuario,this.password);		
		if(personaConsultada != null) {
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "¡Exitoso!", "Bienvenido");
		}else {
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "¡Ups!", "El usuario y/o contraseña son incorrectos");
		}
	}
	
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the loginServiceImpl
	 */
	public LoginService getLoginServiceImpl() {
		return loginServiceImpl;
	}

	/**
	 * @param loginServiceImpl the loginServiceImpl to set
	 */
	public void setLoginServiceImpl(LoginService loginServiceImpl) {
		this.loginServiceImpl = loginServiceImpl;
	}
	
	
}
