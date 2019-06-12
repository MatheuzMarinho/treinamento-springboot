package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Perfil;
import com.example.demo.Repository.PerfilRepository;


@Service
public class PerfilService {
	
	@Autowired
	PerfilRepository perfilRepository;
	
	public ResponseEntity<?> criarPerfil(Perfil perfil){
		
		perfilRepository.save(perfil);
		
		return ResponseEntity.ok().build();
		
	}
	
	public ResponseEntity<?> getPerfis(){
		
		return ResponseEntity.ok(perfilRepository.findAll());
		
	}

}
