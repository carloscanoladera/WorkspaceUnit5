package ejercicios;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EjercicioLeerCaracteresAntiguosAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is = System.in;
		OutputStream os = System.out;

		String s = "";

		char ch = 'a';
		int[] enteros = new int[10];
		char[] arrayCaracteres = new char[1000];
		int cont = 0;
			System.out.println("Escribe hasta pulsar enter");
		while (ch != '\n' && cont < arrayCaracteres.length) {

			try {
				ch = (char) is.read();

				s = s + ch;
				arrayCaracteres[cont] = ch;
				cont++;

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	

		try {
			for (int i = 0; i < arrayCaracteres.length && arrayCaracteres[i] != 0; i++) {

				os.write(arrayCaracteres[i]);
			}

			os.write('\n');
			os.write('c');

			os.write('c');

			os.write('c');
			os.flush();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
