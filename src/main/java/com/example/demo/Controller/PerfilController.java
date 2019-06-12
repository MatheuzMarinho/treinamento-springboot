package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Perfil;
import com.example.demo.Service.PerfilService;

@RestController
@RequestMapping("/perfil")
public class PerfilController {
	
	@Autowired
	PerfilService perfilService;
	
	@GetMapping
	public ResponseEntity<?> getPerfis(){
		
		return perfilService.getPerfis();

	}
	
	@PostMapping
	public ResponseEntity<?> adicionarPerfil(@RequestBody Perfil perfil) {
		
		return perfilService.criarPerfil(perfil);
		
	}

}
