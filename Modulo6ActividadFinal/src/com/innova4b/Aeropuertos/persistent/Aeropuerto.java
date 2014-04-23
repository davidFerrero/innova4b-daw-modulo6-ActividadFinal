package com.innova4b.Aeropuertos.persistent;
public class Aeropuerto {

	private Long idAeropuerto;
	private String nombre;
	private Long idLocalidad;

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

	public Long getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(Long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	@Override
	public String toString() {
		return "Aeropuerto: " + this.getIdAeropuerto() + " Nombre: "
				+ this.getNombre();
	}

}
