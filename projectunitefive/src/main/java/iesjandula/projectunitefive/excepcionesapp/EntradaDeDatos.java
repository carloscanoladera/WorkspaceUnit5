package iesjandula.projectunitefive.excepcionesapp;


import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeDatos {
	
	
	

	private Scanner sc = null;

	public EntradaDeDatos() {

		sc = new Scanner(System.in);
		
		

	}

	public String leerString() throws ErrorEntradaException {

		try {
			return sc.next();
		} catch (InputMismatchException ime) {

			throw new ErrorEntradaException("Error al leer cadenas", ime);

		}
	}

	public double leerDouble() throws ErrorEntradaException {

		try {
			return sc.nextDouble();
		} catch (InputMismatchException ime) {

			throw new ErrorEntradaException("Error al leer numero decimal", ime);

		}

	}

	public int leerEntero() throws ErrorEntradaException {

		try {
			return sc.nextInt();
		} catch (InputMismatchException ime) {

			throw new ErrorEntradaException("Error al leer numero entero", ime);

		}

	}

	public void pulsaEnterParaContinuar() {

		System.out.println("Pulsa enter para continuar.........");
		sc.nextLine();
		sc.nextLine();
	}

}
