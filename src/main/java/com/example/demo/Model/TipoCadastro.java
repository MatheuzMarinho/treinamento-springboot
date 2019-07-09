package com.example.demo.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TipoCadastro {
	@Id
	String id;
	String nome;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
	CampoCadastroPessoaFisica fisica;
	
	
	

	public TipoCadastro() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CampoCadastroPessoaFisica getFisica() {
		return fisica;
	}

	public void setFisica(CampoCadastroPessoaFisica fisica) {
		this.fisica = fisica;
	}
	
	
	

}
