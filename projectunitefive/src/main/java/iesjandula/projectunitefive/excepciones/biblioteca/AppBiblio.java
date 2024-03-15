package iesjandula.projectunitefive.excepciones.biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppBiblio {

	private static Scanner sc;

	public static void main(String[] args) {
		int opcion = 0;

		Biblioteca biblio = new Biblioteca("Biblioteca municipal de Andujar");

		sc = new Scanner(System.in);

		boolean bsalir = true;

		while (bsalir) {

			opcion = opcionesMenu();

			switch (opcion) {

			case 1 -> {

				biblio.listarLibros();
			}

			case 2 -> {

				biblio.listarLibrosFiccion();

			}

			case 3 -> {

				biblio.listarLibrosEducativos();

			}
			case 4 -> {

				Libro libro = introducirLibro();
				System.out.println("Libro Introducida correctamente" + libro);

			}

			case 5 -> {

			}

			case 6 -> {

			}

			case 7 -> {

				bsalir = false;
			}

			}

		}

	}

	private static int opcionesMenu() {
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

		res = sc.nextInt();
		sc.nextLine();

		return res;

	}

	private static Libro introducirLibro() {

		Libro libroRes = null;

		String titulo;
		Autor autor;
		int annioPublicacion;
		String editorial;
		String referencia;
		EnumLibro tipoLibro;

		System.out.println("Introduzca el titulo del libro");
		titulo = sc.nextLine();

		autor = leerAutor();

		System.out.println("Introduzca el año de publicacion del libro");
		annioPublicacion = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduzca el editorial del libro");
		editorial = sc.nextLine();

		System.out.println("Introduzca la referencia del libro");
		referencia = sc.nextLine();



		tipoLibro = leerTipoLibro();

		if (tipoLibro.esEducativo(tipoLibro)) {

			System.out.println("Introduzca la materia del libro");

			String materia = sc.nextLine();

			libroRes = new LibroEducativo(titulo, autor, annioPublicacion, editorial, referencia, tipoLibro, materia);

		} else {

			libroRes = new LibroFiccion(titulo, autor, annioPublicacion, editorial, referencia, tipoLibro);
		}

		return libroRes;

	}

	private static Autor leerAutor() {
		String nombre;
		String apellidos;
		String dni;

		System.out.println("Introduzca el nombre del autor");
		nombre = sc.nextLine();

		System.out.println("Introduzca los apellidos del autor");
		apellidos = sc.nextLine();

		System.out.println("Introduzca el dni del autor");
		dni = sc.nextLine();

		return new Autor(nombre, apellidos, dni);

	}

	private static EnumLibro leerTipoLibro() {

		EnumLibro tipolibro;

		System.out.println("Introduzca el tipo del libro. ");
		System.out.println("0. NOVELA,  ");
		System.out.println("1. EDUCATIVO ");
		System.out.println("2. TECNICO  ");
		System.out.println("3. POEMARIO  ");
		System.out.println("4. CUENTOS  ");

		int indice = sc.nextInt();

		tipolibro = EnumLibro.values()[indice];

		return tipolibro;

	}
	
	private static boolean borrarLibro(Biblioteca biblio) {
		String referencia= "";
		
		System.out.println("Introduzca la referencia del libro a borrar. ");
		
		referencia= sc.nextLine();
		
		return biblio.eliminarLibro(referencia);
		
				
	}

}
