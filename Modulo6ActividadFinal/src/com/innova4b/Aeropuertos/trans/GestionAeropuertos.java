package com.innova4b.Aeropuertos.trans;

import java.util.Date;

import org.hibernate.Session;

import com.innova4b.Aeropuertos.persistent.Aeropuerto;
import com.innova4b.Aeropuertos.persistent.Avion;
import com.innova4b.Aeropuertos.persistent.Billete;
import com.innova4b.Aeropuertos.persistent.Compañia;
import com.innova4b.Aeropuertos.persistent.EstadoAvion;
import com.innova4b.Aeropuertos.persistent.EstadoPuerta;
import com.innova4b.Aeropuertos.persistent.Localidad;
import com.innova4b.Aeropuertos.persistent.PuertaEmbarque;
import com.innova4b.Aeropuertos.persistent.Vuelo;

public class GestionAeropuertos {

	public void insertAeropuerto(String nombre, Long idLocalidad) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Aeropuerto aeropuerto = new Aeropuerto();

		aeropuerto.setNombre(nombre);
		String id = session.save(aeropuerto).toString();

		session.getTransaction().commit();
	}

	public void insertAvion(String modelo, int maxPasajeros,
			int personalAbordo, Long idEstadoAvion, Long idCompañia) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Avion avion = new Avion();
		avion.setModelo(modelo);
		avion.setMaxPasajeros(maxPasajeros);
		avion.setPersonalAbordo(personalAbordo);
		avion.setIdEstadoAvion(idEstadoAvion);
		avion.setIdCompañia(idCompañia);
		String id = session.save(avion).toString();

		session.getTransaction().commit();
	}

	public void insertBillete(String dni, String nombre, String apellidos,
			Date dtNacimiento, int asiento, Date dtVuelo, String codBillete,
			Long idVuelo, int embarca) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Billete billete = new Billete();

		billete.setDni(dni);
		billete.setApellidos(nombre);
		billete.setApellidos(apellidos);
		billete.setDtNacimiento(dtNacimiento);
		billete.setAsiento(asiento);
		billete.setDtVuelo(dtVuelo);
		billete.setCodBillete(codBillete);
		billete.setIdVuelo(idVuelo);
		billete.setEmbarca(embarca);

		String id = session.save(billete).toString();

		session.getTransaction().commit();
	}
	
	public void insertCompañia(String nombre, String codLicencia,
			Date dtConcesion, Date dtCaducidad) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Compañia compañia = new Compañia();

		compañia.setNombre(nombre);
		compañia.setCodLicencia(codLicencia);
		compañia.setDtConcesion(dtConcesion);
		compañia.setDtCaducidad(dtCaducidad);

		String id = session.save(compañia).toString();

		session.getTransaction().commit();
	}
	
	public void insertEstadoAvion(String descripcion) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		EstadoAvion estadoAvion = new EstadoAvion();

		estadoAvion.setDescripcion(descripcion);

		String id = session.save(estadoAvion).toString();

		session.getTransaction().commit();
	}
	
	public void insertEstadoPuerta(String descripcion) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		EstadoPuerta estadoPuerta = new EstadoPuerta();

		estadoPuerta.setDescripcion(descripcion);

		String id = session.save(estadoPuerta).toString();

		session.getTransaction().commit();
	}

	public void insertLocalidad(String nombre) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Localidad localidad = new Localidad();

		localidad.setNombre(nombre);
		String id = session.save(localidad).toString();

		session.getTransaction().commit();
	}

	public void insertPuertaEmbarque(Long idAeropuerto,
			Long idEstadoPuerta) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		PuertaEmbarque puertaEmbarque = new PuertaEmbarque();

		puertaEmbarque.setIdAeropuerto(idAeropuerto);
		puertaEmbarque.setIdEstadoPuerta(idEstadoPuerta);
		
		String id = session.save(puertaEmbarque).toString();

		session.getTransaction().commit();
	}
	
	public void insertVuelo(Long idCompañia, Long idAeropuerto,
			Date horaSalida, Date horaLlegada, Long idPuertaEmbarqueSalida,
			Long idPuertaEmbarqueLlegada, Long idAvion) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Vuelo vuelo = new Vuelo();

		vuelo.setIdCompañia(idCompañia);
		vuelo.setIdAeropuerto(idAeropuerto);
		vuelo.setHoraSalida(horaSalida);
		vuelo.setHoraLlegada(horaLlegada);
		vuelo.setIdPuertaEmbarqueSalida(idPuertaEmbarqueSalida);
		vuelo.setIdPuertaEmbarqueLlegada(idPuertaEmbarqueLlegada);
		vuelo.setIdAvion(idAvion);
		
		String id = session.save(vuelo).toString();

		session.getTransaction().commit();
	}

	public Aeropuerto retrieveAeropuerto(Long idAeropuerto) {

		Aeropuerto aeropuerto = new Aeropuerto();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		aeropuerto = (Aeropuerto) session.get(Aeropuerto.class, idAeropuerto);

		session.getTransaction().commit();

		return aeropuerto;
	}

	public Avion retrieveAvion(Long idAvion) {

		Avion avion = new Avion();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		avion = (Avion) session.get(Aeropuerto.class, idAvion);

		session.getTransaction().commit();

		return avion;
	}

	public Billete retrieveBillete(Long idBillete) {

		Billete billete = new Billete();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		billete = (Billete) session.get(Billete.class, idBillete);

		session.getTransaction().commit();

		return billete;
	}

	public Compañia retrieveCompañia(Long idCompañia) {

		Compañia compañia = new Compañia();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		compañia = (Compañia) session.get(Compañia.class, idCompañia);

		session.getTransaction().commit();

		return compañia;
	}

	public EstadoAvion retrieveEstadoAvion(Long idEstadoAvion) {

		EstadoAvion estadoAvion = new EstadoAvion();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		estadoAvion = (EstadoAvion) session.get(EstadoAvion.class,
				idEstadoAvion);

		session.getTransaction().commit();

		return estadoAvion;
	}

	public EstadoPuerta retrieveEstadoPuerta(Long idEstadoPuerta) {

		EstadoPuerta estadoPuerta = new EstadoPuerta();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		estadoPuerta = (EstadoPuerta) session.get(EstadoPuerta.class,
				idEstadoPuerta);

		session.getTransaction().commit();

		return estadoPuerta;
	}

	public Localidad retrieveLocalidad(Long idLocalidad) {

		Localidad localidad = new Localidad();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		localidad = (Localidad) session.get(Localidad.class, idLocalidad);

		session.getTransaction().commit();

		return localidad;
	}

	public PuertaEmbarque retrievePuertaEmbarque(Long idPuertaEmbarque) {

		PuertaEmbarque puertaEmbarque = new PuertaEmbarque();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		puertaEmbarque = (PuertaEmbarque) session.get(PuertaEmbarque.class,
				idPuertaEmbarque);

		session.getTransaction().commit();

		return puertaEmbarque;
	}

	public Vuelo retrieveVuelo(Long idVuelo) {

		Vuelo vuelo = new Vuelo();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		vuelo = (Vuelo) session.get(Vuelo.class, idVuelo);

		session.getTransaction().commit();

		return vuelo;
	}

	public void deleteAeropuerto(Long idAeropuerto) {

		Aeropuerto aeropuerto = new Aeropuerto();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		aeropuerto = (Aeropuerto) session.get(Aeropuerto.class, idAeropuerto);

		session.delete(aeropuerto);

		session.getTransaction().commit();
	}
	
	public void deleteAvion(Long idAvion) {

		Avion avion = new Avion();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		avion = (Avion) session.get(Avion.class, idAvion);

		session.delete(avion);

		session.getTransaction().commit();
	}
	
	public void deleteBillete(Long idBillete) {

		Billete billete = new Billete();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		billete = (Billete) session.get(Billete.class, idBillete);

		session.delete(billete);

		session.getTransaction().commit();
	}
	
	public void deleteCompañia(Long idCompañia) {

		Compañia compañia = new Compañia();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		compañia = (Compañia) session.get(Compañia.class, idCompañia);

		session.delete(compañia);

		session.getTransaction().commit();
	}
	
	public void deleteEstadoAvion(Long idEstadoAvion) {

		EstadoAvion estadoAvion = new EstadoAvion();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		estadoAvion = (EstadoAvion) session.get(EstadoAvion.class, idEstadoAvion);

		session.delete(estadoAvion);

		session.getTransaction().commit();
	}
	
	public void deleteEstadoPuerta(Long idEstadoPuerta) {

		EstadoPuerta estadoPuerta = new EstadoPuerta();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		estadoPuerta = (EstadoPuerta) session.get(EstadoPuerta.class, idEstadoPuerta);

		session.delete(estadoPuerta);

		session.getTransaction().commit();
	}
	
	public void deleteLocalidad(Long idLocalidad) {

		Localidad localidad = new Localidad();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		localidad = (Localidad) session.get(Localidad.class, idLocalidad);

		session.delete(localidad);

		session.getTransaction().commit();
	}
	
	public void deletePuertaEmbarque(Long idPuertaEmbarque) {

		PuertaEmbarque puertaEmbarque = new PuertaEmbarque();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		puertaEmbarque = (PuertaEmbarque) session.get(PuertaEmbarque.class, idPuertaEmbarque);

		session.delete(puertaEmbarque);

		session.getTransaction().commit();
	}
	
	public void deleteVuelo(Long idVuelo) {

		Vuelo vuelo = new Vuelo();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		vuelo = (Vuelo) session.get(Vuelo.class, idVuelo);

		session.delete(vuelo);

		session.getTransaction().commit();
	}

}
