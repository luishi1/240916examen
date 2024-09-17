package com.examen.demo.service;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

	Random rand= new Random();
		
	public ArrayList<Integer> generador() {
		
		
		ArrayList<Integer> lista  = new ArrayList<Integer>();
		for(int i = 0 ; i < 5 ; i++) {
			lista.add(rand.nextInt(10));
		}
		return lista;
	}
	
}
