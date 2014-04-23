package com.innova4b.Aeropuertos.persistent;

public class EstadoAvion {

	private Long idEstadoAvion;
	private String descripcion;
	
	public EstadoAvion() {
	}

	public EstadoAvion(Long idEstadoAvion, String descripcion) {
		super();
		this.idEstadoAvion = idEstadoAvion;
		this.descripcion = descripcion;
	}

	public Long getIdEstadoAvion() {
		return idEstadoAvion;
	}

	public void setIdEstadoAvion(Long idEstadoAvion) {
		this.idEstadoAvion = idEstadoAvion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Estado Avion: " + this.getIdEstadoAvion() + " Descripcion: "
				+ this.getDescripcion();
	}
	
}
