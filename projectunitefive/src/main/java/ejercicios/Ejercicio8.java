package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bLetras= true;
		String cadena;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una cadena para comprobar si todos son letras");
		
		cadena= sc.nextLine();

		
		for (int i=0; i<cadena.length() ; i++) {
			
			if (!(Character.isLetter(cadena.charAt(i))) ) {
				
				bLetras=false;
			}
			
		}		
		if (bLetras) 
			System.out.println("Todos son letras");
		else 
			System.out.println("Todos no son letras");
		
		
		
	}

}
