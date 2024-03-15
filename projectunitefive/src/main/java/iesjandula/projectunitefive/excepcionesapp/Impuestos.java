package iesjandula.projectunitefive.excepcionesapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Impuestos {
	
	private Logger logger;
	private Marker marker;
	
	public Impuestos() {
		
		logger = LogManager.getLogger();
		marker  =MarkerManager.getMarker(Impuestos.class.getName());
		
		
	}

	public double calculoImpuestos(Empleado e) throws ErrorIRPFException {

		String mensaje = "Error de IRPF en el empleado.";

		if (e.getIrpf() > 0.50)
			mensaje += " Demasiado alto. Solucionar";
		else if (e.getIrpf() < 0)
			mensaje += " Negativo. Solucionar";

		if (e.getIrpf() > 0.50 || e.getIrpf() < 0.0) {
			
			logger.error(marker, "Se va a lanzar la excepcion ErrorIRPFException");

			throw new ErrorIRPFException(mensaje);

		}

		return e.getSueldo() * e.getIrpf();
	}

}
