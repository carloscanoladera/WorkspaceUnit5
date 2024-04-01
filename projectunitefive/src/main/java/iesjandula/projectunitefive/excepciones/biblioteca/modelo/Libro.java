package iesjandula.projectunitefive.excepciones.biblioteca.modelo;

import java.util.Comparator;
import java.util.Objects;

import iesjandula.projectunitefive.excepciones.biblioteca.interfaces.IEducativo;
import iesjandula.projectunitefive.excepciones.biblioteca.interfaces.InfoAutor;

public abstract class Libro implements Comparable<Libro>, InfoAutor, IEducativo {

	private String titulo;
	private Autor autor;
	private int annioPublicacion;
	private String editorial;
	private String referencia;
	private EnumLibro tipoLibro;

	public Libro(String titulo, Autor autor, int annioPublicacion,
			String editorial, String referencia, EnumLibro tipoLibro) {

		this.titulo = titulo;
		this.autor = autor;
		this.annioPublicacion = annioPublicacion;
		this.editorial = editorial;
		this.referencia = referencia;
		this.tipoLibro= tipoLibro;
	}

	public String getTitulo() {
		return titulo;
	}

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
