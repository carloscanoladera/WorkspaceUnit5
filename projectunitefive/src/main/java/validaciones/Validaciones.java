package validaciones;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Validaciones {

	public static final String ESPACIO_BLANCO = " ";
	public static final char CARACTER_BLANCO = ' ';
	public static final char CARACTER_MAS = '+';
	public static final char CARACTER_BARRA = '/';

	public static boolean esEntero(String string) {
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

			if (!esEntero(parteEntera) || !esEntero(parteDecimal)) {

				decimal = false;

			}

		} else {

			decimal = esEntero(string);
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

		while (tokens.hasMoreTokens() && soloLetras) {

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
			index++;
		}

		return soloLetras;
	}

	public static String capitalizaPalabras(String string) {

		String resultado = "";

		StringTokenizer palabras = new StringTokenizer(string);

		while (palabras.hasMoreTokens()) {

			resultado = resultado + capitalizaPalabra(palabras.nextToken()) + ESPACIO_BLANCO;

		}
		resultado= resultado.trim();

		return resultado;

	}

	public static String capitalizaPalabra(String string) {

		String resultado = "";

		resultado = string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();

		return resultado;

	}

	public static boolean validaDni(String dni) {

		if ((dni.length() == 8 || dni.length() == 9) && Character.isUpperCase(dni.charAt(dni.length() - 1))
				&& esEntero(dni.substring(0, dni.length() - 1)))
			return true;

		else
			return false;

	}

	public static boolean validaTelefono(String telefono) {

		if ((telefono.length() == 9 && esEntero(telefono)) || validaTelefonoInternacional(telefono))
			return true;
		else
			return false;

	}

	public static boolean validaTelefonoInternacional(String telefono) {

		if (telefono.length() == 13 && telefono.charAt(0) == CARACTER_MAS && esEntero(telefono.substring(1, 3))
				&& telefono.charAt(3) == CARACTER_BLANCO && esEntero(telefono.substring(4))) {

			return true;

		} else
			return false;

	}

	public static boolean esLetraMayuscula(char letra) {

		if (Character.isLetter(letra) && !Character.isLowerCase(letra))
			return true;
		else
			return false;
	}

	public static boolean validaAnnio2(String annioS) {

		boolean valido = true;
		int annioActual = LocalDate.now().getYear();
		int annio;

		if (!esEntero(annioS)) {

			valido = false;

		} else {

			annio = Integer.valueOf(annioS);

			if (annio < -2000 || annio > annioActual) {

				valido = false;

			}
		}

		return valido;

	}

	public static boolean validaAnnio(String annioS) {

		int annioActual = LocalDate.now().getYear();

		if (esEntero(annioS) && Integer.valueOf(annioS) >= -2000 && Integer.valueOf(annioS) <= annioActual)
			return true;
		else
			return false;

	}

	public static boolean validaAnnio(int annio) {

		int annioActual = LocalDate.now().getYear();

		if (annio >= -2000 && annio <= annioActual)
			return true;
		else
			return false;

	}

	// dd/MM/yyyy
	public static boolean validaFechaConString(String fecha) {

		boolean fechaValida = false;

		int dia, mes, annio = 0;

		if (fecha.length() == 10 && fecha.charAt(2) == CARACTER_BARRA && fecha.charAt(5) == CARACTER_BARRA
				&& esEntero(fecha.substring(0, 2)) && esEntero(fecha.substring(3, 5))
				&& esEntero(fecha.substring(6, 10))) {

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
	public static boolean validaFecha(String fecha) {

		boolean fechaValida = true;
		LocalDate date= null;

		// Por defecto yyyy-MM-dd
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {

			date = LocalDate.parse(fecha, formater);
			
			int dia = Integer.valueOf(fecha.substring(0,2));
			
			if (date.getDayOfMonth() != dia)
				fechaValida = false;
				

		} catch (DateTimeParseException ex) {

			fechaValida = false;
		}

		return fechaValida;

	}
	
	public static boolean validaDireccion(String direccion) {
		
		boolean direccionValida = false;
	
		String array[] = {"Calle", "C\\", "Via", "Ronda", "Plaza", "Avenida" , "Av"};
		
		Arrays.sort(array);
		
		StringTokenizer palabras= new StringTokenizer(direccion);
		
		if (palabras.countTokens() > 1 ) {
			
			String primeraPalabra= palabras.nextToken();
			
			 if (Arrays.binarySearch(array, primeraPalabra)>=0) {
				 
				 direccionValida = true; 
			 }
			
		}		
		
		
		return direccionValida;
	}
	
	public static boolean validaHora(String hora) {
		
		boolean validaHora=true;
		
		try {
		
		LocalTime horaLocal  = LocalTime.parse(hora);
		
		} catch(DateTimeParseException dtpe) {
			
			validaHora=false;			
			
		}
		
		return validaHora;
		
	}
	
	public static boolean validaMatricula(String matricula) {
		
		
		if (matricula.length()==8 && 
				esEntero(matricula.substring(0, 4)) &&
				matricula.charAt(4) == CARACTER_BLANCO &&
				compruebaLetrasCadena(matricula.substring(5, 8))) {
			
			return true;
		} else
			return false;
				
		
	
	}
	
	
	public static boolean validaEdad(int edad) {
		
		return false;
	}
	
	public static boolean validaEdad(String edad) {
		
		return false;
	}
	
}
