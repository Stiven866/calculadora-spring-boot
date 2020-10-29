package com.example.calculadora.model;

public class Suma {
	
	private String suma;
	
	public void suma(int op1, int op2) {
		setSuma(op1,op2);
	}
	
	public String getSuma() {
		return suma;
	}

	public void setSuma(int op1, int op2) {
		this.suma = String.valueOf(op1+op2);
	}
}
