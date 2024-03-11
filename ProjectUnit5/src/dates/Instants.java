package dates;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Instants {

	public static void main(String[] args) {
	ZoneId zoneDefault=ZoneId.systemDefault();
	

	// Parsing a string sequence to Instant
    Instant instant1 = Instant.parse("2021-02-09T11:19:42.12Z");
    System.out.println("Parsing the instant: " + instant1);

	
	Clock myClock = Clock.systemDefaultZone();
	
	Instant instant2 = myClock.instant();
	   
	System.out.println("Parsing the instant: " + instant2);


	
	
	LocalDateTime local = LocalDateTime.now();
	
	
	Instant instant3 = local.toInstant(zoneDefault.getRules().getOffset(local));
	
	instant3.toEpochMilli();
	
	
	
	
	LocalDateTime locFromInstant = LocalDateTime.ofInstant(instant3, zoneDefault);
	
	

	}
}
