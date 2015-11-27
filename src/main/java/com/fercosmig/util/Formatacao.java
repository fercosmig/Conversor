package com.fercosmig.util;

import java.text.NumberFormat;

public class Formatacao {

	public Double fDecimal(Double valor, int digitos) {

		// Locale local = new Locale("pt", "BR");
		// NumberFormat nf = NumberFormat.getInstance(local);

		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(digitos);
		return Double.parseDouble(nf.format(valor));

	}

	public Formatacao() {
	}

}
