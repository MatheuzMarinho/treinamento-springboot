package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Cliente;
import com.example.demo.Service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	
	@GetMapping
	public ResponseEntity<?> getODT(){
		
		return clienteService.getClientes();

	}
	
	@PostMapping
	public ResponseEntity<?> adicionarCliente(@RequestBody Cliente cliente) {
		
		return clienteService.criarCliente(cliente);
		
	}
	
	@PutMapping
	public ResponseEntity<?> atualizarCliente(@RequestBody Cliente cliente) {
		
		return clienteService.atualizarCliente(cliente);
		
	}
	
	@DeleteMapping("/apagar/{nome}")
	public ResponseEntity<?> apagarCliente(@PathVariable String nome) {
		
		return clienteService.apagarCliente(nome);
		
	}
		

}
