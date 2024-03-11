package zones;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class ExampleZoneOffset {
	
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		ZoneId zone = ZoneId.of("Europe/Madrid");

		ZoneOffset zoneOffSet = zone.getRules().getOffset(now);

		System.out.println("Time in Berlin compared to Greenwich is" + zoneOffSet);
		
		
		ZoneId zone2 = ZoneId.of("Asia/Pontianak");

		ZoneOffset zoneOffSet2 = zone2.getRules().getOffset(now);
		
		System.out.println("Time in Pontianak compared with Greenwich is:" + zoneOffSet2);
		
	}

}
