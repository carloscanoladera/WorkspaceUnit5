package iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo;


/**
 * {@summary This class represents the main management system for the library's inventory and eco-system.}
 * 
 *  This class provides ways to add, remove or list the books currently available in the library's inventory.
 *  It also provides methods to search for book items or book specific information such as title, author etc..
 *  
 * @see Libro
 *  
 * @author 1 DAM
 * @since 1.0
 * @version 1.1
 * 
 */

public class Biblioteca {
	
	// esto es un metodo privado que no iria documentado para el publico
	private static final Libro libroNulo= new LibroFiccion("LibroNulo",new Autor("ZZZZZ","ZZZZZZ","ZZZZZ"),0,"LibroNulo","ZZZZZZZZZZZZZZZZZZZZZZZZZZZ", EnumLibro.CUENTOS);
	
	/**
	 * Stores the library's name.
	 */
	private String nombre;
	
	/**
	 * Contains the list of books that constitutes the library's inventory.
	 */
	private Libro[] libros;
	
	
	private final int MAX_LIBROS=200;
	
	/**
	 * Keeps track of the amount of books recorded in the library's inventory.
	 */
	private int contLibros=0;
	
	/**
	 * Constructor for the library instance.
	 * Must receive the libary's name. Will create an empty book inventory.
	 * @param nombre
	 */
	public Biblioteca(String nombre) {
		this.nombre= nombre;
		 libros= new Libro[MAX_LIBROS];
		rellenaLibrosNull();
	}
	
	/**
	 * Parametrized constructor for the library instance. It must receive both the
	 * library's name and an initial book inventory. The inventory is a Libro object array.
	 * @param nombre
	 * @param librosParam
	 */
	public Biblioteca(String nombre, Libro[] librosParam) {
		this(nombre);
		agregarLibros(librosParam);
	}

	
	
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * The method introduces a new book to the library's inventory.
	 * 
	 * @see Libro
	 * 
	 * @param libro a book to be added.
	 */
	public void agregarLibro(Libro libro) {

		int cont = 0;
		boolean hayHueco = false;

		while (cont < this.libros.length && !hayHueco) {

			if (libros[cont].compareTo(libroNulo) == 0) {

				hayHueco = true;

			} else {
				cont++;
			}

		}

		if (hayHueco) {

			libros[cont] = libro;
			contLibros++;

		}

	}
	
	
	
	
	public void agregarLibros(Libro[] librosadd) {

		for (int i = 0; i < librosadd.length && contLibros < MAX_LIBROS; i++) {

			agregarLibro(librosadd[i]);

		}

	}
	
	public boolean eliminarLibro(Libro libro) {
		// TODO Auto-generated method stub

		boolean encontrado = false;
		for (int i = 0; i < MAX_LIBROS && !encontrado; i++) {

			if (libros[i].equals(libro)) {
				encontrado = true;
				libros[i] = libroNulo;
				contLibros--;
			}

		}

		return encontrado;

	}
	
	public boolean eliminarLibro(String referencia) {

		boolean encontrado = false;
		for (int i = 0; i < MAX_LIBROS && !encontrado; i++) {

			if (libros[i].getReferencia().equals(referencia)) {
				encontrado = true;
				libros[i] = libroNulo;
				contLibros--;
			}

		}

		return encontrado;

	}
	
	public boolean hayLibros() {

		return contLibros > 0;
	}
	
	
	public Libro[] getLibros() {
		
		Libro [] librosRes = new Libro[contLibros];
		
		int contlib = 0;

		for (int i = 0; i < libros.length && contlib < contLibros; i++) {

			if (libros[i].compareTo(libroNulo) != 0) {

				librosRes[contlib] = libros[i];
				contlib++;
			}

		}
		
		
		return librosRes;
	}


	
	
	public Libro buscarLibroPorTitulo(String titulo) {

		Libro libroRes = libroNulo;
		boolean encontrado = false;

		for (int i = 0; i < MAX_LIBROS; i++) {

			if (libros[i].getTitulo().equals(titulo) && !encontrado) {

				libroRes = libros[i];
			}

		}
		return libroRes;

	}

	public Libro buscarLibroPorCcc(String referencia) {

		Libro libroRes = libroNulo;
		boolean encontrado = false;

		for (int i = 0; i < MAX_LIBROS; i++) {

			if (libros[i].getReferencia().equals(referencia)  && !encontrado) {

				libroRes = libros[i];
			}

		}
		return libroRes;

	}
	

	public void listarLibros() {
		
      
		 for (Libro libro: this.getLibros()) {
			 
			 System.out.println(libro);
		 }
			 
			 
	}
	
	public void listarLibrosFiccion() {
		
		for(Libro libro : this.getLibros()) {
			
			if ( !libro.esEducativo()) 
	
			System.out.println(libro);
		}
		
	}
	
	public void listarLibrosEducativos() {
		
		for(Libro libro : this.getLibros()) {
			
			if (libro.esEducativo()) 
				
			System.out.println(libro);
		}
		
	}
	
	
	private void rellenaLibrosNull() {

		for (int i = 0; i < MAX_LIBROS; i++) {

			libros[i] = libroNulo;
		}
	}
	
	

}
