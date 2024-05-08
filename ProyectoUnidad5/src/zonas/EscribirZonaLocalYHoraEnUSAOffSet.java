package zonas;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class EscribirZonaLocalYHoraEnUSAOffSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDateTime dateLocal = LocalDateTime.now();
		System.out.println("Fecha Local: " +dateLocal);
		
		ZoneId  zonaLocal= ZoneId.systemDefault();
		ZoneOffset zonaLocalOffset = zonaLocal.getRules().getOffset(dateLocal);
		
		OffsetDateTime OffsetDateLocal 	= OffsetDateTime.of(dateLocal, zonaLocalOffset);	
		
		System.out.println("Hora local:" + OffsetDateLocal );
		
		ZoneId zonaUs = ZoneId.of("US/Central");	
		
		Instant instant = Instant.now();
		ZoneOffset zoneOffsetLocalUS = zonaUs.getRules().getOffset(instant);
		
		OffsetDateTime OffsetDateUS = OffsetDateLocal.withOffsetSameInstant(zoneOffsetLocalUS);
		
		
		System.out.println("Hora america:" + OffsetDateUS );

	}

}
