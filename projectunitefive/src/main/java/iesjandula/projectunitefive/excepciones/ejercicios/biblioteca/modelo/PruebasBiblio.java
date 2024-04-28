package iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo;

public class PruebasBiblio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Autor a1 = new Autor("Carlos", "Cano", "44444444S");
		Autor a2 = new Autor("Jesus", "Tort", "555555555F");

		Libro libro1 = new LibroFiccion("Las venidas de las aguas", a1, 2024, "Ed. Marshall", "5500A2",
				EnumLibro.NOVELA);
		
		libro1.imprimirLibro();

		Libro libro2 = new LibroEducativo("Programación Java", a1, 2024, "Ed. Planeta", "7700BB2", EnumLibro.TECNICO,
				"informatica");

		Libro[] libros = { libro1, libro2 };
	

		Biblioteca biblio = new Biblioteca("Municipal Andujar", libros);

		biblio.listarLibrosEducativos();
		biblio.eliminarLibro(libro2);

		// biblio.listarLibros();

		biblio.agregarLibro(libro2);

	}

}
