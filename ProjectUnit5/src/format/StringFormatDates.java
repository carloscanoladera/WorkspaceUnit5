package format;

import java.time.LocalDateTime;
import java.util.Locale;

public class StringFormatDates {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.parse("2021-08-14T19:34:50.63");

		Locale localeUs = new Locale("en", "US");
		System.out.println("locale: " + localeUs);

		// Create a locale object using two parameters constructor
		Locale localeEs = new Locale("sp", "ES");
		System.out.println("locale2: " + localeEs);

		System.out.println("Fecha en formato americano:" + String.format(localeUs, " %tD", date));
		System.out.println("Fecha en formato español:" + String.format(localeEs, "%1$td-%1$tm-%1$tY", date));

		System.out.println("Fecha en formato ISO8601" + String.format(localeUs, " %tF", date));
		System.out.println("Hora en formato 24 horas:" + String.format(localeUs, "%tR", date));

		System.out.println("Hora en formato 12 horas:" + String.format(localeUs, "%tr", date));

		String fullDate = String.format(localeEs, "Date: %1$td-%1$tb-%1$tY  Time: %1$tH:%1$tm:%1$tS", date);

		System.out.println("Fecha completa en formato 24 horas:" + fullDate);

		String fullDatePM = String.format(localeEs, "Fecha: %1$td-%1$tm-%1$tY  Time: %1$tl:%1$tm:%1$tS %1$tp", date);

		System.out.println("Fecha AMPM:" + fullDatePM);

	}
}
