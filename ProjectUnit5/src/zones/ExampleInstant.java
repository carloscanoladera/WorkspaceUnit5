package zones;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ExampleInstant {

public static void main(String[] args) {
		

		ZoneId zoneDefault = ZoneId.systemDefault();

		// Parseando de cadena
		Instant instant1 = Instant.parse("2021-02-09T11:19:42.12Z");
		System.out.println("Parseado el instante: " + instant1);

		Clock myClock = Clock.systemDefaultZone();

		Instant instant2 = myClock.instant();

		System.out.println("Instant Fropm my Clock: " + instant2);

		LocalDateTime local = LocalDateTime.now();
		System.out.println("Local date:" + local);

		Instant instantNow = local.toInstant(zoneDefault.getRules().getOffset(local));

		System.out.println("Instant local: " + instantNow);

		System.out.println("milisecs: " + instantNow.toEpochMilli());
		
		//Greenwich
		LocalDateTime instantLocal2 = LocalDateTime.ofInstant(instantNow, ZoneOffset.UTC);

		// Convert instant to LocalDateTime, no timezone, adding the local  offset

		LocalDateTime instantALocal = LocalDateTime.ofInstant(instantNow, zoneDefault.getRules().getOffset(local));

		System.out.println("Local date from instant:" + instantALocal);	
		
		ZonedDateTime zonedateFromInstant = instantNow.atZone(ZoneId.of("Asia/Tokyo"));

		System.out.println("ZonedDateTime obtained from instant for Japon: " + zonedateFromInstant);
		
		instantNow = zonedateFromInstant.toInstant();
		
		System.out.println("Instant from Zoned:" + instantNow);
		
		OffsetDateTime offsetdatefromInstant = instantNow.atOffset(ZoneOffset.of("+04"));

		System.out.println("OffsetDateTime +04 " + zonedateFromInstant);

	}
}
