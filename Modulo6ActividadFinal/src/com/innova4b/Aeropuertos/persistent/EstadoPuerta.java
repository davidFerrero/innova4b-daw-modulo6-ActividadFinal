package com.innova4b.Aeropuertos.persistent;
public class EstadoPuerta {

	private Long idEstadoPuerta;
	private String descripcion;

	public EstadoPuerta() {
	}

	public EstadoPuerta(Long idEstadoPuerta, String descripcion) {
		super();
		this.idEstadoPuerta = idEstadoPuerta;
		this.descripcion = descripcion;
	}

	public Long getIdEstadoPuerta() {
		return idEstadoPuerta;
	}

	public void setIdEstadoPuerta(Long idEstadoPuerta) {
		this.idEstadoPuerta = idEstadoPuerta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Estado Puerta: " + this.getIdEstadoPuerta() + " Descripcion: "
				+ this.getDescripcion();
	}
}
