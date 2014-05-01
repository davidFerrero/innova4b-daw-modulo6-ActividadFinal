package com.innova4b.Aeropuertos.persistent;
public class Localidad {

	private Long idLocalidad;
	private String nombre;
	private String territorio;
	
	public Localidad() {
	}

	public Localidad(Long idLocalidad, String nombre, String territorio) {
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
		this.territorio = territorio;
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
	
	public String getTerritorio() {
		return territorio;
	}

	public void setTerritorio(String territorio) {
		this.territorio = territorio;
	}

	@Override
	public String toString() {
		return "Localidad: " + this.getIdLocalidad() + " Nombre: "
				+ this.getNombre();
	}

}
