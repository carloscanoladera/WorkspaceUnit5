package iesjandula.projectunit5.excepciones.ejercicios.ejercicio_1;

import java.util.Objects;

public abstract class Nota implements Comparable<Nota>, TipoNota {

	public int id;
	public String lineaTexto;
	public int numPalabraComienzo;
	

	

	public Nota(int id, String lineaTexto, int numPalabraComienzo) {
		super();
		this.id = id;
		this.lineaTexto = lineaTexto;
		this.numPalabraComienzo = numPalabraComienzo;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLineaTexto() {
		return lineaTexto;
	}

	public void setLineaTexto(String lineaTexto) {
		this.lineaTexto = lineaTexto;
	}

	public int getNumPalabraComienzo() {
		return numPalabraComienzo;
	}

	public void setNumPalabraComienzo(int numPalabraComienzo) {
		this.numPalabraComienzo = numPalabraComienzo;
	}
	
	

	@Override
	public String toString() {
		return "Nota [id=" + id + ", lineaTexto=" + lineaTexto 
				+ ", numPalabraComienzo=" + numPalabraComienzo + " tipoNota: "+ devuelveTipoNota() + "]";
	}



	


	@Override
	public int compareTo(Nota o) {
	
		return this.getNumPalabraComienzo()-o.getNumPalabraComienzo();
	}

}
