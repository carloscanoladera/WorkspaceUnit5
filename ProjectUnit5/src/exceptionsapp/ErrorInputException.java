package exceptionsapp;

import java.util.InputMismatchException;

public class ErrorInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public ErrorInputException(InputMismatchException em) {

		super("keyboard input error", em, true, false);

	}

}
