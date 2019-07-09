package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CampoCadastroPessoaFisica {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	
	boolean pai;
	boolean mae;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public boolean isPai() {
		return pai;
	}
	public void setPai(boolean pai) {
		this.pai = pai;
	}
	public boolean isMae() {
		return mae;
	}
	public void setMae(boolean mae) {
		this.mae = mae;
	}
	
	
	
}
