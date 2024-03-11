package fechas;

import java.time.LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManejoLocalDateTime {

	public static void main(String[] args) {
	LocalDateTime date= LocalDateTime.now();
	
	
	System.out.println("valor de fecha actual: " + date);
	
	LocalDateTime date2 = LocalDateTime.of(2021, 5, 9,21,10,12);
	
	
	
	System.out.println("dia " + date2.getDayOfMonth() + " mes " + date2.getMonthValue() + " año " + date2.getYear()
	+ " hora:" + date2.getHour() + " minutos:"+date2.getMinute() + " segundos:" + date2.getSecond());


	LocalDateTime date3 = LocalDateTime.parse("2021-08-14T19:34:50.63");
	
	System.out.println("dia en el mes " + date3.getDayOfMonth() + " mes " + date3.getMonth() + " Cronología " + date3.getChronology());
	

	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	  
        // create a LocalDate object and
	 LocalDateTime date4
            = LocalDateTime.parse("06-09-2021 22:10:11", formatter);
	
	System.out.println(date4);
	
	  formatter = DateTimeFormatter.ofPattern("ee-W-MM-yyyy H:m");
	  
        // create a LocalDate object and
	  LocalDateTime dateMes
            = LocalDateTime.parse("07-2-09-2021 9:34", formatter);
	
	System.out.println(dateMes);

	
	 formatter = DateTimeFormatter.ofPattern("DD-yyyy H");
	  
    // create a LocalDate object and
	 LocalDateTime date5
        = LocalDateTime.parse("123-2021 21", formatter);
    
    
    System.out.println("Fecha con dia en el año y hora:" + date5);
    
    

	}

}
