package org.acme.model;

public class ProjetoCompetencia {
	
	private Integer idCompetencia;
	private Integer idProjeto;
	private Integer nivelRequirido;
	
	
	public ProjetoCompetencia() {
	}
	
	public ProjetoCompetencia(Integer idCompetencia, Integer idProjeto, Integer nivelRequirido) {
		this.idCompetencia = idCompetencia;
		this.idProjeto = idProjeto;
		this.nivelRequirido = nivelRequirido;
	}

	public Integer getIdCompetencia() {
		return idCompetencia;
	}
	public void setIdCompetencia(Integer idCompetencia) {
		this.idCompetencia = idCompetencia;
	}
	public Integer getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(Integer idProjeto) {
		this.idProjeto = idProjeto;
	}
	public Integer getNivelRequirido() {
		return nivelRequirido;
	}
	public void setNivelRequirido(Integer nivelRequirido) {
		this.nivelRequirido = nivelRequirido;
	}
	
	
	

}
