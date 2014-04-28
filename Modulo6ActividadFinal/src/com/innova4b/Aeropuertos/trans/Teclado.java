package com.innova4b.Aeropuertos.trans;

/**
 * @author David Ferrero Ferrero
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Teclado {

	public int getInt(String mensaje) {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(
				System.in));
		String cadena;
		int return_value = -1;

		try {
			int bucle = 0;
			while (bucle == 0) {

				System.out.println(mensaje);
				cadena = lectura.readLine();

				if (cadena.equalsIgnoreCase("exit")) {
					break;
				}// if

				try {
					return_value = Integer.parseInt(cadena);
					bucle = 1;
				} catch (Exception NumberFormatException) {
					System.out.println("El campo debe ser numerico");
				}// try
			}// while
		} catch (IOException e) {
			System.out.println("Error Lectura");
			e.printStackTrace();
			return -1;
		}// try

		return return_value;
	}// getDato

	public Long getLong(String mensaje) {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(
				System.in));
		String cadena;
		Long return_value = -1L;

		try {
			int bucle = 0;
			while (bucle == 0) {

				System.out.println(mensaje);
				cadena = lectura.readLine();

				if (cadena.equalsIgnoreCase("exit")) {
					break;
				}// if

				try {
					return_value = Long.parseLong(cadena);
					bucle = 1;
				} catch (Exception NumberFormatException) {
					System.out.println("El campo debe ser numerico");
				}// try
			}// while
		} catch (IOException e) {
			System.out.println("Error Lectura");
			e.printStackTrace();
			return -1L;
		}// try

		return return_value;
	}// getLong

	public Date getDate(String mensaje) {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(
				System.in));
		String cadena = "";
		Date return_value = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy",
				Locale.getDefault());
		dateFormat.setLenient(false);

		try {
			int bucle = 0;
			while (bucle == 0) {

				System.out.println(mensaje);
				cadena = lectura.readLine();

				if (cadena.equalsIgnoreCase("exit")) {
					break;
				}// if

				try {
					return_value = dateFormat.parse(cadena);
					bucle = 1;
				} catch (ParseException e) {
					System.out
							.println("Error en el formato de la fecha. Este debe ser dd/MM/yyyy");
				}
			}// while
		} catch (IOException e) {
			System.out.println("Error Lectura");
			e.printStackTrace();
			return null;
		}// try
		return return_value;
	}// getDate

	public String getString(String mensaje) {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println(mensaje);
			return lectura.readLine();
		} catch (IOException e) {
			System.out.println("Error Lectura");
			e.printStackTrace();
			return null;
		}// try
	}// getString

	public static void main(String[] args) {
		Teclado t = new Teclado();
		System.out.println("El valor  introducido es " + t.getInt("Valor"));
		System.out.println("El valor  introducido es " + t.getDate("Fecha").toString());
	}

}
