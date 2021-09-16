package org.acme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "colaborador")
public class Colaborador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcolaborador;

	@Column(name = "nome", nullable = false)
	@Size(max = 45)
	@NotBlank
	private String nome;

	@Column(name = "matricula", nullable = false)
	@Size(max = 45)
	@NotBlank
	private String matricula;
	
	public Colaborador() {
		
	}
	
	public Colaborador(Integer idcolaborador,String nome, String matricula ) {
		this.idcolaborador =idcolaborador;
		this.nome = nome;
		this.matricula = matricula;
	}

	public Integer getIdcolaborador() {
		return idcolaborador;
	}

	public void setIdcolaborador(Integer idcolaborador) {
		this.idcolaborador = idcolaborador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}

