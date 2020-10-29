package com.example.calculadora.model;

public class Multiplicar {
	
	private String multiplicar;
	
	public void multiplicar(int op1, int op2) {
		setMultiplicar(op1,op2);
	}
	
	public String getMultiplicar() {
		return multiplicar;
	}

	public void setMultiplicar(int op1, int op2) {
		this.multiplicar = String.valueOf(op1*op2);
	}
}
