package ejercicio.notas.modelo;

import java.util.Objects;

public abstract class Nota implements Comparable<Nota>, TipoNota {
	protected static long nuevoId=0;  

	public long id;
	public String lineaTexto;
	public int numPalabraComienzo;

	public Nota(String lineaTexto, int numPalabraComienzo) {
		super();
		this.id = nuevoId;
		nuevoId++;
		this.lineaTexto = lineaTexto;
		this.numPalabraComienzo = numPalabraComienzo;
		
		
	}
	
	public abstract EnumNota devuelveTipoNota();

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
		return "Nota [id=" + id + ", lineaTexto=" + lineaTexto + ", numPalabraComienzo=" + numPalabraComienzo
				+ " tipoNota: " + devuelveTipoNota() + "]";
	}

	@Override
	public int compareTo(Nota o) {

		return this.getNumPalabraComienzo() - o.getNumPalabraComienzo();
	}

}
