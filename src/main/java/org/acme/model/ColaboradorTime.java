package org.acme.model;

public class ColaboradorTime {

	private Integer colaboradorId;
	private Integer timeId;
	
	public ColaboradorTime(Integer colaboradorId, Integer timeId) {
		this.colaboradorId = colaboradorId;
		this.timeId = timeId;
	}
	public Integer getColaboradorId() {
		return colaboradorId;
	}
	public void setColaboradorId(Integer colaboradorId) {
		this.colaboradorId = colaboradorId;
	}
	public Integer getTimeId() {
		return timeId;
	}
	public void setTimeId(Integer timeId) {
		this.timeId = timeId;
	}
	
	
}
