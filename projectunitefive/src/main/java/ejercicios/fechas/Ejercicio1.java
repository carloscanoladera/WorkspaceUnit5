package ejercicios.fechas;

import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fecha;
		long difmes, difdias;

		System.out.println("Introduce una fecha en formato dd-MM-yyyy, dia mes año");

		fecha = sc.nextLine();

		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		// create a LocalDate object and
		LocalDate date1 = LocalDate.parse(fecha, formatter);

		System.out.println("Introduce otra fecha en formato DD-yyyy, dia del año - año");
		fecha = sc.nextLine();

		formatter = DateTimeFormatter.ofPattern("DD-yyyy");

		LocalDate date2 = LocalDate.parse(fecha, formatter);

		difmes = MONTHS.between(date1, date2);
		System.out.println("Diferencia en minutos: " + difmes);

		difdias = DAYS.between(date1, date2);

		System.out.println("Diferencia en segundos: " + difdias);

		System.out.println("Era " + date2.getEra());

		date2= date2.withDayOfMonth(22);
		date1= date1.withDayOfYear(200);

		System.out.println("Dia del año " + date2.getDayOfYear());

		date2.plusDays(4);

		System.out.println("Date2 " + date2);
	}

}
