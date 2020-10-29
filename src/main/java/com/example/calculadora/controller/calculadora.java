package com.example.calculadora.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculadora.model.Dividir;
import com.example.calculadora.model.Modulo;
import com.example.calculadora.model.Multiplicar;
import com.example.calculadora.model.Resta;
import com.example.calculadora.model.Suma;



@RestController

@RequestMapping("/calcular") 
public class calculadora {
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/suma")
	public Suma suma(@RequestParam(name="op1") int op1, @RequestParam(name="op2") int op2) {
		Suma result = new Suma(); 
		result.suma(op1, op2);
		return result;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/resta")
	public Resta resta(@RequestParam(name="op1") int op1, @RequestParam(name="op2") int op2) {
		Resta res = new Resta();
		res.setResta(op1, op2);
		return res;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/multiplicar")
	public Multiplicar multiplicar(@RequestParam(name="op1") int op1, @RequestParam(name="op2") int op2) {
		Multiplicar mult = new Multiplicar();
		mult.setMultiplicar(op1,op2);
		return mult;
	}
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/dividir")
	public Dividir dividir(@RequestParam(name="op1") int op1, @RequestParam(name="op2") int op2) {
		Dividir div = new Dividir();
			div.dividir(op1, op2); 
			return div;
		
	}
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/modulo")
	public Modulo modulo(@RequestParam(name="op1") int op1, @RequestParam(name="op2") int op2) {
		Modulo mod = new Modulo();
			mod.modulo(op1, op2); 
			return mod;
		
	}
}

