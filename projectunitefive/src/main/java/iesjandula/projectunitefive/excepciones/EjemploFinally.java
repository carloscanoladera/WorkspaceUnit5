package iesjandula.projectunitefive.excepciones;

import java.io.IOException;
import java.io.PrintStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class EjemploFinally {

	public static void main(String[] args) {
		PrintStream pStr = null;
		String[] cadenas = { "hola", "buenos", "dias" };

		try {
			int i;
			System.out.println("try");
			pStr = new PrintStream(new BufferedOutputStream(new FileOutputStream("OutFile.txt")));

			for (i = 0; i < cadenas.length; i++)
				pStr.println("Valor a: " + i + " = " + cadenas[i]);
		} catch (IOException e) {
			System.err.println("captura IOException: " + e.getMessage());
		} finally {
			if (pStr != null) {
				System.out.println("cierra PrintStream");
				pStr.close();
			} else {
				System.out.println("PrintStream no abierto");
			}
		}
	}

}
