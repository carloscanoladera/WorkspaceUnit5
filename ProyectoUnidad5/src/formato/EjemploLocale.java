package formato;

import java.util.Locale;

public class EjemploLocale {

	public static void main(String[] args) {

		Locale locale = new Locale("fr");
		System.out.println("locale: " + locale);

		// Create a locale object using two parameters constructor
		Locale locale2 = new Locale("sp", "ES");
		System.out.println("locale2: " + locale2);

		// Create a locale object using three parameters constructor
		Locale locale3 = new Locale("en", "US", "south");
		System.out.println("locale3: " + locale3);

		Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("GB").build();
		System.out.println("localeFromBuilder: " + localeFromBuilder);

	}

}
