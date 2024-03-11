package zonas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class EjemploZoneOffset {
	
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		ZoneId zone = ZoneId.of("Europe/Berlin");

		ZoneOffset zoneOffSet = zone.getRules().getOffset(now);

		System.out.println("La hora en berlin respecto a Greenwich es" + zoneOffSet);
		
		
		ZoneId zone2 = ZoneId.of("Asia/Pontianak");

		ZoneOffset zoneOffSet2 = zone2.getRules().getOffset(now);
		
		System.out.println("La hora en Pontianak respecto a Greenwich es:" + zoneOffSet2);
		
	}

}
