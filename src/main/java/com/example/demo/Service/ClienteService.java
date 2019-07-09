package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Cliente;
import com.example.demo.Repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public ResponseEntity<?> criarCliente(Cliente cliente){
	
		if(clienteRepository.existsById(cliente.getNome())) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Usuário já cadastrado!");
		}
		
		clienteRepository.save(cliente);
		
		return ResponseEntity.ok().build();
		
	}
	
	public ResponseEntity<?> getClientes(){
		
		return ResponseEntity.ok(clienteRepository.findAll());
		
	}
	
	public ResponseEntity<?> getClientesByNome(String nome){
		if(! clienteRepository.existsById(nome)) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Usuário não cadastrado!");
		}
		
		return ResponseEntity.ok(clienteRepository.findById(nome));
		
	}
	
	public ResponseEntity<?> getClientesByTipo(int tipo){
		
		return ResponseEntity.ok(clienteRepository.findByTipo(tipo));
		
	}
	
	public ResponseEntity<?> getClientesByTipoAndObservacao(int tipo, String observacao){
		
		return ResponseEntity.ok(clienteRepository.findByTipoAndObservacaoContaining(tipo, observacao));
		
	}
	
	public ResponseEntity<?> countByInativo(boolean inativo){
		
		return ResponseEntity.ok(clienteRepository.countByInativo(inativo));
		
	}
	
	public ResponseEntity<?> getAtivosGenero(int genero){
		
		return ResponseEntity.ok(clienteRepository.findAtivosGenero(genero));
		
	}
	
	public ResponseEntity<?> atualizarCliente(Cliente cliente){
		
		if(! clienteRepository.existsById(cliente.getNome())) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Usuário não cadastrado!");
		}
		
		clienteRepository.save(cliente);
		return ResponseEntity.ok().build();
	}
	
	public ResponseEntity<?> apagarCliente(String nome){
		
		if(! clienteRepository.existsById(nome)) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Usuário não cadastrado!");
		}
		
		clienteRepository.deleteById(nome);
		return ResponseEntity.ok().build();
	}

}
