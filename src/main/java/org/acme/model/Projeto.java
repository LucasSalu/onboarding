package org.acme.model;

public class Projeto {
	
	private Integer id;
	private Integer idTime;
	private Integer idProjeto;
	
	public Projeto() {
	}

	public Projeto(Integer id, Integer idTime, Integer idProjeto) {
		this.id = id;
		this.idTime = idTime;
		this.idProjeto = idProjeto;
	}	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdTime() {
		return idTime;
	}
	public void setIdTime(Integer idTime) {
		this.idTime = idTime;
	}
	public Integer getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(Integer idProjeto) {
		this.idProjeto = idProjeto;
	}

}
