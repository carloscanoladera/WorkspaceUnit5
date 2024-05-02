package ejercicio.notas.modelo;

import java.time.LocalTime;

public class NotaAlarma extends Nota{

	private LocalTime hora;
	
	public NotaAlarma( String lineaTexto, int numPalabraComienzo, LocalTime hora) {
		super(lineaTexto, numPalabraComienzo);
		this.hora=hora;
		
	}
	
	

	public LocalTime getHora() {
		return hora;
	}



	public void setHora(LocalTime hora) {
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
