package com.arquitecturajava.log4j.servicios;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.arquitecturajava.log4j.repositorios.PersonaRepository;

public class PersonaService {

	
	private static Logger logger= LogManager.getLogger(PersonaService.class);
	public void buscarTodos() {
		
		logger.trace("hola desde el servicio traza");
		logger.debug("hola desde el servicio debug");
		logger.info("hola desde el servicio info");
		logger.warn("hola desde el servicio warn");
		
		PersonaRepository repo= new PersonaRepository();
		repo.buscarTodos();
		logger.trace("hola desde el servicio traza");
		logger.debug("hola desde el servicio debug");
		logger.info("hola desde el servicio info");
		logger.warn("hola desde el servicio warn");
	}
}
