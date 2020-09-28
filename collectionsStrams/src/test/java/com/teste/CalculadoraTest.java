package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public final void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc .somar("1+1+3");
		assertEquals(5, soma);
	}

}
