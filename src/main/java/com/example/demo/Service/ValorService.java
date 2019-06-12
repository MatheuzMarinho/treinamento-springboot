package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Valor;
import com.example.demo.Repository.ValorRepository;

@Service
public class ValorService {
	@Autowired
	ValorRepository valorRepository;
	
	public ResponseEntity<?> criarValor(Valor valor){
		
		valorRepository.save(valor);
		
		return ResponseEntity.ok().build();
		
	}
	
	public ResponseEntity<?> getValores(){
		
		return ResponseEntity.ok(valorRepository.findAll());
		
	}
}
