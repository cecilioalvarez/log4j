package com.arquitecturajava.log4j.repositorios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonaRepository {
	Logger logger= LogManager.getLogger();
	
	public void buscarTodos() {
		
		logger.trace("hola desde el repo traza");
		logger.debug("hola desde el repo debug");
		logger.info("hola desde el repo info");
		logger.warn("hola desde el repo warn");
		
		logger.error("hola desde el repo ERROR");
		
		logger.trace("hola desde el repo traza");
		logger.debug("hola desde el repo debug");
		logger.info("hola desde el repo info");
		logger.warn("hola desde el repo warn");
		
	}
}
