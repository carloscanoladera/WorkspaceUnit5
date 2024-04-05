package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto");
		
		texto= sc.nextLine();
		
		for (int i=1 ; i<= texto.length(); i++) {
			
			System.out.println(texto.substring(0,i));
		}
		
		for (int i=0 ; i<= texto.length()-1; i++) {
			
			for (int j=0; j<=i ; j++) {
				
			 System.out.format("%c",texto.charAt(j));
				
								
			}
					
			System.out.println();
			
		}

	}

}
