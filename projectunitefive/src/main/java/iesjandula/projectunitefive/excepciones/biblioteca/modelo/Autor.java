package iesjandula.projectunitefive.excepciones.biblioteca.modelo;

import java.util.Objects;

import iesjandula.projectunitefive.excepciones.biblioteca.interfaces.InfoAutor;

public class Autor implements Comparable<Autor>, InfoAutor {

	private String nombre;
	private String apellidos;
	private String dni;

	public Autor(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public int compareTo(Autor o) {
		// TODO Auto-generated method stub
		return this.getDni().compareTo(o.getDni());
	}

	@Override
	public String obtenInforAutor() {
		// TODO Auto-generated method stub
		return "Nombre: " + nombre + " Apellido: " + apellidos;
	}

}
