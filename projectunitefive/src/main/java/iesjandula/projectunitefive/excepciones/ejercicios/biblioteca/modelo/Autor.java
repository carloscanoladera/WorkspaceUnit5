package iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo;

import java.util.Objects;

import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.interfaces.InfoAutor;


/**
 * @author David Jason Gianmoena
 * 
 * {@summary  }
 * 
 * The Autor class provides an abstraction for a book Author.
 * The Libro class has an attribute Autor type.
 * @see Libro#getAutor()
 * 
 * @version 1.0
 * @since 1.0
 * 
 */

// decir lo que hace y como funciona sin decir como está hecho.
// dar información sin informar de la implementación.

public class Autor implements Comparable<Autor>, InfoAutor {

	/**
	 * Author name of type String.
	 */
	private String nombre;
	
	/**
	 * It stores the author's lastname or surname.
	 */
	private String apellidos; 
	
	/**
	 * This property contains a DNI value for the Author.
	 * The DNI is a national identity card in Spain.
	 */
	private String dni;
	
	
	public Autor(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	/**
	 * Returns the author's name.
	 * @return String nombre
	 * 
	 * @version 1.0
	 * @since 1.0
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @author Virginia Moreno
	 * 
	 * This method changes the author's name.
	 * 
	 * @param String author's name.
	 * 
	 * @version 1.0
	 * @since 1.0
	 * 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(dni, other.dni);
	}


	@Override
	public int compareTo(Autor o) {
		// TODO Auto-generated method stub
		return this.getDni().compareTo(o.getDni());
	}


	@Override
	public String obtenInforAutor() {
		// TODO Auto-generated method stub
		return "Nombre: " + nombre+ " Apellido: " + apellidos;
	}
	
	
	
	
	
	

}
