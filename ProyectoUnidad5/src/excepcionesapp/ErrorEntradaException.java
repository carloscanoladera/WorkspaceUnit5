package excepcionesapp;

import java.util.InputMismatchException;

public class ErrorEntradaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	
	
	public ErrorEntradaException(InputMismatchException em) {
		
		
		super("Error en la entrada de teclado",em, true,false);
	
				
	}
	
	
	
	
}
