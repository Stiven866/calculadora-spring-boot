package com.example.calculadora.model;

public class Modulo {
	
	private String modulo;
	
	public void modulo(int op1, int op2) {
		if(op2==0) {
			this.modulo = "Math Error";
		}else {
			setModulo(op1, op2);	
		}
		
	}
	
	public String getModulo() {
		return modulo;
	}

	public void setModulo(int op1, int op2) {
		this.modulo = String.valueOf(op1%op2);;
	}
}
