package excepcionesapp;

public class Impuestos {
	
	
	public double calculoImpuestos(Empleado e) throws ErrorIRPFException {
		
		
		
		if (e.getIrpf()> 0.50 || e.getIrpf() < 0.0) {
			
			
			throw new ErrorIRPFException();
			
		}
		
		return e.getSueldo()*e.getIrpf();
	}

}
