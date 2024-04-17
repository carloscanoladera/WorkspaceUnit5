package ejercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre, fecha;
		
		"-".repeat(20);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("-".repeat(20));	
		System.out.println("Introduce un nombre:");

		nombre= sc.nextLine();
		System.out.println("Introduce una fecha y hora en formato: dd/MM/yyyy HH:mm:ss"); 
		
		fecha= sc.nextLine();
		
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime date = LocalDateTime.parse(fecha, formatter);
		
		//Terminar este ejercicio

	}

}
