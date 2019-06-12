package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Usuario;
import com.example.demo.Repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public ResponseEntity<?> criarUsuario(Usuario usuario){
		
		usuarioRepository.save(usuario);
		
		return ResponseEntity.ok().build();
		
	}
	
	public ResponseEntity<?> getUsuarios(){
		
		return ResponseEntity.ok(usuarioRepository.findAll());
		
	}
}
