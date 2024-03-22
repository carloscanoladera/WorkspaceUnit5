package iesjandula.projectunitefive.excepciones.ejercicios.biblioteca;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import iesjandula.projectunit5.excepciones.ejercicios.biblioteca.excepciones.EntradaDeDatosException;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.datos.EntradaDeDatos;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.Autor;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.Biblioteca;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.EnumLibro;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.Libro;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.LibroEducativo;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo.LibroFiccion;


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

	               Optional<Libro> optLibro = introducirLibro();

	               if (optLibro.isEmpty()) {
	            	   //bloque de codigo si el libro está vacio
	               } else if (optLibro.isPresent()){
	            	   // acciones a hacer si el libro no está hueco.
	            	   biblio.listarLibros();
	               }
	               
	               
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

	   private static Optional<Libro> introducirLibro() {
		   
		   Libro libroRes = null;
	       
	       Optional<Libro> libroResOpt=Optional.empty();
	       
	       String titulo;
	       Autor autor;
	       int annioPublicacion;
	       String editorial;
	       String referencia;
	       EnumLibro tipoLibro;
	       
	       try {

		       System.out.println("Introduzca el titulo del libro");
		       titulo = EntradaDeDatos.leerTitulo();
		       //titulo = sc.nextLine();
	
		       //autor = leerAutor();
		       autor = leerAutor();
		       System.out.println("Introduzca el año de publicacion del libro");
		       //annioPublicacion = sc.nextInt();
		       //sc.nextLine();
	
		       annioPublicacion = EntradaDeDatos.leerAnnio();
		       
		       System.out.println("Introduzca el editorial del libro");
		       //editorial = sc.nextLine();
		       editorial = EntradaDeDatos.leerEditorial();
	
		       System.out.println("Introduzca la referencia del libro");
		       //referencia = sc.nextLine();
		       referencia = EntradaDeDatos.leeReferenciaLibro();
	
		       tipoLibro = leerTipoLibro();

		       if (tipoLibro.esEducativo(tipoLibro)) {
	
		           System.out.println("Introduzca la materia del libro");
	
		           String materia = sc.nextLine();
	
		           libroRes = new LibroEducativo(titulo, autor, annioPublicacion, editorial, referencia, tipoLibro, materia);
	
		       } else {
	
		           libroRes = new LibroFiccion(titulo, autor, annioPublicacion, editorial, referencia, tipoLibro);
		       }
	       
	       } // ciera el try.
	       catch (EntradaDeDatosException exe)
	       {
	    	   System.out.println("Error en la entrada de datos.\n" + exe.getMessage());
	    	   EntradaDeDatos.pulsaEnterParaContinuar();
	    	   // el catch provoca un return de nulo o 0.
	       } // cierra el catch.
	       
	       finally {
	    	   
	    	   if (libroRes!=null) {
	    		   libroResOpt=Optional.of(libroRes); 
	    		   System.out.println("El libro "+ libroRes.getTitulo() +" se ha introducido correctamente.");
	    	   }
	    	   else {
	    		   libroResOpt=Optional.empty();	    	   }
	    	   
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
	       
	       //nombre = sc.nextLine();
	       nombre=EntradaDeDatos.getNombreAutor(nombreYApellidos);
	       apellidos=EntradaDeDatos.getApellidosAutor(nombreYApellidos);

	       //System.out.println("Introduzca los apellidos del autor");
	       //apellidos = sc.nextLine();

	       System.out.println("Introduzca el dni del autor");
	       //dni = sc.nextLine();
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
		   
		   String referencia="";
		   
		   System.out.println("Introduzca la referencia del libro a borrar.");
		   referencia=sc.nextLine();
		   
		   return biblioteca.eliminarLibro(referencia); 

	   }

	}