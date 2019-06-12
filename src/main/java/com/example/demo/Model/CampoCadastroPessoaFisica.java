package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CampoCadastroPessoaFisica {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@OneToOne(mappedBy = "fisica")
    private FormDinamico formDinamico;
	
	
	boolean pai;
	boolean mae;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setFormDinamico(FormDinamico formDinamico) {
		this.formDinamico = formDinamico;
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
