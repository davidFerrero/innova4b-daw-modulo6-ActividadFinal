package com.innova4b.Aeropuertos.trans;

import java.util.Date;

import org.hibernate.Session;

import com.innova4b.Aeropuertos.persistent.Aeropuerto;
import com.innova4b.Aeropuertos.persistent.Localidad;

public class GestionAeropuertos {

	public void insertLocalidad(String nombre) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Localidad localidad = new Localidad();

		localidad.setNombre(nombre);
		String id = session.save(localidad).toString();

		session.getTransaction().commit();
	}
	
	public void insertAeropuerto(String nombre, Long idLocalidad) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();

		Aeropuerto aeropuerto = new Aeropuerto();

		aeropuerto.setNombre(nombre);
		String id = session.save(aeropuerto).toString();

		session.getTransaction().commit();
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GestionAeropuertos er = new GestionAeropuertos();
		System.out.println("args[0]:" + args[0]);

		if (args[0].equals("insertAeropuerto")) {
			er.insertLocalidad("Bilbo");
			er.insertAeropuerto("Loiu",2L);
		}
		HibernateUtil.getSessionFactory().close();
	}

}
