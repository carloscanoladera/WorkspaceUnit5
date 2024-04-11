package validaciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.StringTokenizer;

public class Validaciones {

	public static final String ESPACIO_BLANCO = " ";
	public static final char CARACTER_BLANCO = ' ';
	public static final char CARACTER_MAS = '+';
	public static final char CARACTER_BARRA = '/';

	public static boolean esNumerica(String string) {
		boolean numerica = true;
		int cont = 0;

		Character.isDigit(0);

		while (cont < string.length() && numerica) {

			if (!Character.isDigit(string.charAt(cont)))
				numerica = false;

			cont++;
		}

		return numerica;

	}

	public static boolean esDecimal(String string) {
		boolean decimal = true;
		StringTokenizer token = new StringTokenizer(string, ".");

		// 999 // 99.99

	    if (token.countTokens() == 2) {

			String parteEntera = token.nextToken();
			String parteDecimal = token.nextToken();

			if (!esNumerica(parteEntera) || !esNumerica(parteDecimal)) {

				decimal = false;

			}

		} else {

			decimal = esNumerica(string);
		}

		return decimal;

	}

	public static boolean validarNombre(String nombre) {

		boolean valido = true;

		if (nombre.isBlank()) {
			valido = false;
		} else {

			StringTokenizer tokens = new StringTokenizer(nombre);

			if (tokens.countTokens() > 4) {
				valido = false;

			} else {

				valido = compruebaLetrasTokenizer(tokens);
			}

		}
		return valido;

	}

	public static boolean validaApellidos(String apellidos) {
		boolean valido = true;

		if (apellidos.isBlank()) {
			valido = false;
		} else {

			StringTokenizer tokens = new StringTokenizer(apellidos);

			if (tokens.countTokens() > 10) {
				valido = false;

			} else {

				valido = compruebaLetrasTokenizer(tokens);
			}

		}

		return valido;

	}

	public static boolean compruebaLetrasTokenizer(StringTokenizer tokens) {
		// TODO Auto-generated method stub
		boolean soloLetras = true;
		String palabra;

		while (tokens.hasMoreTokens()) {

			palabra = tokens.nextToken();

			soloLetras = compruebaLetrasCadena(palabra);

		}

		return soloLetras;
	}

	public static boolean compruebaLetrasCadena(String palabra) {
		// TODO Auto-generated method stub
		boolean soloLetras = true;
		int index = 0;

		while (index < palabra.length() && soloLetras) {

			if (!Character.isLetter(palabra.charAt(index))) {

				soloLetras = false;

			}
		}

		return soloLetras;
	}

	public String capitalizaPalabras(String string) {

		String resultado = "";

		StringTokenizer palabras = new StringTokenizer(string);

		while (palabras.hasMoreTokens()) {

			resultado = resultado + capitalizaPalabra(palabras.nextToken()) + ESPACIO_BLANCO;

		}
		resultado.trim();

		return resultado;

	}

	public String capitalizaPalabra(String string) {

		String resultado = "";

		resultado = string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();

		return resultado;

	}

	public boolean validaDni(String dni) {

		if ((dni.length() == 7 || dni.length() == 8) && Character.isUpperCase(dni.charAt(dni.length() - 1))
				&& esNumerica(dni.substring(0, dni.length() - 1)))
			return true;

		else
			return false;

	}

	public boolean validaTelefono(String telefono) {

		if ((telefono.length() == 9 && esNumerica(telefono)) || validaTelefonoInternacional(telefono))
			return true;
		else
			return false;

	}

	public boolean validaTelefonoInternacional(String telefono) {

		if (telefono.length() == 13 && telefono.charAt(0) == CARACTER_MAS && esNumerica(telefono.substring(1, 3))
				&& telefono.charAt(3) == CARACTER_BLANCO && esNumerica(telefono.substring(4))) {

			return true;

		} else
			return false;

	}

	public boolean esLetraMayuscula(char letra) {

		if (Character.isLetter(letra) && !Character.isLowerCase(letra))
			return true;
		else
			return false;
	}

	public boolean validaAnnio2(String annioS) {

		boolean valido = true;
		int annioActual = LocalDate.now().getYear();
		int annio;

		if (!esNumerica(annioS)) {

			valido = false;

		} else {

			annio = Integer.valueOf(annioS);

			if (annio < -2000 || annio > annioActual) {

				valido = false;

			}
		}

		return valido;

	}

	public boolean validaAnnio(String annioS) {

		int annioActual = LocalDate.now().getYear();

		if (esNumerica(annioS) && Integer.valueOf(annioS) >= -2000 && Integer.valueOf(annioS) <= annioActual)
			return true;
		else
			return false;

	}

	public boolean validaAnnio(int annio) {

		int annioActual = LocalDate.now().getYear();

		if (annio >= -2000 && annio <= annioActual)
			return true;
		else
			return false;

	}

	// dd/MM/yyyy
	public boolean validaFechaConString(String fecha) {

		boolean fechaValida = false;

		int dia, mes, annio = 0;

		if (fecha.length() == 10 && fecha.charAt(2) == CARACTER_BARRA && fecha.charAt(5) == CARACTER_BARRA
				&& esNumerica(fecha.substring(0, 2)) && esNumerica(fecha.substring(3, 5))
				&& esNumerica(fecha.substring(6, 10))) {

			dia = Integer.valueOf(fecha.substring(0, 2));
			mes = Integer.valueOf(fecha.substring(3, 5));
			annio = Integer.valueOf(fecha.substring(6, 10));

			if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (validaAnnio(annio))) {

				fechaValida = true;
			}

		}

		return fechaValida;
	}

	// dd/MM/yyyy
	public boolean validaFecha(String fecha) {

		boolean fechaValida = true;

		// Por defecto yyyy-MM-dd
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {

			LocalDate date = LocalDate.parse(fecha, formater);

		} catch (DateTimeParseException ex) {

			fechaValida = false;
		}

		return fechaValida;

	}

}
