package formato;

import java.time.LocalDateTime;
import java.util.Locale;

public class StringFormatFechas {
	
	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.parse("2021-08-14T19:34:50.63");

		Locale localeUs = new Locale("en", "US");
		System.out.println("locale: " + localeUs);

		// Create a locale object using two parameters constructor
		Locale localeEs = new Locale("sp", "ES");
		System.out.println("locale2: " + localeEs);

		System.out.println("Fecha america:" + String.format(localeUs, " %tD", date));
		System.out.println("Fecha española:" + String.format(localeEs, "%1$td-%1$tm-%1$tY", date));

	System.out.println("Fecha formato ISO 8601" + String.format(localeUs, " %tF", date));

		System.out.println("Hora en 24 horas:" + String.format(localeUs, "%tR", date));

		System.out.println("Hora en 12 horas:" + String.format(localeUs, "%tr", date));

	

		System.out.println("Fecha española:" + String.format(localeEs, "%1$td-%1$tm-%1$tY", date));

		String fechaCompleta = String.format(localeEs, "Fecha: %1$td-%1$tb-%1$tY  Hora: %1$tH:%1$tm:%1$tS", date);

		System.out.println("Fecha 24 horas:" + fechaCompleta);

		String fechaCompletaPM = String.format(localeEs, "Fecha: %1$td-%1$tm-%1$tY  Hora: %1$tl:%1$tm:%1$tS %1$tp",
				date);

		System.out.println("Fecha AMPM:" + fechaCompletaPM);

	}
}
