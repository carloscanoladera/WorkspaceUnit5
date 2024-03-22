package iesjandula.projectunit5.excepciones.ejercicios.ejercicio_1;

public class NotaAlarma extends Nota{

	private String hora;
	
	public NotaAlarma(int id, String lineaTexto, int numPalabraComienzo, String hora) {
		super(id, lineaTexto, numPalabraComienzo);
		this.hora=hora;
		
	}
	
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public EnumNota devuelveTipoNota() {
		// TODO Auto-generated method stub
		return EnumNota.NOTA_ALARMA;
	}

	@Override
	public String toString() {
		return "NotaAlarma [hora=" + hora + ", tipoNota=" + devuelveTipoNota() + ", id=" + getId()
				+ ", lineaTexto=" + getLineaTexto() + ", numPalabraComienzo=" + getNumPalabraComienzo() + "]";
	}
}
