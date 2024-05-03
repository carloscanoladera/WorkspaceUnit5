package ejercicio.notas.app;

import java.time.LocalTime;
import java.util.Optional;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import ejercicio.notas.datos.EntradaDeDatos;
import ejercicio.notas.excepciones.MenuException;
import ejercicio.notas.modelo.BlocNotas;
import ejercicio.notas.modelo.Nota;
import ejercicio.notas.modelo.NotaAlarma;
import ejercicio.notas.modelo.NotaMarcada;

/**
 * Hello world!
 *
 */
public class AppNotas {

	static {
		String fileConfig = System.getProperty("user.dir") + "\\src\\main\\resources\\log4j2.properties";

		System.setProperty("log4j2.configurationFile", fileConfig);
	}

	private static final Logger appLogger = LogManager.getLogger();
	private static final Marker marker = MarkerManager.getMarker("AppNotas");

	private static Scanner sc;


	
	public static void main( String[] args )
    {
		int opcion = 0;

		BlocNotas bloc = new BlocNotas();
		
		bootStrapping(bloc);
		
		sc = new Scanner(System.in);

		boolean bsalir = true;

		while (bsalir) {

			try {
				opcion = opcionesMenu();

				switch (opcion) {
				
				case 0 -> {
					
					bsalir = false;
				}

				case 1 -> {

					bloc.listarNotas();
					
					EntradaDeDatos.pulsaEnterParaContinuar();
				}

				case 2 -> {
					
					bloc.listarNotasMarcadas();

					
				}

				case 3 -> {

					bloc.listarNotasAlarma();

				}
				case 4 -> {

					

				}

				case 5 -> {

				}

				case 6 -> {

				}

				case 7 -> {

					
				}

				}

			} catch (MenuException e) {
				// TODO Auto-generated catch block

				System.out.println("Error en la opción de menu introduzca la correcata.\n" +e.getMessage());
				
				appLogger.error(marker, "Error en la opción de menu introduzca la correcata.\n" + e.getMessage());
				EntradaDeDatos.pulsaEnterParaContinuar();
			}

		}
    }
	
	
	
	private static int opcionesMenu() throws MenuException {
		// TODO Auto-generated method stub
		int res = -1;

		System.out.println("Introduzca una opción entre las siguientes:");
		System.out.println("--0 Salir");

		System.out.println("--1 Listar Notas");

		System.out.println("--2 Listar Notas Marcadas");

		System.out.println("--3 Listar Notas Alarma");
		System.out.println("--4 Introducir Nota");
		System.out.println("--5 Borrar Nota");
		System.out.println("--6 Buscar Nota");
	

		res = EntradaDeDatos.leerOpcionMenu(1, 7);
	

		return res;

	}
	

	private static void bootStrapping(BlocNotas bloc) {
		
		Nota n1 = new NotaMarcada( "Conjunción", 40, "Amarillo");

		Nota n2 = new NotaAlarma( "Adelantar reloj", 60, LocalTime.now());

		bloc.addNota(n1);
		bloc.addNota(n2);
	}

}
