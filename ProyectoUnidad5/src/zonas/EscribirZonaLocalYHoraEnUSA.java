package zonas;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class EscribirZonaLocalYHoraEnUSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDateTime dateLocal = LocalDateTime.now();
		System.out.println("Fecha Local: " +dateLocal);
		
		ZoneId  zonaLocal= ZoneId.systemDefault();
		ZoneOffset zonaLocalOffset = zonaLocal.getRules().getOffset(dateLocal);
		
		System.out.println("Zona Local:" + zonaLocalOffset);
		Clock reloj = Clock.systemDefaultZone();
		
		zonaLocal = reloj.getZone();
		System.out.println("Zona Local:" + zonaLocal);
		
		ZoneId zonaUs = ZoneId.of("US/Central");
		
		
		ZonedDateTime dateZoneLocal = ZonedDateTime.of(dateLocal, zonaLocal);
		
		System.out.println("Fecha zoned Local: " +dateZoneLocal);
		
			
		ZonedDateTime dateZoneUS = dateZoneLocal.withZoneSameInstant(zonaUs);
		
		System.out.println("Fecha zoned US: " +dateZoneUS);
		
		LocalDateTime localUS = dateZoneUS.toLocalDateTime();
		
		System.out.println("Hora Local US: " +localUS);
		
		//dateZoneUS = dateLocal.atZone(zonaUs);

		
		
		System.out.println("Offset usa:" + dateZoneUS.getZone().getRules().getOffset(localUS));
		
			

	}

}
