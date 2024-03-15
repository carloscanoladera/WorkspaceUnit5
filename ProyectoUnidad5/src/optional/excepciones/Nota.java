package optional.excepciones;
import java.util.Objects;

public  class Nota implements Comparable<Nota> {

	public int id;
	public String lineaTexto;
	public int numPalabraComienzo;
	private static int contId;
	

	public static int getIdGenerado() {
		
		return contId;
	}
	

	public Nota(int id, String lineaTexto, int numPalabraComienzo) {
		super();
		this.id = id;
		this.lineaTexto = lineaTexto;
		this.numPalabraComienzo = numPalabraComienzo;
		contId++;
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
				+ ", numPalabraComienzo=" + numPalabraComienzo + "]";
	}



	


	@Override
	public int compareTo(Nota o) {
	
		return this.getNumPalabraComienzo()-o.getNumPalabraComienzo();
	}

}
