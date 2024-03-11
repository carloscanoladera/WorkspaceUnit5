package excepcionesapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeDatos {

	private Scanner sc = null;
	public EntradaDeDatos() {
		
		
		Scanner sc = new Scanner(System.in);
		
	}
	
	public String leerString() throws ErrorEntradaException {
		
		try {
		return sc.next();
		} catch (InputMismatchException ime) {
			
			 throw new ErrorEntradaException(ime);
			
		}
	}
	
	public double leerDouble() throws ErrorEntradaException {
		
		
		try {
			return sc.nextDouble();
			} catch (InputMismatchException ime) {
				
				 throw new ErrorEntradaException(ime);
				
			}
		
	}
	
public int leerEntero() throws ErrorEntradaException {
		
		
		try {
			return sc.nextInt();
			} catch (InputMismatchException ime) {
				
				 throw new ErrorEntradaException(ime);
				
			}
		
	}


	
	
}
