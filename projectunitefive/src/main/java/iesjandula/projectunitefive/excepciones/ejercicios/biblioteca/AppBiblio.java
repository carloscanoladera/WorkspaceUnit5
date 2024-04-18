package iesjandula.projectunitefive.excepciones.ejercicios.biblioteca;

import java.util.Optional;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.datos.EntradaDeDatos;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.excepciones.EntradaDeDatosException;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.excepciones.MenuException;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.Autor;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.Biblioteca;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.EnumLibro;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.Libro;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.LibroEducativo;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.LibroFiccion;

public class AppBiblio {

	static {
		String fileConfig = System.getProperty("user.dir") + "\\src\\main\\resources\\log4j2.properties";

		System.setProperty("log4j2.configurationFile", fileConfig);
	}

	private static final Logger appLogger = LogManager.getLogger();
	private static final Marker marker = MarkerManager.getMarker("AppBiblio");

	private static Scanner sc;

	public static void main(String[] args) {
		int opcion = 0;

		Biblioteca biblio = new Biblioteca("Biblioteca municipal de Andujar");
		bootStrapping(biblio);
		
		sc = new Scanner(System.in);

		boolean bsalir = true;

		while (bsalir) {

			try {
				opcion = opcionesMenu();

				switch (opcion) {

				case 1 -> {

					biblio.listarLibros();
					EntradaDeDatos.pulsaEnterParaContinuar();
				}

				case 2 -> {

					biblio.listarLibrosFiccion();
					EntradaDeDatos.pulsaEnterParaContinuar();

				}

				case 3 -> {

					biblio.listarLibrosEducativos();
					EntradaDeDatos.pulsaEnterParaContinuar();

				}
				case 4 -> {

					Optional<Libro> optLibro = introducirLibro();

					while (optLibro.isEmpty()) {

						System.out.println("Introducir libro de nuevo");
						optLibro = introducirLibro();
					}

					biblio.listarLibros();

				}

				case 5 -> {

				}

				case 6 -> {

				}

				case 7 -> {

					bsalir = false;
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

		System.out.println("--1 Listar libros");

		System.out.println("--2 Listar libros de ficcion");

		System.out.println("--3 Listar libros educativos");
		System.out.println("--4 Introducir libro");
		System.out.println("--5 Borrar libro");
		System.out.println("--6 Buscar libro");
		System.out.println("--7 Salir");

		res = EntradaDeDatos.leerOpcionMenu(1, 7);
	

		return res;

	}

	private static Optional<Libro> introducirLibro() {

		Libro libroRes = null;

		Optional<Libro> libroResOpt = Optional.empty();

		String titulo;
		Autor autor;
		int annioPublicacion;
		String editorial;
		String referencia;
		EnumLibro tipoLibro;

		try {

			System.out.println("Introduzca el titulo del libro");
			titulo = EntradaDeDatos.leerTitulo();
			// titulo = sc.nextLine();

			// autor = leerAutor();
			autor = leerAutor();
			System.out.println("Introduzca el año de publicacion del libro");
			// annioPublicacion = sc.nextInt();
			// sc.nextLine();

			annioPublicacion = EntradaDeDatos.leerAnnio();

			System.out.println("Introduzca el editorial del libro");
			// editorial = sc.nextLine();
			editorial = EntradaDeDatos.leerEditorial();

			System.out.println("Introduzca la referencia del libro");
			// referencia = sc.nextLine();
			referencia = EntradaDeDatos.leeReferenciaLibro();

			tipoLibro = leerTipoLibro();

			if (tipoLibro.esEducativo(tipoLibro)) {

				System.out.println("Introduzca la materia del libro");

				String materia = sc.nextLine();

				libroRes = new LibroEducativo(titulo, autor, annioPublicacion, editorial, referencia, tipoLibro,
						materia);

			} else {

				libroRes = new LibroFiccion(titulo, autor, annioPublicacion, editorial, referencia, tipoLibro);
			}

		} // ciera el try.
		catch (EntradaDeDatosException exe) {

			appLogger.error(marker, "Error en la entrada de datos.\n" + exe.getMessage());

			System.out.println("Error en la entrada de datos.\n" + exe.getMessage());
			EntradaDeDatos.pulsaEnterParaContinuar();
			// el catch provoca un return de nulo o 0.
		} // cierra el catch.

		finally {

			if (libroRes != null) {
				libroResOpt = Optional.of(libroRes);

				appLogger.info(marker, "El libro " + libroRes.getTitulo() + " se ha introducido correctamente.");

				System.out.println("El libro " + libroRes.getTitulo() + " se ha introducido correctamente.");
			} else {
				libroResOpt = Optional.empty();

				appLogger.error(marker, "El libro se ha introducido incorrectamente.");
			}

		}

		return libroResOpt;

	}

	private static Autor leerAutor() throws EntradaDeDatosException {

		String nombreYApellidos;
		String nombre;
		String apellidos;
		String dni;

		System.out.println("Introduzca el nombre y apellidos del autor");
		nombreYApellidos = EntradaDeDatos.leerNombreYApellidosAutor();

		// nombre = sc.nextLine();
		nombre = EntradaDeDatos.getNombreAutor(nombreYApellidos);
		apellidos = EntradaDeDatos.getApellidosAutor(nombreYApellidos);

		// System.out.println("Introduzca los apellidos del autor");
		// apellidos = sc.nextLine();

		System.out.println("Introduzca el dni del autor");
		// dni = sc.nextLine();
		dni = EntradaDeDatos.leerDniAutor();

		return new Autor(nombre, apellidos, dni);

	}

	private static EnumLibro leerTipoLibro() throws EntradaDeDatosException {

		EnumLibro tipolibro;

		System.out.println("Introduzca el tipo del libro. ");
		System.out.println("0. NOVELA, ");
		System.out.println("1. EDUCATIVO ");
		System.out.println("2. TECNICO ");
		System.out.println("3. POEMARIO ");
		System.out.println("4. CUENTOS ");

		tipolibro = EntradaDeDatos.leerTipoLibro();

		return tipolibro;

	}

	public static boolean borrarLibro(Biblioteca biblioteca) {

		String referencia = "";

		System.out.println("Introduzca la referencia del libro a borrar.");
		referencia = sc.nextLine();

		return biblioteca.eliminarLibro(referencia);

	}
	
	
	private static void bootStrapping(Biblioteca biblio) {
		
		Autor a1 = new Autor("Carlos","Cano","44444444S");
		Autor a2 = new Autor("Jesus","Tort","555555555F");
		
		Libro libro1 = new LibroFiccion("Las venidas de las aguas",
				a1, 2024, "Ed. Marshall", "978-84-17663-30-8" , EnumLibro.NOVELA);
		
		Libro libro2 = new LibroEducativo("Programación Java",
				a2, 2024, "Ed. Planeta" ,"978-84-96477-95-7" , EnumLibro.TECNICO,"informatica");


		
		Libro[] libros = {libro1, libro2};
		
		biblio.agregarLibros(libros);
	}

}