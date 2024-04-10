package formato;

import java.util.Locale;

public class StringFormat {

	public static void main(String[] args) {

		Locale locale = new Locale("fr");
		System.out.println("locale: " + locale);

		// Create a locale object using two parameters constructor
		Locale locale2 = new Locale("sp", "ES");
		System.out.println("locale2: " + locale2);

		// Create a locale object using three parameters constructor
		Locale locale3 = new Locale("en", "US", "south");
		System.out.println("locale3: " + locale3);

		// A local object from Locale.Builder
		Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("GB").build();
		System.out.println("localeFromBuilder: " + localeFromBuilder);

		String nombre = "Lobito";

		float salario = 45.678756885f;

		System.out.println(String.format("El nombre es %s", nombre));
		String sf2 = String.format("El salario es %f1", salario);
		System.out.println(sf2);

		System.out.println(String.format(locale2, "el valor del salario es %1$4.4f", salario));

		System.out.println(
				String.format(locale2, "Persona con nombre %s el valor del salario es %4.4f", nombre, salario));

		System.out.println(String.format(locale2,
				"Para el trabajador %1$20s  con salario %2$4.4f  %n " + " o con más precisión es %2$2f y edad %3$f",
				nombre, salario, 56.3f));

		System.out.println(String.format(locale2, "%1$-20s %2$-10s %3$-20s %4$-6s ", "Nombre", "salario",
				"salario-precisión", "Edad"));

		System.out.println(String.format(locale2, "%1$-20s %2$-10s %3$-20s %4$-6s ", "--------------------",
				"----------", "-----------------", "------"));

		System.out.println(String.format(locale2, "%1$-20s %2$-10.4f %2$-20f %3$-6.1f", nombre, salario, 56.3f));

		
		System.out.println(String.format(locale2, "%1$-20s %2$010.4f %2$-+20f %3$,- 6.1f", nombre, salario, 56.3f));

		
	}

}
