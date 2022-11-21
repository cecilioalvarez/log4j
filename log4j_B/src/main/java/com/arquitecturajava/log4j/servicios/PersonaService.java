package com.arquitecturajava.log4j.servicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.arquitecturajava.log4j.repositorios.PersonaRepository;

public class PersonaService {

	
	private static Logger logger= LogManager.getLogger();
	public void buscarTodos() {
		
		logger.trace("hola desde el servicio ");
		logger.debug("hola desde el servicio ");
		logger.info("hola desde el servicio ");
		logger.warn("hola desde el servicio ");
		
		PersonaRepository repo= new PersonaRepository();
		repo.buscarTodos();
		logger.trace("hola desde el servicio ");
		logger.debug("hola desde el servicio ");
		logger.info("hola desde el servicio ");
		logger.warn("hola desde el servicio ");
	}
}
