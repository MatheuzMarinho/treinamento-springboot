package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Valor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String valor;
	
	@JsonBackReference
	@ManyToOne
	FormDinamico formDinamico;

	
	public Valor() {}
	public Valor(Long id, String valor) {
		super();
		this.id = id;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	public FormDinamico getFormDinamico() {
		return formDinamico;
	}
	public void setFormDinamico(FormDinamico formDinamico) {
		this.formDinamico = formDinamico;
	}
	
	
	
	
	
	
	
}
