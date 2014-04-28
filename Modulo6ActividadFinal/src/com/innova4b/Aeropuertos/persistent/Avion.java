package com.innova4b.Aeropuertos.persistent;
public class Avion {

	private Long idAvion;
	private String modelo;
	private int maxPasajeros;
	private int personalAbordo;
	private EstadoAvion estadoAvion;
	private Compañia compañia;

	public Avion() {
	}

	public Avion(Long idAvion, String modelo, int maxPasajeros,
			int personalAbordo, EstadoAvion estadoAvion, Compañia compañia) {
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.maxPasajeros = maxPasajeros;
		this.personalAbordo = personalAbordo;
		this.estadoAvion = estadoAvion;
		this.compañia = compañia;
	}

	public Long getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(Long idAvion) {
		this.idAvion = idAvion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMaxPasajeros() {
		return maxPasajeros;
	}

	public void setMaxPasajeros(int maxPasajeros) {
		this.maxPasajeros = maxPasajeros;
	}

	public int getPersonalAbordo() {
		return personalAbordo;
	}

	public void setPersonalAbordo(int personalAbordo) {
		this.personalAbordo = personalAbordo;
	}

	public EstadoAvion getEstadoAvion() {
		return estadoAvion;
	}

	public void setEstadoAvion(EstadoAvion estadoAvion) {
		this.estadoAvion = estadoAvion;
	}

	public Compañia getCompañia() {
		return compañia;
	}

	public void setCompañia(Compañia compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Avion: " + this.getIdAvion() + " Compañia: "
				+ this.getCompañia().getNombre() + " Modelo: " + this.getModelo();
	}

}
