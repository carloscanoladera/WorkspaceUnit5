package zones;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZoneDateTime2 {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.parse("2021-08-14T19:34:50.63");

		System.out.println("Local:" + date);
		ZoneId zoneLocal = ZoneId.systemDefault();
		LocalDateTime dateUs;
		ZoneId zoneUS = ZoneId.of("US/Eastern");
		ZonedDateTime dateZoneLocal = ZonedDateTime.of(date, zoneLocal);

		System.out.println("Zoned Local:" +dateZoneLocal);
		
		ZonedDateTime dateZoneUS = dateZoneLocal.withZoneSameInstant(zoneUS);

		LocalDateTime dateLocalUs = dateZoneLocal.toLocalDateTime();
		System.out.println(dateZoneUS);

		System.out.println("Zoned America:" +dateZoneUS);
		
		dateUs = dateZoneUS.toLocalDateTime();

		System.out.println("Local America:" + dateUs);
	}

}
