package zones;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ExampleInstant {

	public static void main(String[] args) {

		ZoneId zoneDefault = ZoneId.systemDefault();

		// Parseando de cadena
		Instant instant1 = Instant.parse("2021-02-09T11:19:42.12Z");
		System.out.println("Parsing the instant: " + instant1);

		Clock myClock = Clock.systemDefaultZone();

		Instant instant2 = myClock.instant();

		System.out.println("Parsing the instant from the Clock class: " + instant2);

		LocalDateTime local = LocalDateTime.now();
		System.out.println("Local date:" + local);

		Instant instant3 = local.toInstant(zoneDefault.getRules().getOffset(local));

		System.out.println("Instant local: " + local);

		System.out.println("milisecs: " + instant3.toEpochMilli());

		// Convert instant to LocalDateTime, no timezone, add a zero offset / UTC+0

		LocalDateTime instantALocal = LocalDateTime.ofInstant(instant3, zoneDefault.getRules().getOffset(local));

		System.out.println(instantALocal);

		// Greenwich
		LocalDateTime instantALocal2 = LocalDateTime.ofInstant(instant3, ZoneOffset.UTC);

		LocalDateTime now = LocalDateTime.now();
		ZoneId zoneBerlin = ZoneId.of("Europe/Berlin");

		System.out.println("Berlin date" + zoneBerlin);

		ZonedDateTime dateZoneBerlin = ZonedDateTime.now(zoneBerlin);

		Instant instant4 = dateZoneBerlin.toInstant();

		System.out.println("instant of zone Berlin: " + instant4);

		ZonedDateTime zonedatetoInstant = instant4.atZone(ZoneId.of("Asia/Tokyo"));

		System.out.println("ZonedDateTime obtained from instant4 : " + zonedatetoInstant);

	}
}
