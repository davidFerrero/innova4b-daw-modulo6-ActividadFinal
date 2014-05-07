package com.innova4b.Aeropuertos.persistent;
public class EstadoPuerta {

	private Long idEstado;
	private String descripcion;
	private int disponible;

	public EstadoPuerta() {
	}

	public EstadoPuerta(Long idEstado, String descripcion, int disponible) {
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

	public int getDisponible() {
		return disponible;
	}

	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Estado Puerta: " + this.getIdEstado() + " Descripcion: "
				+ this.getDescripcion();
	}
}
