package com.example.calculadora.model;

public class Resta {
	private String resta;
	
	public void resta(int op1, int op2) {
		setResta(op1,op2);
	}
	
	public String getResta() {
		return resta;
	}

	public void setResta(int op1, int op2) {
		this.resta = String.valueOf(op1-op2);
	}
}
