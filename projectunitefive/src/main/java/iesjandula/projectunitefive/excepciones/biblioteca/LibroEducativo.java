package iesjandula.projectunitefive.excepciones.biblioteca;

public class LibroEducativo extends Libro{
	

	private String materia="";
	
	
	public LibroEducativo(String titulo, Autor autor,
			int annioPublicacion, String editorial, String referencia,
			EnumLibro tipoLibro, String materia) {
		super(titulo, autor, annioPublicacion, editorial, referencia, tipoLibro);
		this.materia=materia;
	}


	@Override
	public String toString() {
		return "LibroEducativo [materia=" + materia + ", titulo=" + getTitulo() + ", autor=" + getAutor()
				+ ", anniopublicacion" + getAnnioPublicacion() + ", editorial=" + getEditorial()
				+ ", referencia=" + getReferencia() + ", tipolibro=" + getTipoLibro() + "]";
	}

	
	
	

}
