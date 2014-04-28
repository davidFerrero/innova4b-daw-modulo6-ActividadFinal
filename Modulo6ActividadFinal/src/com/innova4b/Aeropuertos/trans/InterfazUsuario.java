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

	public void menuPrincipal(){
		GestionAeropuertos er = new GestionAeropuertos();
		String salto = "cont";
		
		while (salto.equals("cont")){
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
			
			if (cadena.equalsIgnoreCase("1")){
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Aeropuertos ");
				System.out.println(" 2) Introducir Aeropuerto ");
				System.out.println(" 3) Borrar Aeropuerto ");
				System.out.println(" X) Salir ");

				cadena = teclado.getString("Opcion :");
				
				if (cadena.equalsIgnoreCase("1")){
				}else if (cadena.equalsIgnoreCase("2")){
					Aeropuerto aeropuerto = this.insertAeropuerto();
					er.insertAeropuerto(aeropuerto.getNombre(), aeropuerto.getIdLocalidad());					
				}else if (cadena.equalsIgnoreCase("3")){
				}else if (cadena.equalsIgnoreCase("X")){
					salto = "exit";
				}
									
			}else if (cadena.equalsIgnoreCase("2")){
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Aviones ");
				System.out.println(" 2) Introducir Avion ");
				System.out.println(" 3) Borrar Avion ");
				System.out.println(" 4) Salir ");

				cadena = teclado.getString("Opcion :");
			}else if (cadena.equalsIgnoreCase("3")){
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Billetes ");
				System.out.println(" 2) Introducir Billete ");
				System.out.println(" 3) Borrar Billete ");
			}else if (cadena.equalsIgnoreCase("4")){
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Compañias ");
				System.out.println(" 2) Introducir Compañia ");
				System.out.println(" 3) Borrar Compañia ");
			}else if (cadena.equalsIgnoreCase("5")){
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Estados de Aviones ");
				System.out.println(" 2) Introducir Estado Avion ");
				System.out.println(" 3) Borrar Estado Avion ");
			}else if (cadena.equalsIgnoreCase("6")){
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Estados de Puertas ");
				System.out.println(" 2) Introducir Estado Puerta ");
				System.out.println(" 3) Borrar Estado Puerta ");
			}else if (cadena.equalsIgnoreCase("7")){
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Localidades ");
				System.out.println(" 2) Introducir Localidad ");
				System.out.println(" 3) Borrar Localidad ");
			}else if (cadena.equalsIgnoreCase("8")){
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Puertas de Embarque ");
				System.out.println(" 2) Introducir Puerta de Embarque ");
				System.out.println(" 3) Borrar Puerta Embarque ");
			}else if (cadena.equalsIgnoreCase("9")){
				System.out.println("---------- Seleccion opcion -----------");
				System.out.println(" 1) Ver Vuelos ");
				System.out.println(" 2) Introducir Vuelo ");
				System.out.println(" 3) Borrar Vuelo ");
			}else if (cadena.equalsIgnoreCase("X")){
				salto = "exit";
			}else{
				System.out.println("Seleccione una opcion correcta");
			}// if
		}// while
		
		HibernateUtil.getSessionFactory().close();
	}
	
	public Aeropuerto insertAeropuerto() {
		
		Aeropuerto aeropuerto = new Aeropuerto();

		System.out.println("---------- Introducir Aeropuerto -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		System.out.println("Pregunta Nombre");
		String cadena = teclado.getString("Nombre: ");
		System.out.println("Tras Pregunta Nombre");
		aeropuerto.setNombre(cadena);
		System.out.println("Tras setNombre");
			
		return aeropuerto;

	}

	public Avion insertAvion() {
		
		Avion avion = new Avion();
		
		System.out.println("---------- Introducir Avion -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
				
		avion.setModelo(teclado.getString("Modelo: "));
		avion.setMaxPasajeros(teclado.getInt("Maximos Pasajeros: "));
		avion.setPersonalAbordo(teclado.getInt("Personal Abordo: "));
		avion.setIdEstadoAvion(teclado.getLong("Estado Avion: "));
		avion.setIdEstadoAvion(teclado.getLong("Compañia: "));
		
		return avion;

	}

	public Billete insertBillete() {
		
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
		billete.setIdVuelo(teclado.getLong("Vuelo: "));
		billete.setEmbarca(teclado.getInt("Embarca S(1) / N(0): "));
		
		return billete;
	}
	
	public Compañia insertCompañia() {

		System.out.println("---------- Introducir Compañia -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");

		Compañia compañia = new Compañia();

		compañia.setNombre(teclado.getString("Nombre: "));
		compañia.setCodLicencia(teclado.getString("Codigo Licencia: "));
		compañia.setDtConcesion(teclado.getDate("Fecha Concesion: "));
		compañia.setDtCaducidad(teclado.getDate("Fecha Caducidad: "));

		return compañia;
	}
	
	public EstadoAvion insertEstadoAvion(String descripcion) {

		System.out.println("---------- Introducir Estado Avion -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		
		EstadoAvion estadoAvion = new EstadoAvion();

		estadoAvion.setDescripcion(teclado.getString("Descripcion: "));

		return estadoAvion;
	}
	
	public EstadoPuerta insertEstadoPuerta(String descripcion) {

		System.out.println("---------- Introducir Estado Puerta -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		
		EstadoPuerta estadoPuerta = new EstadoPuerta();

		estadoPuerta.setDescripcion(teclado.getString("Descripcion: "));

		return estadoPuerta;
	}

	public Localidad insertLocalidad() {

		System.out.println("---------- Introducir Localidad -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		
		Localidad localidad = new Localidad();

		localidad.setNombre(teclado.getString("Nombre: "));
		return localidad;
	}

	public PuertaEmbarque insertPuertaEmbarque() {

		System.out.println("---------- Introducir Puerta Embarque -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		
		PuertaEmbarque puertaEmbarque = new PuertaEmbarque();

		puertaEmbarque.setIdAeropuerto(teclado.getLong("Aeropuerto: "));
		puertaEmbarque.setIdEstadoPuerta(teclado.getLong("Estado Puerta: "));
		
		return puertaEmbarque;
	}
	
	public Vuelo insertVuelo() {

		System.out.println("---------- Introducir Vuelo -----------");
		System.out.println("Para salir en cualquier momento teclee exit\n");
		
		Vuelo vuelo = new Vuelo();

		vuelo.setIdCompañia(teclado.getLong("Compañia: "));
		vuelo.setIdAeropuerto(teclado.getLong("Aeropuerto: "));
		vuelo.setHoraSalida(teclado.getDate("Hora Salida: "));
		vuelo.setHoraLlegada(teclado.getDate("Hora Llegada: "));
		vuelo.setIdPuertaEmbarqueSalida(teclado.getLong("Puerta Embarque Salida: "));
		vuelo.setIdPuertaEmbarqueLlegada(teclado.getLong("Puerta Embarque Llegada: "));
		vuelo.setIdAvion(teclado.getLong("Avion: "));
		
		return vuelo;
	}
	
	public static void main(String[] args) {

		GestionAeropuertos er = new GestionAeropuertos();
		InterfazUsuario interfaz = new InterfazUsuario();
		
		interfaz.menuPrincipal();
}

}
