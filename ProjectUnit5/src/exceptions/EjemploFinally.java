package exceptions;

import java.io.IOException;
import java.io.PrintStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class EjemploFinally {

	public static void main(String[] args) {
		PrintStream pStr = null;
		String[] cadenas = { "hello", "good", "morning" };

		try {
			int i;
			System.out.println("Entering try statement");
			pStr = new PrintStream(new BufferedOutputStream(new FileOutputStream("OutFile.txt")));

			for (i = 0; i < cadenas.length; i++)
				pStr.println("Value at: " + i + " = " + cadenas[i]);
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
		} finally {
			if (pStr != null) {
				System.out.println("Closing PrintStream");
				pStr.close();
			} else {
				System.out.println("PrintStream not open");
			}
		}
	}

}
