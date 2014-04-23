package com.innova4b.Aeropuertos.trans;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.innova4b.Aeropuertos.persistent.Aeropuerto;

public class AeropuertoInterceptor extends EmptyInterceptor {

	private static final long serialVersionUID = -4786119805454269574L;

	public boolean onLoad(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types) {
		
		System.out.println("Interceptando session load()...");
		
		// Solo se intercepta en el caso de cargar empleados
		
		if (entity instanceof Aeropuerto) {
			System.out.println("Empleado leido de BD");
			Aeropuerto aeropuerto = (Aeropuerto) entity;

			// Visualizar parametros del metodo

			System.out.println("Id:" + aeropuerto.getIdAeropuerto() + " Nombre:"
					+ aeropuerto.getNombre());
			System.out.println("Id:" + id);
			System.out.println("State:" + state);

			// Todos los arrays tienen la misma longitud
			
			for (int i = 0; i < state.length; i++) {
				System.out.println("state[" + i + "]:" + state[i]
						+ ", propertyNames[" + i + "]:" + propertyNames[i]
						+ ", types[" + i + "]:" + types[i]);
			}

			// Para reescribir el nombre del objeto
			
			state[0] = "Reescribiendo el nombre..."; // No se actualiza hasta
														// finalizar la
														// ejecucion del
														// interceptor
			
			System.out.println("Id:" + aeropuerto.getIdAeropuerto() + " Nombre:"
					+ aeropuerto.getNombre());
			System.out.println("Cargando el state del empleado...");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
