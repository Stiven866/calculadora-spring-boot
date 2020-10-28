package com.example.calculadora.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculadora.model.Result;


@RestController
@RequestMapping("/calcular") 
public class calculadora {
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/suma")
	public Result calcular(@RequestParam(name="op1") BigDecimal op1, @RequestParam(name="op2") BigDecimal op2) {
		Result res = new Result();
		res.setResultado(String.valueOf(op1.add(op2)));
		return res;
	}
}

