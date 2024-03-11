package zonas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class EjemploZoneDateTime {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		ZoneId zoneBerlin = ZoneId.of("Europe/Berlin");

		System.out.println(zoneBerlin);

		ZonedDateTime dateZoneBerlin = ZonedDateTime.now(zoneBerlin);

		System.out.println("Berlin:\n");
		System.out.println(dateZoneBerlin);

		ZoneId zoneLondon = ZoneId.of("Europe/London");

		ZonedDateTime londonZoned = dateZoneBerlin.withZoneSameInstant(zoneLondon);
		LocalDateTime londonLocal = londonZoned.toLocalDateTime();
		System.out.println("London:\n");
		System.out.println(londonLocal);

	}

}
