package com.innova4b.Aeropuertos.persistent;
public class PuertaEmbarque {

	private Long idPuertaEmbarque;
	private Long idAeropuerto;
	private Long idEstadoPuerta;

	/**
	 * @param args
	 */
	public PuertaEmbarque() {
	}

	public PuertaEmbarque(Long idPuertaEmbarque, Long idAeropuerto,
			Long idEstadoPuerta) {
		super();
		this.idPuertaEmbarque = idPuertaEmbarque;
		this.idAeropuerto = idAeropuerto;
		this.idEstadoPuerta = idEstadoPuerta;
	}

	public Long getIdPuertaEmbarque() {
		return idPuertaEmbarque;
	}

	public void setIdPuertaEmbarque(Long idPuertaEmbarque) {
		this.idPuertaEmbarque = idPuertaEmbarque;
	}

	public Long getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(Long idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public Long getIdEstadoPuerta() {
		return idEstadoPuerta;
	}

	public void setIdEstadoPuerta(Long idEstadoPuerta) {
		this.idEstadoPuerta = idEstadoPuerta;
	}

	@Override
	public String toString() {
		return "PuertaEmbarque: " + this.getIdPuertaEmbarque()
				+ " Aeropuerto: " + this.getIdAeropuerto() + " Estado: "
				+ this.getIdEstadoPuerta();
	}

}
