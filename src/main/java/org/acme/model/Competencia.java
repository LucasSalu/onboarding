package org.acme.model;

public class Competencia {

	private Integer id;
	private String nome;
	private String grupo;
	

	public Competencia() {
	}

	public Competencia(Integer id, String nome, String grupo) {
		this.id = id;
		this.nome = nome;
		this.grupo = grupo;
	}	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	
}
