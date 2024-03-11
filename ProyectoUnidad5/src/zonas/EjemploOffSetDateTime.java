package zonas;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class EjemploOffSetDateTime {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		ZoneOffset zoneOffSet = ZoneOffset.of("+02:00");

		System.out.println(zoneOffSet);

		OffsetDateTime offSetZonePlusTwo = OffsetDateTime.now(zoneOffSet);

		LocalDateTime Local = offSetZonePlusTwo.toLocalDateTime();

		System.out.println("Fecha Local en zona +2:00:\n");
		System.out.println(Local);

		ZoneId zone2 = ZoneId.of("Asia/Pontianak");

		ZoneOffset zoneOffSet2 = zone2.getRules().getOffset(now);

		OffsetDateTime offSetZonePontianak = OffsetDateTime.now(zoneOffSet2);

		LocalDateTime LocalPontianak = offSetZonePontianak.toLocalDateTime();

		System.out.println("Fecha Local en zona Pontianak:\n");
		System.out.println(LocalPontianak);

	}

}
