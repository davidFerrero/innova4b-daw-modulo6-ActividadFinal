package com.innova4b.Aeropuertos.persistent;
public class PuertaEmbarque {

	private Long idPuertaEmbarque;
	private Aeropuerto aeropuerto;
	private EstadoPuerta estadoPuerta;

	/**
	 * @param args
	 */
	public PuertaEmbarque() {
	}

	public PuertaEmbarque(Long idPuertaEmbarque, Aeropuerto aeropuerto,
			EstadoPuerta estadoPuerta) {
		super();
		this.idPuertaEmbarque = idPuertaEmbarque;
		this.aeropuerto = aeropuerto;
		this.estadoPuerta = estadoPuerta;
	}

	public Long getIdPuertaEmbarque() {
		return idPuertaEmbarque;
	}

	public void setIdPuertaEmbarque(Long idPuertaEmbarque) {
		this.idPuertaEmbarque = idPuertaEmbarque;
	}

	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public EstadoPuerta getEstadoPuerta() {
		return estadoPuerta;
	}

	public void setEstadoPuerta(EstadoPuerta estadoPuerta) {
		this.estadoPuerta = estadoPuerta;
	}

	@Override
	public String toString() {
		return "PuertaEmbarque: " + this.getIdPuertaEmbarque()
				+ " Aeropuerto: " + this.getAeropuerto().getNombre() + " Estado: "
				+ this.getEstadoPuerta().getDescripcion();
	}

}
