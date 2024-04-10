package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		System.out.println("Escribe tu nombre:");
		Scanner sc = new Scanner(System.in);
		
		nombre= sc.nextLine();
		
		nombre= nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase();
		
		System.out.println("Nombre capitalizado: " + nombre);

	}

}
