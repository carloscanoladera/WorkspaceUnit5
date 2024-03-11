package exceptionsapp;

public class ErrorTaxException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErrorTaxException() {

		super("Too high tax withholding");

	}

}
