package com.innova4b.Aeropuertos.trans;

import com.innova4b.Aeropuertos.persistent.Aeropuerto;
import com.innova4b.Aeropuertos.persistent.Avion;
import com.innova4b.Aeropuertos.persistent.Billete;
import com.innova4b.Aeropuertos.persistent.Compañia;
import com.innova4b.Aeropuertos.persistent.EstadoAvion;
import com.innova4b.Aeropuertos.persistent.EstadoPuerta;
import com.innova4b.Aeropuertos.persistent.Localidad;
import com.innova4b.Aeropuertos.persistent.PuertaEmbarque;
import com.innova4b.Aeropuertos.persistent.Vuelo;

public class InterfazUsuario {

	private Teclado teclado = new Teclado();
	GestionAeropuertos er = new GestionAeropuertos();

	public void menuPrincipal() {

		String salto_principal = "cont";
		String salto_intermedios = "cont";

		while (salto_principal.equals("cont")) {
			String cadena;

			System.out.println("---------- Seleccion opcion -----------");
			System.out.println(" 1) Gestion Aeropuerto ");
			System.out.println(" 2) Gestion Avion ");
			System.out.println(" 3) Gestion Billete ");
			System.out.println(" 4) Gestion Compañia ");
			System.out.println(" 5) Gestion EstadoAvion ");
			System.out.println(" 6) Gestion EstadoPuerta ");
			System.out.println(" 7) Gestion Localidad ");
			System.out.println(" 8) Gestion PuertaEmbarque ");
			System.out.println(" 9) Gestion Vuelo ");
			System.out.println(" X) Salir ");

			cadena = teclado.getString("Opcion :");

			if (cadena.equalsIgnoreCase("1")) {
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Aeropuertos ");
				System.out.println(" 2) Introducir Aeropuerto ");
				System.out.println(" 3) Borrar Aeropuerto ");
				System.out.println(" X) Salir ");

				cadena = teclado.getString("Opcion :");

				if (cadena.equalsIgnoreCase("1")) {
				} else if (cadena.equalsIgnoreCase("2")) {
					this.insertAeropuerto();
				} else if (cadena.equalsIgnoreCase("3")) {
					this.deleteAeropuerto();
				} else if (cadena.equalsIgnoreCase("X")) {
					salto_intermedios = "exit";
				}

			} else if (cadena.equalsIgnoreCase("2")) {
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Aviones ");
				System.out.println(" 2) Introducir Avion ");
				System.out.println(" 3) Borrar Avion ");
				System.out.println(" X) Salir ");

				cadena = teclado.getString("Opcion :");

				if (cadena.equalsIgnoreCase("1")) {
				} else if (cadena.equalsIgnoreCase("2")) {
					this.insertAvion();
				} else if (cadena.equalsIgnoreCase("3")) {
					this.deleteAvion();
				} else if (cadena.equalsIgnoreCase("X")) {
					salto_intermedios = "exit";
				}
			} else if (cadena.equalsIgnoreCase("3")) {
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Billetes ");
				System.out.println(" 2) Introducir Billete ");
				System.out.println(" 3) Borrar Billete ");
				System.out.println(" X) Salir ");

				cadena = teclado.getString("Opcion :");

				if (cadena.equalsIgnoreCase("1")) {
				} else if (cadena.equalsIgnoreCase("2")) {
					this.insertBillete();
				} else if (cadena.equalsIgnoreCase("3")) {
					this.deleteBillete();
				} else if (cadena.equalsIgnoreCase("X")) {
					salto_intermedios = "exit";
				}
			} else if (cadena.equalsIgnoreCase("4")) {
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Compañias ");
				System.out.println(" 2) Introducir Compañia ");
				System.out.println(" 3) Borrar Compañia ");
				System.out.println(" X) Salir ");

				cadena = teclado.getString("Opcion :");

				if (cadena.equalsIgnoreCase("1")) {
				} else if (cadena.equalsIgnoreCase("2")) {
					this.insertCompañia();
				} else if (cadena.equalsIgnoreCase("3")) {
					this.deleteCompañia();
				} else if (cadena.equalsIgnoreCase("X")) {
					salto_intermedios = "exit";
				}
			} else if (cadena.equalsIgnoreCase("5")) {
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Estados de Aviones ");
				System.out.println(" 2) Introducir Estado Avion ");
				System.out.println(" 3) Borrar Estado Avion ");
				System.out.println(" X) Salir ");

				cadena = teclado.getString("Opcion :");

				if (cadena.equalsIgnoreCase("1")) {
				} else if (cadena.equalsIgnoreCase("2")) {
					this.insertEstadoAvion();
				} else if (cadena.equalsIgnoreCase("3")) {
					this.deleteEstadoAvion();
				} else if (cadena.equalsIgnoreCase("X")) {
					salto_intermedios = "exit";
				}
			} else if (cadena.equalsIgnoreCase("6")) {
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Estados de Puertas ");
				System.out.println(" 2) Introducir Estado Puerta ");
				System.out.println(" 3) Borrar Estado Puerta ");
				System.out.println(" X) Salir ");

				cadena = teclado.getString("Opcion :");

				if (cadena.equalsIgnoreCase("1")) {
				} else if (cadena.equalsIgnoreCase("2")) {
					this.insertEstadoPuerta();
				} else if (cadena.equalsIgnoreCase("3")) {
					this.deleteEstadoPuerta();
				} else if (cadena.equalsIgnoreCase("X")) {
					salto_intermedios = "exit";
				}
			} else if (cadena.equalsIgnoreCase("7")) {
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Localidades ");
				System.out.println(" 2) Introducir Localidad ");
				System.out.println(" 3) Borrar Localidad ");
				System.out.println(" X) Salir ");

				cadena = teclado.getString("Opcion :");

				if (cadena.equalsIgnoreCase("1")) {
				} else if (cadena.equalsIgnoreCase("2")) {
					this.insertLocalidad();
				} else if (cadena.equalsIgnoreCase("3")) {
					this.deleteLocalidad();
				} else if (cadena.equalsIgnoreCase("X")) {
					salto_intermedios = "exit";
				}
			} else if (cadena.equalsIgnoreCase("8")) {
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Puertas de Embarque ");
				System.out.println(" 2) Introducir Puerta de Embarque ");
				System.out.println(" 3) Borrar Puerta Embarque ");
				System.out.println(" X) Salir ");

				cadena = teclado.getString("Opcion :");

				if (cadena.equalsIgnoreCase("1")) {
				} else if (cadena.equalsIgnoreCase("2")) {
					this.insertPuertaEmbarque();
				} else if (cadena.equalsIgnoreCase("3")) {
					this.deletePuertaEmbarque();
				} else if (cadena.equalsIgnoreCase("X")) {
					salto_intermedios = "exit";
				}
			} else if (cadena.equalsIgnoreCase("9")) {
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Vuelos ");
				System.out.println(" 2) Introducir Vuelo ");
				System.out.println(" 3) Borrar Vuelo ");
				System.out.println(" X) Salir ");

				cadena = teclado.getString("Opcion :");

				if (cadena.equalsIgnoreCase("1")) {
				} else if (cadena.equalsIgnoreCase("2")) {
					this.insertVuelo();
				} else if (cadena.equalsIgnoreCase("3")) {
					this.deleteVuelo();
				} else if (cadena.equalsIgnoreCase("X")) {
					salto_intermedios = "exit";
				}
			} else if (cadena.equalsIgnoreCase("X")) {
				salto_principal = "exit";
			} else {
				System.out.println("Seleccione una opcion correcta");
			}// if
		}// while

		HibernateUtil.getSessionFactory().close();
	}

	public void insertAeropuerto() {

		Aeropuerto aeropuerto = new Aeropuerto();

		System.out.println("---------- Introducir Aeropuerto -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");

		aeropuerto.setNombre(teclado.getString("Nombre: "));
		aeropuerto.setLocalidad(er.retrieveLocalidad(teclado
				.getLong("Localidad: ")));

		System.out.println("Localidad nombre :"
				+ aeropuerto.getLocalidad().getNombre());

		er.insertAeropuerto(aeropuerto.getNombre(), aeropuerto.getLocalidad());
	}

	public void insertAvion() {

		Avion avion = new Avion();

		System.out.println("---------- Introducir Avion -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");

		avion.setModelo(teclado.getString("Modelo: "));
		avion.setMaxPasajeros(teclado.getInt("Maximos Pasajeros: "));
		avion.setPersonalAbordo(teclado.getInt("Personal Abordo: "));
		avion.setEstadoAvion(er.retrieveEstadoAvion(teclado
				.getLong("Estado Avion: ")));
		avion.setCompañia(er.retrieveCompañia(teclado.getLong("Compañia: ")));

		er.insertAvion(avion.getModelo(), avion.getMaxPasajeros(),
				avion.getPersonalAbordo(), avion.getEstadoAvion(),
				avion.getCompañia());

	}

	public void insertBillete() {

		Billete billete = new Billete();

		System.out.println("---------- Introducir Billete -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");

		billete.setDni(teclado.getString("DNI: "));
		billete.setApellidos(teclado.getString("Nombre: "));
		billete.setApellidos(teclado.getString("Apellidos: "));
		billete.setDtNacimiento(teclado.getDate("Fecha Nacimiento: "));
		billete.setAsiento(teclado.getInt("Asiento: "));
		billete.setDtVuelo(teclado.getDate("Fecha Vuelo: "));
		billete.setCodBillete(teclado.getString("Codigo Billete: "));
		billete.setVuelo(er.retrieveVuelo(teclado.getLong("Vuelo: ")));
		billete.setEmbarca(teclado.getInt("Embarca S(1) / N(0): "));

		er.insertBillete(billete.getDni(), billete.getNombre(),
				billete.getApellidos(), billete.getDtNacimiento(),
				billete.getAsiento(), billete.getDtVuelo(),
				billete.getCodBillete(), billete.getIdVuelo(),
				billete.getEmbarca());
	}

	public void insertCompañia() {

		System.out.println("---------- Introducir Compañia -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");

		Compañia compañia = new Compañia();

		compañia.setNombre(teclado.getString("Nombre: "));
		compañia.setCodLicencia(teclado.getString("Codigo Licencia: "));
		compañia.setDtConcesion(teclado.getDate("Fecha Concesion: "));
		compañia.setDtCaducidad(teclado.getDate("Fecha Caducidad: "));

		er.insertCompañia(compañia.getNombre(), compañia.getCodLicencia(),
				compañia.getDtConcesion(), compañia.getDtCaducidad());
	}

	public void insertEstadoAvion() {

		System.out.println("---------- Introducir Estado Avion -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");

		EstadoAvion estadoAvion = new EstadoAvion();

		estadoAvion.setDescripcion(teclado.getString("Descripcion: "));

		er.insertEstadoAvion(estadoAvion.getDescripcion());
	}

	public void insertEstadoPuerta() {

		System.out.println("---------- Introducir Estado Puerta -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");

		EstadoPuerta estadoPuerta = new EstadoPuerta();

		estadoPuerta.setDescripcion(teclado.getString("Descripcion: "));

		er.insertEstadoPuerta(estadoPuerta.getDescripcion());
	}

	public void insertLocalidad() {

		System.out.println("---------- Introducir Localidad -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");

		Localidad localidad = new Localidad();

		localidad.setNombre(teclado.getString("Nombre: "));
		er.insertLocalidad(localidad.getNombre());
	}

	public void insertPuertaEmbarque() {

		System.out.println("---------- Introducir Puerta Embarque -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");

		PuertaEmbarque puertaEmbarque = new PuertaEmbarque();

		puertaEmbarque.setAeropuerto(er.retrieveAeropuerto(teclado
				.getLong("Aeropuerto: ")));
		puertaEmbarque.setEstadoPuerta(er.retrieveEstadoPuerta(teclado
				.getLong("Estado Puerta: ")));

		er.insertPuertaEmbarque(puertaEmbarque.getAeropuerto(),
				puertaEmbarque.getEstadoPuerta());
	}

	public void insertVuelo() {

		System.out.println("---------- Introducir Vuelo -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");

		Vuelo vuelo = new Vuelo();

		vuelo.setCompañia(er.retrieveCompañia(teclado.getLong("Compañia: ")));
		vuelo.setHoraSalida(teclado.getDate("Hora Salida: "));
		vuelo.setHoraLlegada(teclado.getDate("Hora Llegada: "));
		vuelo.setPuertaEmbarqueSalida(er.retrievePuertaEmbarque(teclado
				.getLong("Puerta Embarque Salida: ")));
		vuelo.setPuertaEmbarqueLlegada(er.retrievePuertaEmbarque(teclado
				.getLong("Puerta Embarque Llegada: ")));
		vuelo.setAvion(er.retrieveAvion(teclado.getLong("Avion: ")));

		er.insertVuelo(vuelo.getCompañia(),
				vuelo.getHoraSalida(), vuelo.getHoraLlegada(),
				vuelo.getPuertaEmbarqueSalida(),
				vuelo.getPuertaEmbarqueLlegada(), vuelo.getAvion());
	}

	public static void main(String[] args) {

		GestionAeropuertos er = new GestionAeropuertos();
		InterfazUsuario interfaz = new InterfazUsuario();

		interfaz.menuPrincipal();
	}

	public void deleteAeropuerto() {
		System.out.println("---------- Borrar Aeropuerto -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		er.deleteAeropuerto(Long.parseLong(teclado.getString("Aeropuerto: ")));
	}

	public void deleteAvion() {
		System.out.println("---------- Borrar Avion -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		er.deleteAvion(Long.parseLong(teclado.getString("Avion: ")));
	}

	public void deleteBillete() {
		System.out.println("---------- Borrar Billete -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		er.deleteBillete(Long.parseLong(teclado.getString("Billete: ")));
	}

	public void deleteCompañia() {
		System.out.println("---------- Borrar Compañia -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		er.deleteCompañia(Long.parseLong(teclado.getString("Compañia: ")));
	}

	public void deleteEstadoAvion() {
		System.out.println("---------- Borrar Estado Avion -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		er.deleteEstadoAvion(Long.parseLong(teclado.getString("Estado Avion: ")));
	}

	public void deleteEstadoPuerta() {
		System.out.println("---------- Borrar Estado Puerta -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		er.deleteEstadoPuerta(Long.parseLong(teclado
				.getString("Estado Puerta: ")));
	}

	public void deleteLocalidad() {
		System.out.println("---------- Borrar Localidad -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		er.deleteLocalidad(Long.parseLong(teclado.getString("Localidad: ")));
	}

	public void deletePuertaEmbarque() {
		System.out.println("---------- Borrar Puerta Embarque -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		er.deletePuertaEmbarque(Long.parseLong(teclado
				.getString("Puerta Embarque: ")));
	}

	public void deleteVuelo() {
		System.out.println("---------- Borrar Vuelo -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		er.deleteVuelo(Long.parseLong(teclado.getString("Vuelo: ")));
	}

}
