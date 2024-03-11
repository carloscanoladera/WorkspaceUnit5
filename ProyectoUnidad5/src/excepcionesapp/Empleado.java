package excepcionesapp;
class Empleado {
	
	int id;
	String nombre;
	
	double sueldo=0.0;
	double irpf=0.0;
	
	Impuestos impuesto;
	
	public Empleado () {
		
		
	}
	public Empleado (int id, String nombre,double sueldo, double irpf) {
		
		this.id=id;
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.irpf=irpf;
		impuesto = new Impuestos();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double getIrpf() {
		return irpf;
	}
	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}
	
	
	public double calculaSueldo() throws ErrorIRPFException {
		
		return this.sueldo - impuesto.calculoImpuestos(this);
		
	}
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", irpf=" + irpf + "]";
	}

	
	
}
