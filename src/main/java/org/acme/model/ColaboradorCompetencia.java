package org.acme.model;

public class ColaboradorCompetencia {
	
	private Integer id;
	private Integer idColaborador;
	private Integer idCompetencia;
	private Integer nivel;
	
	
	public ColaboradorCompetencia() {
	}

	public ColaboradorCompetencia(Integer id, Integer idColaborador, Integer idCompetencia, Integer nivel) {
		this.id = id;
		this.idColaborador = idColaborador;
		this.idCompetencia = idCompetencia;
		this.nivel = nivel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}

	public Integer getIdCompetencia() {
		return idCompetencia;
	}

	public void setIdCompetencia(Integer idCompetencia) {
		this.idCompetencia = idCompetencia;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
	
	
	
	

}
