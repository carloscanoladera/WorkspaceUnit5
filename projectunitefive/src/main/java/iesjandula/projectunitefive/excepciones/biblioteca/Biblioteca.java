package iesjandula.projectunitefive.excepciones.biblioteca;



public class Biblioteca {
	
	private static final Libro libroNulo= new LibroFiccion("LibroNulo",new Autor("ZZZZZ","ZZZZZZ","ZZZZZ"),0,"LibroNulo","ZZZZZZZZZZZZZZZZZZZZZZZZZZZ", EnumLibro.CUENTOS);
	private String nombre;
	private Libro[] libros;
	
	private final int MAX_LIBROS=200;
	private int contLibros=0;
	
	
	// Quiero que lo hagais igual que La tienda y el clienta
	// con el objeto LibroNulo
	
	// ademas de los metodos del ejercicio añadir los mismos métodos que en tienda
	
	public Biblioteca(String nombre) {
		this.nombre= nombre;
		 libros= new Libro[MAX_LIBROS];
		rellenaLibrosNull();
		
	}
	
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
	
	public boolean eliminarLibro(String referencia) {
		// TODO Auto-generated method stub

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
	
	public boolean eliminarLibro(Libro libro) {
		// TODO Auto-generated method stub

		

		return eliminarLibro(libro.getReferencia());

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
		
		 for (Libro libro: this.getLibros()) {
			 
			 if (!libro.esEducativo() )				 
				 System.out.println(libro);
		 
		 }
		
	}
	
	public void listarLibrosEducativos() {
		
		 for (Libro libro: this.getLibros()) {
			 
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
