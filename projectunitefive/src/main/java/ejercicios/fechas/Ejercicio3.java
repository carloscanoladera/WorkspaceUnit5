package ejercicios.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZoneId zoneIndia = ZoneId.of("Asia/Kolkata");
		ZoneId zoneLocal = ZoneId.systemDefault();
		Scanner sc = new Scanner(System.in);
		String fecha;
		long difmes, difdias;

		System.out.println("Introduce una fecha en formato dd-MM-yyyy HH:mm:ss , dia mes año");

		fecha = sc.nextLine();

		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


		// create a LocalDate object and
		LocalDateTime date1 = LocalDateTime.parse("03-10-2024 23:10:14", formatter);

		System.out.println("Introduce otra fecha en formato DD-yyyy, dia del año - año");
		fecha = sc.nextLine();

		formatter = DateTimeFormatter.ofPattern("ee-W-MM-yyyy H:m");

		LocalDateTime date2 = LocalDateTime.parse("04-3-10-2024 23:10", formatter);
		
		
		date1= date1.plusMonths(5);
		
		date2= date2.withDayOfMonth(22);
		date1= date1.withDayOfYear(200);
		
		System.out.println(date2.getDayOfYear());
		
		date2= date2.plusDays(4);
	
		ZonedDateTime zonedLocal = date2.atZone(zoneLocal);
		ZonedDateTime zonedIndia = zonedLocal.withZoneSameInstant(zoneIndia);
		
		System.out.println(zonedIndia.toLocalDateTime());
		
	}

}
