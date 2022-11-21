package com.arquitecturajava.log4j.repositorios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonaRepository {
	Logger logger= LogManager.getLogger();
	
	public void buscarTodos() {
		
		logger.trace("hola desde el repo ");
		logger.debug("hola desde el repo ");
		logger.info("hola desde el repo ");
		logger.warn("hola desde el repo ");
		
		logger.error("hola desde el repo ");
		
		logger.trace("hola desde el repo ");
		logger.debug("hola desde el repo ");
		logger.info("hola desde el repo ");
		logger.warn("hola desde el repo ");
		
	}
}
