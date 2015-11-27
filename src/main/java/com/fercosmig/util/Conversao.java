package com.fercosmig.util;

public class Conversao {

	private Formatacao f = new Formatacao();

	public Double milhasParaQuilometros(Double valor) {
		Double retorno = valor / 0.62137;
		return f.fDecimal(retorno, 5);
	}

	public Double quilometrosParaMilhas(Double valor) {
		Double retorno = valor * 0.62137;
		return f.fDecimal(retorno, 5);
	}

	public Double celciusParaFahrenheit(Double valor) {
		Double retorno = (valor * 1.8000) + 32.00;
		return f.fDecimal(retorno, 5);
	}

	public Double fahrenheitParaCelcius(Double valor) {
		Double retorno = (valor - 32.00) / 1.8000;
		return f.fDecimal(retorno, 5);
	}

	public Conversao() {
	}

}
