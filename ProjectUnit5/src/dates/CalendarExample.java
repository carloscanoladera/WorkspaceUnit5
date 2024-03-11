package dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {

		
		DateFormat formatter = new SimpleDateFormat("dd/M/yy");
		try {
			Date date = formatter.parse("10/01/2022");
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			calendar.add(Calendar.DATE, 5);
			System.out.println(formatter.format(calendar.getTime()));

			TimeZone tf = Calendar.getInstance().getTimeZone();
			System.out.println(tf);

			Calendar freanch = Calendar.getInstance(Locale.FRENCH);

			String f3String = String.format("%1$te %1$tB, %1$tY", freanch);
			System.out.println(f3String);

			Formatter f4 = new Formatter();
			String f4String = String.format(Locale.GERMANY, "%1$te %1$tB, %1$tY", Calendar.getInstance());
			System.out.println(f4String);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
