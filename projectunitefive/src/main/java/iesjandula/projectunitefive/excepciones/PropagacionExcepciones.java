package iesjandula.projectunitefive.excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PropagacionExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		metodo1();
	}
	
	
	public static void metodo1() {
		
		try {
			metodo2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error al leer el fichero" + e.getMessage());
		}
	}
	
	public static void metodo2() throws IOException {
		
		metodo3();
	}
	
	public static void metodo3() throws IOException {
		
		File fichero1 = new File( "E:\\EJERCICIOS\\UNI1\\ejemplo1.txt");  
		
		
		BufferedReader ficheroReader = new BufferedReader(
           new FileReader(fichero1)); 
		
	
		ficheroReader.readLine();

		
	}

}

