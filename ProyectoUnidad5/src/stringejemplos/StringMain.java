package stringejemplos;

import java.time.LocalDate;
import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String linea="";
		StringBuffer sb= new StringBuffer();
		
		for (int i=0 ; i<4 ; i++ ) {
			
			linea= sc.nextLine();
			
			linea= linea.replaceAll("#", LocalDate.now().toString());
			
			sb.append(linea);
			
		}
		
		System.out.println(sb);

	}

}
