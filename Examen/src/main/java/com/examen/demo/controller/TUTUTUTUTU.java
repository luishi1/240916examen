package com.examen.demo.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen.demo.service.NumberService;


@RestController
@RequestMapping("/examen")
public class TUTUTUTUTU {

	@Autowired
	public NumberService numberservice;
	
	@GetMapping("")
	public String home() {
		return "Omar algo anda mal";
	}
	
	@GetMapping("/generar")
	public  ArrayList<Integer> hdasdadsadome() {
		return numberservice.generador();
	}
	
	@GetMapping("/comparar")
	public String comparar(
			@RequestParam int id
			) {
		ArrayList<Integer> lista = numberservice.generador();
		Boolean contiene = lista.contains(id);
		if(contiene) {
			return "Lista: " + lista.toString() + " ID: " + id + " si";  
		}
		else {
			return "Lista: " + lista.toString() + " ID: " + id + " no";
		}
		
	}
	
	
}
