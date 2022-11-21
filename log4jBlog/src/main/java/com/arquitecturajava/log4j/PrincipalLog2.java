package com.arquitecturajava.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrincipalLog2 {

	public static void main(String[] args) {

		
		Logger milogger= LogManager.getLogger("milogger");
		milogger.trace("hola desde mi logger ");
		milogger.debug("hola desde mi logger ");
		milogger.info("hola desde mi logger ");
		milogger.warn("hola desde mi logger ");
		milogger.error("hola desde mi logger ");
		milogger.fatal("hola desde mi logger ");
		
		System.out.println("*************************");
	
		
	}
}
