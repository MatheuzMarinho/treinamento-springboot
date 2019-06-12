package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Usuario {
	
	@Id
	String usuario;
	
	String senha;
	
	@ManyToMany
    @JoinTable(name="usuario_perfil", joinColumns=
    {@JoinColumn(name="usuario_usuario")}, inverseJoinColumns=
      {@JoinColumn(name="perfil_perfil")})
    private List<Perfil> perfils;
	
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Perfil> getPerfils() {
		return perfils;
	}

	public void setPerfils(List<Perfil> perfils) {
		this.perfils = perfils;
	}
	
	

	
	
}
