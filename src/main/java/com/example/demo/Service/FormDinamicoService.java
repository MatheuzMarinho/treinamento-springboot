package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Model.FormDinamico;
import com.example.demo.Repository.FormDinamicoRepository;

@Service
public class FormDinamicoService {
	@Autowired
	FormDinamicoRepository formDinamicoRepository;
	
	public ResponseEntity<?> criarFormDinamico(FormDinamico formDinamico){
		
		formDinamicoRepository.save(formDinamico);
		
		return ResponseEntity.ok().build();
		
	}
	
	public ResponseEntity<?> getFormDinamicos(){
		
		return ResponseEntity.ok(formDinamicoRepository.findAll());
		
	}
	
}
