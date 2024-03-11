package dates;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



public class HandlingLocalDate {
	
	public static void main(String[] args) {
		
		LocalDate date= LocalDate.now();
		
		
		System.out.println(date);
		
		LocalDate date2 = LocalDate.of(2021, 5, 9);
		
		System.out.println("day " + date2.getDayOfMonth() + " month " + date2.getMonthValue() + " year " + date2.getYear());


		LocalDate date3 = LocalDate.parse("2021-08-14");
		
		System.out.println("day of the year " + date2.getDayOfMonth() + " Month " + date2.getMonth() + " Era " + date2.getEra());
		
	
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		  
	        // create a LocalDate object and
	        LocalDate date4
	            = LocalDate.parse("06-09-2021", formatter);
		
		System.out.println(date4);
		
		  formatter = DateTimeFormatter.ofPattern("ee-W-MM-yyyy");
		  
	        // create a LocalDate object and
	        LocalDate dateMes
	            = LocalDate.parse("07-2-09-2021", formatter);
		
		System.out.println(dateMes);
	
		
		 formatter = DateTimeFormatter.ofPattern("DD-yyyy");
		  
        // create a LocalDate object and
        LocalDate date5
            = LocalDate.parse("123-2021", formatter);
        
        
        System.out.println("Date with day in the year:" + date5);
        
        
	
	}

}
