package iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.interfaces;

/**
 * {@summary Adds a behavior to the Book class to define the book category.}
 * 
 * There are two categories of books in the library. 
 * 
 * Educative: TECNICO, EDUCATIVO.
 * Fiction: NOVELA, CUENTO, POEMIARIO.
 * 
 * @see EnumLibro
 * @see EnumLibro#esEducativo(EnumLibro)
 * 
 */

public interface IEducativo {
	
	public boolean esEducativo();

}
