package com.consolecode.tiendamusicaldata.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

//E: ENTIDAD A UTIZAIR
//R: REPOSITORY

public class CommonDAO<E,R extends PagingAndSortingRepository<E, Long>>  {
	
	@Autowired
	protected R repository;
	
	public List<E> consultarListaPaginable(int desde, int hasta, String orderBy) {
		/**
		 * Metodo que permite consultar una lista de datos paginable de una entidad.
		 */
		
		
		Pageable pageable = PageRequest.of(desde, hasta, Sort.by(orderBy));
		Page<E> page = this.repository.findAll(pageable);
		return page.getContent();
		
	}
	
	public E guardar(E e) {
		return this.repository.save(e);
	}
	
	public E actualizar(E e) {
		return this.repository.save(e);
	}
	
	public void eliminar(E e) {
		this.repository.delete(e);
	}

}
