package com.innova4b.Aeropuertos.persistent;
public class Localidad {

	private Long idLocalidad;
	private String nombre;

	public Localidad() {
	}

	public Localidad(Long idLocalidad, String nombre) {
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
	}

	
	public Long getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(Long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Localidad: " + this.getIdLocalidad() + " Nombre: "
				+ this.getNombre();
	}

}
