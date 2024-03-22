package iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo;

import java.util.Comparator;
import java.util.Objects;

import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.interfaces.IEducativo;
import iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.interfaces.InfoAutor;


/** 
 * {@summary Libro is the abstract class that aims to represent books in our library }
 * 
 * Libro is extended by two concrete classes: {@link LibroEducativo} and {@link LibroFiccion}
 * 
 * It will be managed in the Biblioteca class. The biblioteca class is an abstraction of the Library.
 * 
 * 
 * @author Virginia Moreno
 * @since 1.0
 * @version 1.1
 */

public abstract class Libro implements Comparable<Libro>, InfoAutor, IEducativo {
	
	/**
	 * Stores the title of the book.
	 */
	private String titulo;
	
	/**
	 * The author comproises the significaint data for the book's author.
	 * @see Autor
	 */
	private Autor autor;
	
	/**
	 * Contains the year of publication of the book.
	 */
	private int annioPublicacion;
	
	/**
	 * Stores the publisher of the books name.
	 */
	private String editorial;
	
	/**
	 * Contains the reference number of the books. ISBN
	 */
	private String referencia;
	
	/** 
	 * Stores the book type.
	 * @see EnumLibro
	 */
	private EnumLibro tipoLibro;

	/**
	 *  Parametrized consructor that provides an instance of the Libro class.
	 *  There is no empty or parameterless constructor available. 
	 *  Parameters are mandatory for Libro instances.
	 * 
	 * @param titulo The book's title
	 * @param autor The book's author.
	 * @param annioPublicacion The book's year of publication.
	 * @param editorial The book's publisher name.
	 * @param referencia The book's ISBN or reference number.
	 * @param tipoLibro The book's type.
	 */
	public Libro(String titulo, Autor autor, int annioPublicacion,
			String editorial, String referencia, EnumLibro tipoLibro) {

		this.titulo = titulo;
		this.autor = autor;
		this.annioPublicacion = annioPublicacion;
		this.editorial = editorial;
		this.referencia = referencia;
		this.tipoLibro= tipoLibro;
	}

	/**
	 * Returns the book's title.
	 * @return 
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Returns the book's title.
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAnnioPublicacion() {
		return annioPublicacion;
	}

	public void setAnnioPublicacion(int annioPublicacion) {
		this.annioPublicacion = annioPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	
	
	
	public EnumLibro getTipoLibro() {
		return tipoLibro;
	}

	public void setTipoLibro(EnumLibro tipoLibro) {
		this.tipoLibro = tipoLibro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(referencia);
	}

	
	
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", annioPublicacion=" + annioPublicacion
				+ ", editorial=" + editorial + ", referencia=" + referencia + ", tipoLibro=" + tipoLibro + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(referencia, other.referencia);
	}

	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.getReferencia().compareTo(o.getReferencia());
	}

	@Override
	public String obtenInforAutor() {
		// TODO Auto-generated method stub
		return this.getAutor().obtenInforAutor();
	}
	
	@Override
	public boolean esEducativo() {
		
		return EnumLibro.esEducativo(this.tipoLibro);
	}

}
