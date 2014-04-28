package com.innova4b.Aeropuertos.persistent;
import java.util.Date;

public class Vuelo {

	private Long idVuelo;
	private Compañia compañia;
	private Date horaSalida;
	private Date horaLlegada;
	private PuertaEmbarque puertaEmbarqueSalida;
	private PuertaEmbarque puertaEmbarqueLlegada;
	private Avion avion;

	public Vuelo() {
	}

	public Vuelo(Long idVuelo, Compañia compañia,
			Date horaSalida, Date horaLlegada, PuertaEmbarque puertaEmbarqueSalida,
			PuertaEmbarque puertaEmbarqueLlegada, Avion avion) {
		super();
		this.idVuelo = idVuelo;
		this.compañia = compañia;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.puertaEmbarqueSalida = puertaEmbarqueSalida;
		this.puertaEmbarqueLlegada = puertaEmbarqueLlegada;
		this.avion = avion;
	}

	public Long getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Long idVuelo) {
		this.idVuelo = idVuelo;
	}

	public Compañia getCompañia() {
		return compañia;
	}

	public void setCompañia(Compañia compañia) {
		this.compañia = compañia;
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

	public PuertaEmbarque getPuertaEmbarqueSalida() {
		return puertaEmbarqueSalida;
	}

	public void setPuertaEmbarqueSalida(PuertaEmbarque puertaEmbarqueSalida) {
		this.puertaEmbarqueSalida = puertaEmbarqueSalida;
	}

	public PuertaEmbarque getPuertaEmbarqueLlegada() {
		return puertaEmbarqueLlegada;
	}

	public void setPuertaEmbarqueLlegada(PuertaEmbarque puertaEmbarqueLlegada) {
		this.puertaEmbarqueLlegada = puertaEmbarqueLlegada;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	@Override
	public String toString() {
		return "Vuelo: " + this.getIdVuelo() + " Compañia: "
				+ this.getCompañia().getNombre() + " Avion: " + this.getAvion().getModelo();
	}
}
