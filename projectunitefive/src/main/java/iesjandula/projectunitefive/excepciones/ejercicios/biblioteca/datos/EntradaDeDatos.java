package iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.datos;

import java.util.Scanner;
import java.util.StringTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.excepciones.EntradaDeDatosException;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.excepciones.MenuException;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.EnumLibro;


// esto es una clase sin estado, de funcionalidad, por lo que hacemos todo STATIC.
public class EntradaDeDatos {

	private static final Scanner sc = new Scanner(System.in);
	private static final String SEPARADOR_REFERENCIA = "-";
	private static final int LONGITUD_REFERENCIA = 17;
	
	private static final Logger logger = LogManager.getLogger();
	private static final Marker marker = MarkerManager.getMarker(EntradaDeDatos.class.toString());


	
	
	public static int leerOpcionMenu(int min, int max) throws MenuException {
		
		int opcion=-1;
		String opcionInput = sc.nextLine();
	
		if (esCadenaNumerica(opcionInput)) {
			
			opcion=Integer.valueOf(opcionInput);
			
		}
		
		if (opcion < min || opcion > max) {
			throw new MenuException("Opción incorrecta. \nIntroduzca una opcion entre " + min + " y " + max, min, max);
		}
		

		return opcion;

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

	public static String leerEditorial() {
		
		String editorial = sc.nextLine();
		
		return primeraMayuscula(editorial);
	}
	
	public static String leeReferenciaLibro() throws EntradaDeDatosException  {

		boolean bCorrecto = true;
		int contador = 0;
		int[] arrayLongitudes = { 3, 1, 2, 1, 4, 1, 3, 1, 1 };
		String token = "";

		String referencia = sc.nextLine();

		referencia.trim();

		if (referencia.length() != LONGITUD_REFERENCIA || !referencia.contains(SEPARADOR_REFERENCIA)) {
			bCorrecto = false;
		}

		StringTokenizer sToken = new StringTokenizer(referencia, SEPARADOR_REFERENCIA, true);
		
		logger.debug(marker, "Comienzo del while de validación de la referencia de libro ");

		while (sToken.hasMoreTokens() && bCorrecto) {

			token = sToken.nextToken();

			if (contador % 2 == 0 && token.length() != arrayLongitudes[contador] && !esCadenaNumerica(token)) {
				bCorrecto = false;
			}

			if (contador % 2 != 0 && token.length() != arrayLongitudes[contador]
					&& !token.equals(SEPARADOR_REFERENCIA)) {
				bCorrecto = false;
			}

			contador++;

		}
		
		logger.debug(marker, "El while de validación de la referencia de libro funciona correctamente");
		
		if (!bCorrecto) {
			throw new EntradaDeDatosException("La referencia introducida no es valida.\nSiga el formato indicado. \nFormato nnn-nn-nnnn-nnn-n ");
		}

		return referencia;
	}

	/*
	 * es un numero entre -5000 y 2020
	 *
	 */

	public static int leerAnnio() throws EntradaDeDatosException {

		int annioNum = 0;
		String annio = sc.nextLine();
		
		boolean bCorrecto = true;

		if (esCadenaNumerica(annio)) {
			annioNum = Integer.valueOf(annio);

			if (annioNum <= -5000 && annioNum <= 2024) {
				bCorrecto=true;
			}

		}
		
		if (!bCorrecto) {
			throw new EntradaDeDatosException("El año introducido no es valido. |\nIntroduzca un año en formato numerico entre -5000 y 2024.");
		}

		return annioNum;
	}

	/*
	 *
	 * Asegurarse de poner todo en minusculas menos las mayusculas
	 *
	 */

	public static String leerNombreYApellidosAutor() {

		String nombreApellidosFormateado = "";
		String nombreApellidos = sc.nextLine();
		nombreApellidos.trim();
		StringTokenizer tokens = new StringTokenizer(nombreApellidos);

		
		logger.debug(marker, "Comienzo del while de validación de nombre y apellidos ");
		while (tokens.hasMoreTokens()) {

			nombreApellidosFormateado = nombreApellidosFormateado + " " + primeraMayuscula(tokens.nextToken());

		}
		
		logger.debug(marker, " while de validación de nombre y apellidos funciona correctamente");

		nombreApellidosFormateado.trim();
		
		return nombreApellidosFormateado;

	}
	
	public static String getNombreAutor( String nombreYApellidos ) {
			
		StringTokenizer tokens  = new StringTokenizer(nombreYApellidos);
			
		return tokens.nextToken();
	}
	
	public static String getApellidosAutor( String nombreYApellidos ) {
		String apellidos ="";
		
		StringTokenizer tokens  = new StringTokenizer(nombreYApellidos);
			
		tokens.nextToken();
		
		while (tokens.hasMoreTokens()) {
			apellidos+=tokens.nextToken() + " ";
		}
		
		apellidos.trim();
		return apellidos;
	}

	/*
	 *
	 * Leer DNI formato XXXXXXXL o XXXXXXXXL donde X es numero y L letra
	 *
	 */

	public static String leerDniAutor() throws EntradaDeDatosException {

		boolean bCorrecto = false;
		String dni = sc.nextLine();

		if ((dni.length() == 8 || dni.length() == 9) && esCadenaNumerica(dni.substring(0, dni.length() - 2))

				&& Character.isLetter(dni.charAt(dni.length() - 1))) {

			bCorrecto = true;

		}
		
		if (!bCorrecto) {
			throw new EntradaDeDatosException("El DNI introducido no es valido.\n Use el formato NNNNNNNL o NNNNNNNNL donde N equiuvale a un numero y L equivale a letra.");
		}
		
		return dni;

	}

	public static EnumLibro leerTipoLibro() throws EntradaDeDatosException {

		EnumLibro tipoRetornado = EnumLibro.NOVELA;
		String numTipo = sc.nextLine();
		int tipoLibIndex = -1; // poner de default -1 permite saltarse el escribir una excpecion o booleano o contorl de IF

		if (esCadenaNumerica(numTipo)) {

			tipoLibIndex = Integer.valueOf(numTipo);

		}

		// Excepción de rango numerico.
		if (tipoLibIndex<0 && (tipoLibIndex>EnumLibro.values().length-1))
		{
			throw new EntradaDeDatosException("Introduzca un numero del 0 al " + (tipoLibIndex>EnumLibro.values().length-1));
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