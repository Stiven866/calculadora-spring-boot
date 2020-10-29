package com.example.calculadora.test;

import org.junit.jupiter.api.Test;

import com.example.calculadora.model.Dividir;
import com.example.calculadora.model.Modulo;
import com.example.calculadora.model.Multiplicar;
import com.example.calculadora.model.Resta;
import com.example.calculadora.model.Suma;

import junit.framework.TestCase;


class TestCalculadora extends TestCase {
	
	private Suma sum = new Suma();
	private Resta res = new Resta();
	private Multiplicar mult = new Multiplicar();
	private Dividir div = new Dividir();
	private Modulo mod = new Modulo();
	
	/**************Test Suma**************/
	@Test
	void resultadoSuma() {
		sum.suma(2, 2);
		assertEquals("4", sum.getSuma());
	}
	
	
	/**************Test Resta**************/
	@Test
	void resultadoResta() {
		res.resta(7, 4);
		assertEquals("3", res.getResta());
	}
	
	/**************Test Multiplicación**************/
	@Test 
	void resultadoMultiplicar() {
		mult.multiplicar(325, 3);
		assertEquals("975", mult.getMultiplicar());
	}
	
	

	@Test 
	void resultadoMultiplicarPorCero() {
		mult.multiplicar(325, 0);
		assertEquals("0", mult.getMultiplicar());
	}
	
	/**************Test Division**************/	
	@Test
	void resultadoDividir() {
		div.dividir(90,5);
		assertEquals("18", div.getDividir());
	}
	

	@Test
	void resultadoDividirPorCero() {
		div.dividir(90,0);
		assertEquals("Math Error", div.getDividir());
	}
	
	/**************Test Módulo**************/
	@Test 
	void resultadoModulo() {
		mod.modulo(25,2);
		assertEquals("1", mod.getModulo());
	}
	@Test 
	void resultadoModuloPor0() {
		mod.modulo(25,0);
		assertEquals("Math Error", mod.getModulo());
	}
	
	

}
