package com.innova4b.Aeropuertos.persistent;
import java.util.Date;

public class Billete {

	private Long idBillete;
	private String dni;
	private String nombre;
	private String apellidos;
	private Date dtNacimiento;
	private int asiento;
	private Date dtVuelo;
	private String codBillete;
	private Long idVuelo;
	private int embarca;

	public Billete() {
	}

	public Billete(Long idBillete, String dni, String nombre, String apellidos,
			Date dtNacimiento, int asiento, Date dtVuelo, String codBillete,
			Long idVuelo, int embarca) {
		this.idBillete = idBillete;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dtNacimiento = dtNacimiento;
		this.asiento = asiento;
		this.dtVuelo = dtVuelo;
		this.codBillete = codBillete;
		this.idVuelo = idVuelo;
		this.embarca = embarca;
	}

	public Long getIdBillete() {
		return idBillete;
	}

	public void setIdBillete(Long idBillete) {
		this.idBillete = idBillete;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getDtNacimiento() {
		return dtNacimiento;
	}

	public void setDtNacimiento(Date dtNacimiento) {
		this.dtNacimiento = dtNacimiento;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public Date getDtVuelo() {
		return dtVuelo;
	}

	public void setDtVuelo(Date dtVuelo) {
		this.dtVuelo = dtVuelo;
	}

	public String getCodBillete() {
		return codBillete;
	}

	public void setCodBillete(String codBillete) {
		this.codBillete = codBillete;
	}

	public Long getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Long idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getEmbarca() {
		return embarca;
	}

	public void setEmbarca(int embarca) {
		this.embarca = embarca;
	}

	@Override
	public String toString() {
		return " Billete: " + this.getIdBillete() + " Cod. Billete: "
				+ this.getCodBillete() + " Dni: " + this.getDni();
	}

}
