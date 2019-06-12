package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Valor;
import com.example.demo.Service.ValorService;

@RestController
@RequestMapping("/valor")
public class ValorController {
	
	@Autowired
	ValorService valorService;
	
	@GetMapping
	public ResponseEntity<?> getValores(){
		
		return valorService.getValores();

	}
	
	@PostMapping
	public ResponseEntity<?> adicionarValor(@RequestBody Valor valor) {
		
		return valorService.criarValor(valor);
		
	}

}
