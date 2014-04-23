package com.innova4b.Aeropuertos.persistent;
import java.util.Date;

public class Compañia {

	private Long idCompañia;
	private String nombre;
	private String codLicencia;
	private Date dtConcesion;
	private Date dtCaducidad;

	public Compañia() {
	}

	public Compañia(Long idCompañia, String nombre, String codLicencia,
			Date dtConcesion, Date dtCaducidad) {
		super();
		this.idCompañia = idCompañia;
		this.nombre = nombre;
		this.codLicencia = codLicencia;
		this.dtConcesion = dtConcesion;
		this.dtCaducidad = dtCaducidad;
	}

	public Long getIdCompañia() {
		return idCompañia;
	}

	public void setIdCompañia(Long idCompañia) {
		this.idCompañia = idCompañia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodLicencia() {
		return codLicencia;
	}

	public void setCodLicencia(String codLicencia) {
		this.codLicencia = codLicencia;
	}

	public Date getDtConcesion() {
		return dtConcesion;
	}

	public void setDtConcesion(Date dtConcesion) {
		this.dtConcesion = dtConcesion;
	}

	public Date getDtCaducidad() {
		return dtCaducidad;
	}

	public void setDtCaducidad(Date dtCaducidad) {
		this.dtCaducidad = dtCaducidad;
	}

	@Override
	public String toString() {
		return "Compañia: " + this.getIdCompañia() + " nombre :"
				+ this.getNombre() + " Cod. Licencia: " + this.getCodLicencia();
	}

}
