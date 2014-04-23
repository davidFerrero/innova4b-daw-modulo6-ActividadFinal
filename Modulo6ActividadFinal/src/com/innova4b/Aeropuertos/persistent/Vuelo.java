package com.innova4b.Aeropuertos.persistent;
import java.util.Date;

public class Vuelo {

	private Long idVuelo;
	private Long idCompañia;
	private Long idAeropuerto;
	private Date horaSalida;
	private Date horaLlegada;
	private Long idPuertaEmbarqueSalida;
	private Long idPuertaEmbarqueLlegada;
	private Long idAvion;

	public Vuelo() {
	}

	public Vuelo(Long idVuelo, Long idCompañia, Long idAeropuerto,
			Date horaSalida, Date horaLlegada, Long idPuertaEmbarqueSalida,
			Long idPuertaEmbarqueLlegada, Long idAvion) {
		super();
		this.idVuelo = idVuelo;
		this.idCompañia = idCompañia;
		this.idAeropuerto = idAeropuerto;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.idPuertaEmbarqueSalida = idPuertaEmbarqueSalida;
		this.idPuertaEmbarqueLlegada = idPuertaEmbarqueLlegada;
		this.idAvion = idAvion;
	}

	public Long getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Long idVuelo) {
		this.idVuelo = idVuelo;
	}

	public Long getIdCompañia() {
		return idCompañia;
	}

	public void setIdCompañia(Long idCompañia) {
		this.idCompañia = idCompañia;
	}

	public Long getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(Long idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Long getIdPuertaEmbarqueSalida() {
		return idPuertaEmbarqueSalida;
	}

	public void setIdPuertaEmbarqueSalida(Long idPuertaEmbarqueSalida) {
		this.idPuertaEmbarqueSalida = idPuertaEmbarqueSalida;
	}

	public Long getIdPuertaEmbarqueLlegada() {
		return idPuertaEmbarqueLlegada;
	}

	public void setIdPuertaEmbarqueLlegada(Long idPuertaEmbarqueLlegada) {
		this.idPuertaEmbarqueLlegada = idPuertaEmbarqueLlegada;
	}

	public Long getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(Long idAvion) {
		this.idAvion = idAvion;
	}

	@Override
	public String toString() {
		return "Vuelo: " + this.getIdVuelo() + " Compañia: "
				+ this.getIdCompañia() + " Avion: " + this.getIdAvion();
	}
}
