package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de carácteres: ");
		
		cadena= sc.nextLine();
		
		for (int i=0 ; i<cadena.length(); i++) {
			
			System.out.format("%c %c", cadena.charAt(i), ' ');
		}
		
		System.out.println();

	}

}
