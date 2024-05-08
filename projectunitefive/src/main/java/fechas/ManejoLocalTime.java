package fechas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ManejoLocalTime {
	
	
	public static void main(String[] args) {
		
		LocalTime time= LocalTime.now();

		System.out.println("Hora actual:" + time);
		
		LocalTime time2 = LocalTime.of(9, 12, 3);
		
	    System.out.println("Hora con horas minutos y segundos:" + time2);
	    
	    System.out.println("Hora con horas "
	    		+ time2.getHour() + " minutos " + time2.getMinute() + " y segundos " + time2.getSecond() + 
	    		" y nanosegundos " + time2.getNano());
		
		LocalTime time3 = LocalTime.of(9, 12, 3,100000);
		
		System.out.println("Hora con horas minutos, segundos y nanosegundos:" + time3);
		
		
		LocalTime time4 = LocalTime.parse("10:15:45");
		
		System.out.println("Local time parseado: " + time4);
		
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H m s");
		    LocalTime time5 = LocalTime.parse("14 30 40", formatter);
		
		
		System.out.println("Local time parseado con formatter:"  + time5);
		
		//DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm a");
	    //LocalTime time6 = LocalTime.parse("12:08 PM", formatter2);
	    
	    
		
		
	}

}
