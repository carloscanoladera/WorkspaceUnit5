package exceptionsapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataInput {

	private Scanner sc = null;

	public DataInput() {

		Scanner sc = new Scanner(System.in);

	}

	public String readString() throws ErrorInputException {

		try {
			return sc.next();
		} catch (InputMismatchException ime) {

			throw new ErrorInputException(ime);

		}
	}

	public double readDouble() throws ErrorInputException {

		try {
			return sc.nextDouble();
		} catch (InputMismatchException ime) {

			throw new ErrorInputException(ime);

		}

	}

	public int readInteger() throws ErrorInputException {

		try {
			return sc.nextInt();
		} catch (InputMismatchException ime) {

			throw new ErrorInputException(ime);

		}

	}

}
