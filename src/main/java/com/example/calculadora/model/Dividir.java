package com.example.calculadora.model;

public class Dividir {
	
	private String dividir; 
	
	public void dividir(int op1,int op2) {
		if(op2==0) {
			this.dividir = "Math Error";
		}else {
			setDividir(op1,op2);
		}
		
	}
	
	public String getDividir() {
		return dividir;
	}

	public void setDividir(int op1, int op2) {
		this.dividir = String.valueOf(op1/op2);
	}
}
