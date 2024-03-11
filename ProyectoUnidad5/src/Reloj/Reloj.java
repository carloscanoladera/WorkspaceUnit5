package Reloj;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Reloj {

	public static void main(String[] args) throws InterruptedException  {
	ZoneId zoneLocal=ZoneId.systemDefault();
	

	
	ZoneId TIMEZONE_ET = ZoneId.of("US/Eastern");
	
	//Reloj local
	Clock myClock = Clock.systemDefaultZone();
	
	
	Clock useastClock = Clock.system(TIMEZONE_ET);
	

	
		System.out.println("Segundos:" +  useastClock.tickSeconds(TIMEZONE_ET));
		
		
		System.out.println("Millis:" + useastClock.tickMillis(TIMEZONE_ET));
		
		System.out.println("Minutes:" + useastClock.tickMinutes(TIMEZONE_ET));
		
	
		
		
		

	}
}
