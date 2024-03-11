package fechas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class EjemploCalendar {

	public static void main(String[] args) {

		// define el formato de la fecha
		DateFormat formateador = new SimpleDateFormat("dd/M/yy");
		try {
			// convierte un String en formato fecha en una fecha real
			Date fecha = formateador.parse("10/01/2022");
			// creamos un calendario
			Calendar calendario = new GregorianCalendar();
			// hacemos calculos sobre el calendario
			calendario.setTime(fecha);
			// movemos el ccalendario
			calendario.add(Calendar.DATE, 5);
			// usamos el formateador y volvemos a mostrar la fecha
			System.out.println(formateador.format(calendario.getTime()));

			TimeZone tf = Calendar.getInstance().getTimeZone();
			System.out.println(tf);

			Calendar frances = Calendar.getInstance(Locale.FRENCH);

			String f3String = String.format("%1$te %1$tB, %1$tY", frances);
			System.out.println(f3String);

			Formatter f4 = new Formatter();
			String f4String = String.format(Locale.GERMANY, "%1$te %1$tB, %1$tY", Calendar.getInstance());
			System.out.println(f4String);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
