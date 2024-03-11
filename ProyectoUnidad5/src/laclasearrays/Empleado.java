package laclasearrays;

import java.util.Comparator;

public class Empleado implements Comparable<Empleado> {
	
	int id;
	String nombre;
	
	String apellidos;
	
	public Empleado () {
		
		
	}
	
	public Empleado (int id, String nombre, String apellidos) {
		
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	

	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		String nombreCompEmp1= this.getApellidos() + " " + this.getNombre();
		String nombreCompEmp2 = o.getApellidos() + " " + o.getNombre();
		
		
		return nombreCompEmp1.compareTo(nombreCompEmp2);
		
	}

	
}