package com.fercosmig.util;

public class Validacao {

	public boolean isNumeric(String numero) {
		return numero.matches("^-?[0-9]+(\\.[0-9]+)?$");
	}
	
}
