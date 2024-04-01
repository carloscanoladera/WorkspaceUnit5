package iesjandula.projectunitefive.excepciones.biblioteca.datos;

import java.util.Scanner;
import java.util.StringTokenizer;

import iesjandula.projectunitefive.excepciones.biblioteca.modelo.EnumLibro;

public class EntradaDeDatos {

	private static final Scanner sc = new Scanner(System.in);

	public static int leerOpcionMenu(int min, int max) {

		return 0;

	}
	/*
	 * Poner la primera letra con mayusculas y el resto con minucula y hacer trim
	 * 
	 */

	public static String leerTitulo() {

		String titulo = sc.nextLine();

		return primeraMayuscula(titulo);

	}
	/*
	 * Formato 978-84-2834-286-5
	 * 
	 */

	public static String leeReferenciaLibro() {

		return "";
	}

	/*
	 * es un numero entre -5000 y 2020
	 * 
	 */

	public static int leerAnnio() {

		int annioNum = 0;
		String annio = sc.nextLine();

		if (esCadenaNumerica(annio)) {

			annioNum = Integer.valueOf(annio);

			/*
			 * if (annioNum >= -5000 && annioNum <= 2020)) {
			 * 
			 * 
			 * }
			 */

		}

		return annioNum;
	}

	/*
	 * 
	 * Asegurarse de poner todo en minusculas menos las mayusculas
	 * 
	 */

	public static String leerNombreAutor() {

		String nombreApellidosFormateado = "";
		String nombreApellidos = sc.nextLine();
		nombreApellidos.trim();
		StringTokenizer tokens = new StringTokenizer(nombreApellidos);

		while (tokens.hasMoreTokens()) {

			nombreApellidosFormateado = nombreApellidosFormateado + " " + primeraMayuscula(tokens.nextToken());

		}

		return nombreApellidosFormateado;

	}

	/*
	 * 
	 * Leer DNI formato XXXXXXXL o XXXXXXXXL donde X es numero y L letra
	 * 
	 */

	public static String leerDniAutor() {

		boolean bCorrecto = false;
		String dni = sc.nextLine();

		if ((dni.length() == 8 || dni.length() == 9) && esCadenaNumerica(dni.substring(0, dni.length() - 2))

				&& Character.isLetter(dni.charAt(dni.length() - 1))) {

			bCorrecto = true;

		}

		return dni;

	}

	public static EnumLibro leerTipoLibro() {

		EnumLibro tipoRetornado = EnumLibro.NOVELA;
		String numTipo = sc.nextLine();
		int tipoLibIndex = 0;

		if (esCadenaNumerica(numTipo)) {

			tipoLibIndex = Integer.valueOf(numTipo);

		}

		tipoRetornado = EnumLibro.values()[tipoLibIndex];

		return tipoRetornado;
	}

	public static void pulsaEnterParaContinuar() {

		System.out.println("Pulsa enter para continuar.........");
		sc.nextLine();

	}

	private static String primeraMayuscula(String cadena) {

		cadena = cadena.trim();
		cadena = cadena.toLowerCase();
		cadena = cadena.substring(0, 1).toUpperCase() + cadena.substring(1, cadena.length() - 1);

		return cadena;

	}

	private static boolean esCadenaNumerica(String numero) {

		boolean esNumero = true;

		for (int i = 0; i < numero.length(); i++) {

			if (!Character.isDigit(numero.charAt(i))) {

				esNumero = false;
			}
		}

		return esNumero;
	}
}
