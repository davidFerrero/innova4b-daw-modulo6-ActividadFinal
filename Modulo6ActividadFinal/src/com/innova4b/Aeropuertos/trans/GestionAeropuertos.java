package com.innova4b.Aeropuertos.trans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

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

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void insertAeropuerto(String nombre, Localidad localidad) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Aeropuerto aeropuerto = new Aeropuerto();

		aeropuerto.setNombre(nombre);
		aeropuerto.setLocalidad(localidad);
		String id = session.save(aeropuerto).toString();

		session.getTransaction().commit();
	}

	public void insertAvion(String modelo, int maxPasajeros,
			int personalAbordo, EstadoAvion estadoAvion, Compañia compañia) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Avion avion = new Avion();
		avion.setModelo(modelo);
		avion.setMaxPasajeros(maxPasajeros);
		avion.setPersonalAbordo(personalAbordo);
		avion.setEstadoAvion(estadoAvion);
		avion.setCompañia(compañia);
		String id = session.save(avion).toString();

		session.getTransaction().commit();
	}

	public void insertBillete(String dni, String nombre, String apellidos,
			Date dtNacimiento, int asiento, Date dtVuelo, String codBillete,
			Vuelo vuelo, int embarca) {
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
		billete.setVuelo(vuelo);
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

	public void insertLocalidad(String nombre,String territorio) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Localidad localidad = new Localidad();

		localidad.setNombre(nombre);
		localidad.setTerritorio(territorio);
		String id = session.save(localidad).toString();

		session.getTransaction().commit();
	}

	public void insertPuertaEmbarque(Aeropuerto aeropuerto,
			EstadoPuerta estadoPuerta) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		PuertaEmbarque puertaEmbarque = new PuertaEmbarque();

		puertaEmbarque.setAeropuerto(aeropuerto);
		puertaEmbarque.setEstadoPuerta(estadoPuerta);

		String id = session.save(puertaEmbarque).toString();

		session.getTransaction().commit();
	}

	public void insertVuelo(Compañia compañia, Date horaSalida,
			Date horaLlegada, PuertaEmbarque puertaEmbarqueSalida,
			PuertaEmbarque puertaEmbarqueLlegada, Avion avion) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Vuelo vuelo = new Vuelo();

		vuelo.setCompañia(compañia);
		vuelo.setHoraSalida(horaSalida);
		vuelo.setHoraLlegada(horaLlegada);
		vuelo.setPuertaEmbarqueSalida(puertaEmbarqueSalida);
		vuelo.setPuertaEmbarqueLlegada(puertaEmbarqueLlegada);
		vuelo.setAvion(avion);

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

		estadoAvion = (EstadoAvion) session.get(EstadoAvion.class,
				idEstadoAvion);

		session.delete(estadoAvion);

		session.getTransaction().commit();
	}

	public void deleteEstadoPuerta(Long idEstadoPuerta) {

		EstadoPuerta estadoPuerta = new EstadoPuerta();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		estadoPuerta = (EstadoPuerta) session.get(EstadoPuerta.class,
				idEstadoPuerta);

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

		puertaEmbarque = (PuertaEmbarque) session.get(PuertaEmbarque.class,
				idPuertaEmbarque);

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

	public List<Aeropuerto> listAeropuerto() {
		sessionFactory.getCurrentSession().beginTransaction();
		List<Aeropuerto> lista = (List<Aeropuerto>) sessionFactory
				.getCurrentSession().createQuery("from Aeropuerto").list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return lista;
	}

	public void mostratListaAeropuerto(List<Aeropuerto> lista) {
		System.out.println("ID      Nombre");
		for (Aeropuerto aeropuerto : lista) {
			System.out.println(aeropuerto.getIdAeropuerto() + "       "
					+ aeropuerto.getNombre());
		}
	}

	public List<Avion> listAvion() {
		sessionFactory.getCurrentSession().beginTransaction();
		List<Avion> lista = (List<Avion>) sessionFactory.getCurrentSession()
				.createQuery("from Avion").list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return lista;
	}

	public void mostrarListaAvion(List<Avion> lista) {
		System.out.println("ID      Modelo");

		System.out.println(lista.size());
		for (Avion avion : lista) {
			System.out.println(avion.getIdAvion() + "       "
					+ avion.getModelo());
		}
	}

	public List<Billete> listBillete() {
		sessionFactory.getCurrentSession().beginTransaction();
		List<Billete> lista = (List<Billete>) sessionFactory
				.getCurrentSession().createQuery("from Billete").list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return lista;
	}

	public void mostrarListaBillete(List<Billete> lista) {
		System.out.println("ID      DNI");
		for (Billete billete : lista) {
			System.out.println(billete.getIdBillete() + "       "
					+ billete.getDni());
		}
	}

	public List<Compañia> listCompañia() {
		sessionFactory.getCurrentSession().beginTransaction();
		List<Compañia> lista = (List<Compañia>) sessionFactory
				.getCurrentSession().createQuery("from Compañia").list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return lista;
	}

	public void mostrarListaCompañia(List<Compañia> lista) {
		System.out.println("ID      NOMBRE");
		for (Compañia compañia : lista) {
			System.out.println(compañia.getIdCompañia() + "       "
					+ compañia.getNombre());
		}
	}

	public List<EstadoAvion> listEstadoAvion() {
		sessionFactory.getCurrentSession().beginTransaction();
		List<EstadoAvion> lista = (List<EstadoAvion>) sessionFactory
				.getCurrentSession().createQuery("from EstadoAvion").list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return lista;
	}

	public void mostrarListaEstadoAvion(List<EstadoAvion> lista) {
		System.out.println("ID      DESCRIPCION");
		for (EstadoAvion estadoAvion : lista) {
			System.out.println(estadoAvion.getIdEstado() + "       "
					+ estadoAvion.getDescripcion());
		}
	}

	public List<EstadoPuerta> listEstadoPuerta() {
		sessionFactory.getCurrentSession().beginTransaction();
		List<EstadoPuerta> lista = (List<EstadoPuerta>) sessionFactory
				.getCurrentSession().createQuery("from EstadoPuerta").list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return lista;
	}

	public void mostrarListaEstadoPuerta(List<EstadoPuerta> lista) {
		System.out.println("ID      DESCRIPCION");
		for (EstadoPuerta estadoPuerta : lista) {
			System.out.println(estadoPuerta.getIdEstado() + "       "
					+ estadoPuerta.getDescripcion());
		}
	}

	public List<Localidad> listLocalidad() {
		sessionFactory.getCurrentSession().beginTransaction();
		List<Localidad> lista = (List<Localidad>) sessionFactory
				.getCurrentSession().createQuery("from Localidad").list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return lista;
	}

	public void mostrarListaLocalidad(List<Localidad> lista) {
		System.out.println("ID      NOMBRE");
		for (Localidad localidad : lista) {
			System.out.println(localidad.getIdLocalidad() + "       "
					+ localidad.getNombre());
		}
	}

	public List<PuertaEmbarque> listPuertaEmbarque() {
		sessionFactory.getCurrentSession().beginTransaction();
		List<PuertaEmbarque> lista = (List<PuertaEmbarque>) sessionFactory
				.getCurrentSession().createQuery("from PuertaEmbarque").list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return lista;
	}

	public void mostrarListaPuertaEmbarque(List<PuertaEmbarque> lista) {
		System.out.println("ID      ESTADO");
		for (PuertaEmbarque puerta : lista) {
			System.out.println(puerta.getIdPuertaEmbarque() + "       "
					+ puerta.getEstadoPuerta());
		}
	}

	public List<Vuelo> listVuelo() {
		sessionFactory.getCurrentSession().beginTransaction();
		List<Vuelo> lista = (List<Vuelo>) sessionFactory.getCurrentSession()
				.createQuery("from Vuelo").list();
		sessionFactory.getCurrentSession().getTransaction().commit();
		return lista;
	}

	public void mostrarListaVuelo(List<Vuelo> lista) {
		System.out.println("ID      ESTADO");
		for (Vuelo vuelo : lista) {
			System.out.println(vuelo.getIdVuelo() + "       "
					+ vuelo.getCompañia());
		}
	}

	public void numeroPuertasEmbarqueParaAeropuerto(Long idAeropuerto) {
		sessionFactory.getCurrentSession().beginTransaction();
		System.out
				.println("El numero de puertas de embarque asociadas al aeropuerto "
						+ idAeropuerto
						+ " son "
						+ sessionFactory
								.getCurrentSession()
								.createQuery(
										"from PuertaEmbarque as p WHERE p.aeropuerto.idAeropuerto = :idAeropuerto and p.estadoPuerta.disponible = 0")
								.setParameter("idAeropuerto", idAeropuerto)
								.list().size());
		sessionFactory.getCurrentSession().getTransaction().commit();
	}

	public void asientosReservados(Long idAvion) {
		sessionFactory.getCurrentSession().beginTransaction();
		System.out
				.println("El numero de asientos asociados al avion "
						+ idAvion
						+ " son "
						+ sessionFactory
								.getCurrentSession()
								.createQuery(
										"from Billete as b WHERE b.vuelo.avion.idAvion = :idAvion")
								.setParameter("idAvion", idAvion).list().size());
		sessionFactory.getCurrentSession().getTransaction().commit();
	}
	
	public void asientosOcupados(Long idAvion) {
		sessionFactory.getCurrentSession().beginTransaction();
		System.out
				.println("El numero de asientos asociados al avion "
						+ idAvion
						+ " son "
						+ sessionFactory
								.getCurrentSession()
								.createQuery(
										"from Billete as b WHERE b.vuelo.avion.idAvion = :idAvion and b.embarca = 1")
								.setParameter("idAvion", idAvion).list().size());
		sessionFactory.getCurrentSession().getTransaction().commit();
	}

	public void licenciasCaducadas(Date fecha) {
		sessionFactory.getCurrentSession().beginTransaction();
		List<Avion> aviones = sessionFactory
				.getCurrentSession()
				.createQuery(
						"from Avion as a WHERE a.compañia.dtCaducidad < :fecha ")
				.setParameter("fecha", fecha).list(); 
				System.out.println("El numero aviones con licencias caducadas a fecha de "
						+ fecha
						+ " son ");
				this.mostrarListaAvion(aviones);
		sessionFactory.getCurrentSession().getTransaction().commit();
	}
	
	public void enTerritorio(String territorio) {
		sessionFactory.getCurrentSession().beginTransaction();
		List<Vuelo> vuelo = sessionFactory
				.getCurrentSession()
				.createQuery(
						"from Vuelo as v WHERE (v.puertaEmbarqueLlegada.aeropuerto.localidad.territorio = :territorio) OR (v.puertaEmbarqueSalida.aeropuerto.localidad.territorio = :territorio) ")
				.setParameter("territorio",territorio).list(); 
				System.out.println("Los aviones en "
						+ territorio
						+ " son ");
				this.mostrarListaVuelo(vuelo);
		sessionFactory.getCurrentSession().getTransaction().commit();
	}

	public static void main(String[] args) {

		GestionAeropuertos er = new GestionAeropuertos();
		InterfazUsuario interfaz = new InterfazUsuario();

		interfaz.menuPrincipal();
		

	}
}
