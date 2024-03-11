package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternYMatcherMatchAndFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejemplos de Expresiones Regulares en Java:1. Comprobar si el String cadena
		// contiene exactamente el patrón (matches) “abc”Pattern

		String cadena = "dasfabcsdfds";

		Pattern pat = Pattern.compile("abc");
		Matcher mat = pat.matcher(cadena);
		if (mat.matches()) {
			
			
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		// Comprobar si el String cadena contiene “abc”
		//
		Pattern.compile(".*abc.*");
		Matcher mat2 = pat.matcher(cadena);
		if (mat2.find()) {
			
			System.out.print("Start index: " + mat2.start());
            System.out.print(" End index: " + mat2.end() + " ");
            System.out.println(mat2.group());
			System.out.println("SI");
		} else {
			System.out.println("NO");
		} // También lo podemos escribir usando el método find:

		// Validar un DNI
		String dni = "44567894";

		Pattern patdni = Pattern.compile("^[0-9]{8}");
		Matcher matdni = pat.matcher(dni);
		if (matdni.matches()) {
			System.out.println("EL DNI es valido");

		} else {
			System.out.println("EL DNI es valido");
		}
	

		//  Comprobar si el String cadena contiene “as”
		String cadenasAS = "adadasdfd";

		Pattern patAs = Pattern.compile("\\w*\\B(as)\\B\\w*");
		Matcher matAs = patAs.matcher(cadenasAS);
		if (matAs.matches()) {
			System.out.println("Contiene as");

		} else {
			System.out.println("No contiene as");
		}

		
		

	}

}
