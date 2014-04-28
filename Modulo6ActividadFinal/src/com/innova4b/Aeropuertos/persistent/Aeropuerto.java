package com.innova4b.Aeropuertos.persistent;
public class Aeropuerto {

	private Long idAeropuerto;
	private String nombre;
	private Localidad localidad;

	public Aeropuerto() {
	}

	public Aeropuerto(Long idAeropuerto, String nombre) {
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
	}

	public Long getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(Long idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad Localidad) {
		this.localidad = Localidad;
	}

	@Override
	public String toString() {
		return "Aeropuerto: " + this.getIdAeropuerto() + " Nombre: "
				+ this.getNombre();
	}

}
