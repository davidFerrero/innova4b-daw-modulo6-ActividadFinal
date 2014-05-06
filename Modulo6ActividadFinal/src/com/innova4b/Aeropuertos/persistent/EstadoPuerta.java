package com.innova4b.Aeropuertos.persistent;
public class EstadoPuerta {

	private Long idEstado;
	private String descripcion;
	private boolean disponible;

	public EstadoPuerta() {
	}

	public EstadoPuerta(Long idEstado, String descripcion, boolean disponible) {
		super();
		this.idEstado = idEstado;
		this.descripcion = descripcion;
		this.disponible = disponible;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Estado Puerta: " + this.getIdEstado() + " Descripcion: "
				+ this.getDescripcion();
	}
}
