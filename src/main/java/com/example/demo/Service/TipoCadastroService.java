package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Model.TipoCadastro;
import com.example.demo.Repository.TipoCadastroRepository;

@Service
public class TipoCadastroService {
	
	@Autowired
	TipoCadastroRepository tipoCadastroRepository;
	
	public ResponseEntity<?> criarTipoCadastro(TipoCadastro tipoCadastro){
	
		if(tipoCadastroRepository.existsById(tipoCadastro.getNome())) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Tipo já cadastrado!");
		}
		
		tipoCadastroRepository.save(tipoCadastro);
		
		return ResponseEntity.ok().build();
		
	}
	
	public ResponseEntity<?> getTiposCadastro(){
		

		return ResponseEntity.ok(tipoCadastroRepository.findAll());
		
	}

}
