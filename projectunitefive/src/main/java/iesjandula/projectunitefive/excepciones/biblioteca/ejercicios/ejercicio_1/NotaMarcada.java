package iesjandula.projectunit5.excepciones.ejercicios.ejercicio_1;

public class NotaMarcada extends Nota {
	
	private String color;
	public NotaMarcada(int id, String lineaTexto, int numPalabraComienzo, String color) {
		super(id, lineaTexto, numPalabraComienzo);
		// TODO Auto-generated constructor stub
		
		this.color=color;
	}
	@Override
	public EnumNota devuelveTipoNota() {
		// TODO Auto-generated method stub
		return EnumNota.NOTA_MARCADA;
	}
	@Override
	public String toString() {
		return "NotaMarcada [color=" + color + ", id=" + id + ", lineaTexto=" + lineaTexto + ", numPalabraComienzo="
				+ numPalabraComienzo + ", devuelveTipoNota=" + devuelveTipoNota() + "]";
	}


	
	@Override
	public int compareTo(Nota o) {
	
		if (this.getNumPalabraComienzo()!=o.getNumPalabraComienzo())
		
			return this.getNumPalabraComienzo()-o.getNumPalabraComienzo();
		else
			return this.getLineaTexto().length() -  o.getLineaTexto().length();
	}

}
