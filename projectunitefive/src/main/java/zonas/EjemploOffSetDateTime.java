package zonas;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class EjemploOffSetDateTime {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		ZoneOffset zoneOffSet = ZoneOffset.of("+04:00");

		System.out.println(zoneOffSet);

		OffsetDateTime offSetDateZonePlus4 = OffsetDateTime.now(zoneOffSet);
		LocalDateTime Local = offSetDateZonePlus4.toLocalDateTime();

		System.out.println("Local Zone +4:00:");
		System.out.println(Local);

		ZoneId zonePontianak = ZoneId.of("Asia/Pontianak");

		ZoneOffset zoneOffSetPontianak = zonePontianak.getRules().getOffset(now);
		System.out.println("Offset Pontianak" + zoneOffSetPontianak);

		OffsetDateTime offSetDateZonePontianak = offSetDateZonePlus4.withOffsetSameInstant(zoneOffSetPontianak);

		System.out.println("OffsetDate Pontianak:" + offSetDateZonePontianak);

		LocalDateTime LocalPontianak = offSetDateZonePontianak.toLocalDateTime();

		System.out.println("Local Pontianak:");
		System.out.println(LocalPontianak);
		
		ZonedDateTime zonedPontianak = offSetDateZonePlus4.atZoneSameInstant(zoneOffSetPontianak);
		System.out.println("Zoned Pontianak:" + zonedPontianak);
		OffsetDateTime offsetDatePontianak = zonedPontianak.toOffsetDateTime();
		



	}

}
