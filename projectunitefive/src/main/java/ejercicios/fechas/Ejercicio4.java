package ejercicios.fechas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import static java.time.temporal.ChronoUnit.MINUTES;;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime now = LocalDateTime.now();
		ZoneId zoneLondon = ZoneId.of("Europe/London");	
	
		System.out.println(zoneLondon);		

		ZonedDateTime dateZoneLondon = ZonedDateTime.now(zoneLondon);

		System.out.println("Londres:\n");
		System.out.println(dateZoneLondon);	
		
		LocalDateTime londonLocal = dateZoneLondon.toLocalDateTime();
		
		System.out.println(londonLocal);	
		
		
		
		ZoneId zoneIndia = ZoneId.of("Asia/Kolkata");	
	
		ZonedDateTime indiaZoned = dateZoneLondon.withZoneSameInstant(zoneIndia);
		LocalDateTime indiaLocal = indiaZoned.toLocalDateTime();

		System.out.println("India:\n");
		System.out.println(indiaZoned);
		System.out.println(indiaLocal);	
		
		
		System.out.println(MINUTES.between(indiaZoned, dateZoneLondon));	
		

		ZoneId.getAvailableZoneIds().stream().filter(zone->zone.contains("America")).forEach(System.out::println);
		
		
		for (String zone:  ZoneId.getAvailableZoneIds()) {
			
			
			if (zone.contains("America"))
				System.out.println(zone);
			
		}
		
		System.out.println("\nReglas: " + ZoneId.of("Europe/London").getRules());
	
		
	}

}
