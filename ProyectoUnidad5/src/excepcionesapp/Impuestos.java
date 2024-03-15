package excepcionesapp;

public class Impuestos {

	public double calculoImpuestos(Empleado e) throws ErrorIRPFException {

		String mensaje = "Error de IRPF en el empleado.";

		if (e.getIrpf() > 0.50)
			mensaje += " Demasiado alto. Solucionar";
		else if (e.getIrpf() < 0)
			mensaje += " Negativo. Solucionar";

		if (e.getIrpf() > 0.50 || e.getIrpf() < 0.0) {

			throw new ErrorIRPFException(mensaje);

		}

		return e.getSueldo() * e.getIrpf();
	}

}
