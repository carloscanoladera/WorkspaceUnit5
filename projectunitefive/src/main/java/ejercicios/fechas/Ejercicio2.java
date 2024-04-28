package ejercicios.fechas;

import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.MILLIS;
import static java.time.temporal.ChronoUnit.MINUTES;

import java.time.LocalDateTime;

public class Ejercicio2 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		String hora;
		long difmili, difmin;
		ZoneId zoneId = ZoneId.of("US/Central");

		System.out.println("Introduce una fecha en formato H m s, 23 10 55");
		hora = sc.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H m s");
		LocalTime time1 = LocalTime.parse(hora, formatter);

		System.out.println("Introduce una fecha en formato HH:MM:SS, 23:10:55");
		hora = sc.nextLine();

		formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime time2 = LocalTime.parse(hora, formatter);

		difmili = MILLIS.between(time1, time2);
		System.out.println("diferencia milisegundos: " + difmili);

		difmin = MINUTES.between(time1, time2);

		System.out.println("diferencia minutos: " + difmin);

		System.out.println("Hora con horas " + time2.getHour() + " minutos " + time2.getMinute() + " y segundos "
				+ time2.getSecond() + " y nanosegundos ");
		
		
		
		ZoneOffset offSetUS = zoneId.getRules().getOffset(LocalDateTime.now());
		
		
		System.out.println(time2.atOffset(offSetUS));
		OffsetTime timeUs =OffsetTime.of(time2, offSetUS);
		time2 = time2.minusSeconds(offSetUS.getTotalSeconds()*-1);
		
		
		
		System.out.println(time2);
		System.out.println(timeUs);
		

	}
}
