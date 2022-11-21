package com.arquitecturajava.log4j.controllers;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.arquitecturajava.log4j.servicios.PersonaService;

public class PersonaController {

	
	public static void main(String[] args) {
		
		Logger logger= LogManager.getLogger(PersonaController.class);
		logger.trace("hola desde el controller traza");
		logger.debug("hola desde el controller debug");
		logger.info("hola desde el controller info");
		logger.warn("hola desde el controller warn");
		
		PersonaService servicio= new PersonaService();
		servicio.buscarTodos();
		logger.trace("hola desde el controller traza");
		logger.debug("hola desde el controller debug");
		logger.info("hola desde el controller info");
		logger.warn("hola desde el controller warn");
	}
}
