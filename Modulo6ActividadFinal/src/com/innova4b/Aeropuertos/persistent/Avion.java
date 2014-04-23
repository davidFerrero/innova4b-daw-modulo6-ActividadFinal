package com.innova4b.Aeropuertos.persistent;
public class Avion {

	private Long idAvion;
	private String modelo;
	private int maxPasajeros;
	private int personalAbordo;
	private Long idEstadoAvion;
	private Long idCompañia;

	public Avion() {
	}

	public Avion(Long idAvion, String modelo, int maxPasajeros,
			int personalAbordo, Long idEstadoAvion, Long idCompañia) {
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.maxPasajeros = maxPasajeros;
		this.personalAbordo = personalAbordo;
		this.idEstadoAvion = idEstadoAvion;
		this.idCompañia = idCompañia;
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

	public Long getIdEstadoAvion() {
		return idEstadoAvion;
	}

	public void setIdEstadoAvion(Long idEstadoAvion) {
		this.idEstadoAvion = idEstadoAvion;
	}

	public Long getIdCompañia() {
		return idCompañia;
	}

	public void setIdCompañia(Long idCompañia) {
		this.idCompañia = idCompañia;
	}

	@Override
	public String toString() {
		return "Avion: " + this.getIdAvion() + " Compañia: "
				+ this.getIdCompañia() + " Modelo: " + this.getModelo();
	}

}
