package ejercicio.notas.datos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.StringTokenizer;

import ejercicio.notas.excepciones.EntradaDeDatosException;
import ejercicio.notas.excepciones.MenuException;

public class EntradaDeDatos {

	private static final Scanner sc = new Scanner(System.in);
	private static final String SEPARADOR_REFERENCIA = "-";

	public static int leerOpcionMenu(int min, int max) throws MenuException {

		int opcion = -1;
		String opcionInput = sc.nextLine();

		if (esCadenaNumerica(opcionInput)) {

			opcion = Integer.valueOf(opcionInput);

		}

		if (opcion < min || opcion > max) {
			throw new MenuException("Opción incorrecta. \nIntroduzca una opcion entre " + min + " y " + max, min, max);
		}

		return opcion;

	}

	public static String getTexto() throws EntradaDeDatosException {

		String texto = sc.nextLine();

		if (texto.isEmpty()) {

			throw new EntradaDeDatosException("El texto de la nota no puede ser vacio");
		}

		return texto;

	}

	public static String getColor() throws EntradaDeDatosException {

		String color = sc.nextLine();

		StringTokenizer token = new StringTokenizer(color);

		if (color.isEmpty() || token.countTokens() > 2) {

			throw new EntradaDeDatosException("El color de la nota no puede ser vacio o contener más de dos palabras");

		}

		return color;

	}

	public static int getNumPalabraComienzo() throws EntradaDeDatosException {

		String sNumPalabra = sc.nextLine();
		int numPalabra = 0;
		boolean numValido = true;

		if (esCadenaNumerica(sNumPalabra)) {

			numPalabra = Integer.valueOf(numPalabra);

			if (numPalabra < 0)
				numValido = false;
		} else {

			numValido = false;
		}

		if (!numValido)
			throw new EntradaDeDatosException("La palabra de comienzo debe ser numerica y positiva");

		return numPalabra;

	}

	public static LocalTime getHora() throws EntradaDeDatosException {

		LocalTime horaT;

		String hora = sc.nextLine();
		try {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		horaT = LocalTime.parse(hora, formatter);
		} catch (DateTimeParseException dex) {
			
			throw new EntradaDeDatosException("El formato de hora debe ser hh:mm:ss, por ejemplo, 21:10:34 o 00:55:24");

		}
		
		
		return horaT;

	}
	
	
	public static void pulsaEnterParaContinuar() {

		System.out.println("Pulsa enter para continuar.........");
		sc.nextLine();

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
