package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class EjercicioLeerCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		

        try {
			PrintStream ps = 
					new PrintStream(new BufferedOutputStream(

			        new FileOutputStream(new File("Fichero.txt"),true)),true);
		
			System.setOut(ps);
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
		InputStream is = System.in;
		OutputStream os = System.out; 
		
		
	
		String s = "";

		char ch = 'a';
		int[] enteros = new int[10];
		char[] arrayCaracteres = new char[1000];
		int cont = 0;

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
		System.out.println("Imprimir array de caracteres:");

		try {
			for (int i = 0; i < arrayCaracteres.length && arrayCaracteres[i]!=0 ; i++) {

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
