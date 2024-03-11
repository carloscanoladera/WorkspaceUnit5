package formato;

import java.time.LocalDate;

public class Empleado {

	private String nombreCompleto;
	private double salario;
	private int edad;
	private LocalDate fechaIncorporacion;

	public Empleado(String nombreCompleto, double salario, int edad, LocalDate fechaIncorporacion) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.salario = salario;
		this.edad = edad;
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}

	@Override
	public String toString() {
		return "Empleado [nombreCompleto=" + nombreCompleto + ", salario=" + salario + ", edad=" + edad
				+ ", fechaIncorporacion=" + fechaIncorporacion + "]";
	}

}
