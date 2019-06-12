package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.FormDinamico;
import com.example.demo.Service.FormDinamicoService;

@RestController
@RequestMapping("/formdinamico")
public class FormDinamicoController {
	

	@Autowired
	FormDinamicoService formDinamicoService;
	
	@GetMapping
	public ResponseEntity<?> getFormDinamicos(){
		
		return formDinamicoService.getFormDinamicos();

	}
	
	@PostMapping
	public ResponseEntity<?> adicionarFormDinamico(@RequestBody FormDinamico formDinamico) {
		
		return formDinamicoService.criarFormDinamico(formDinamico);
		
	}
}
