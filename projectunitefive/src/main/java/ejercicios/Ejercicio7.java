package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bpalindromo = true;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una cadena para comprobar si es palindroma");
		
		String cadena= sc.nextLine();
		
		
		for (int i=0; i< cadena.length()/2 && bpalindromo; i++) {
			
			if (cadena.charAt(i)!= cadena.charAt(cadena.length()-i-1) ) {
				
				bpalindromo=false;
			}
				
		}
		
		if (bpalindromo)
			System.out.println("La cadena " + cadena + " es palindroma" );
		else
			System.out.println("La cadena " + cadena + " no es palindroma" );
		

	}

}
