package com.innova4b.Aeropuertos.persistent;
public class EstadoPuerta {

	private Long idEstado;
	private String descripcion;

	public EstadoPuerta() {
	}

	public EstadoPuerta(Long idEstado, String descripcion) {
		super();
		this.idEstado = idEstado;
		this.descripcion = descripcion;
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

	@Override
	public String toString() {
		return "Estado Puerta: " + this.getIdEstado() + " Descripcion: "
				+ this.getDescripcion();
	}
}
