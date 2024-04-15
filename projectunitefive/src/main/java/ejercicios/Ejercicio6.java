package ejercicios;

import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bvalido=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una fecha en formato HH:mm");
		int h=-1,m=-1;
		String hora= sc.nextLine();
		
		
		if ( 	hora.length()==5 &&
				Character.isDigit(hora.charAt(0)) 
				&& Character.isDigit(hora.charAt(1))
				&& hora.charAt(2)==':' 
				&& Character.isDigit(hora.charAt(3)) 
				&& Character.isDigit(hora.charAt(4))) {
			
			h= Integer.valueOf(hora.substring(0,2));
			m= Integer.valueOf(hora.substring(3,5));
			
			
		} else {
			
			bvalido=false;
		}
		
	
		
		if (h<0 || h >23 || m<0 || m>59) {
			
			bvalido=false;
			
		}
		
		if (bvalido)
			System.out.println("La hora " + hora + " es valida " );
		else
			System.out.println("La hora " + hora + " no es valida " );
	}

}
