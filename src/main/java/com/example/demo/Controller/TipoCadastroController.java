package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.TipoCadastro;
import com.example.demo.Service.TipoCadastroService;

@CrossOrigin
@RestController
@RequestMapping("/tipocadastro")
public class TipoCadastroController {
	
	@Autowired
	TipoCadastroService tipoCadastroService;
	
	
	@GetMapping
	public ResponseEntity<?> getClientes(){
		
		return tipoCadastroService.getTiposCadastro();

	}
	
	@PostMapping
	public ResponseEntity<?> adicionarTipoCadastro(@RequestBody TipoCadastro tipoCadastro) {
		
		return tipoCadastroService.criarTipoCadastro(tipoCadastro);
		
	}

}
