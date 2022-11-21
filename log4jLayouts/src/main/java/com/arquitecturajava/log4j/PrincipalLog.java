package com.arquitecturajava.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrincipalLog {

	public static void main(String[] args) {
		// esta es una buena pregunta
		// lo que pasa es que un sistema de log no tiene activas
		// todos los niveles de traza por defecto
		
		Logger milogger= LogManager.getLogger("milogger");
		milogger.trace("hola desde mi logger traza");
		milogger.debug("hola desde mi logger debug");
		milogger.info("hola desde mi logger info");
		milogger.warn("hola desde mi logger warn");
		milogger.error("hola desde mi logger error");
		milogger.fatal("hola desde mi logger fatal");
		
		System.out.println("*************************");
		Logger milogger2= LogManager.getLogger("milogger2");
		milogger2.trace("---hola desde mi logger traza");
		milogger2.debug("---hola desde mi logger debug");
		milogger2.info("---hola desde mi logger info");
		milogger2.warn("---hola desde mi logger warn");
		milogger2.error("---hola desde mi logger error");
		milogger2.fatal("---hola desde mi logger fatal");
		
	}
}
