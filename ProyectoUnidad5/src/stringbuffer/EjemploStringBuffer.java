package stringbuffer;

public class EjemploStringBuffer {

	public static void main(String[] args) {

		StringBuffer Dos = new StringBuffer(20);
		StringBuffer Uno = new StringBuffer("Hola Mundo");
		Dos.append("casa al a");

		Uno.append("Adios Mundo");
		System.out.println("Uno:" + Uno);

		System.out.println("Capacidad:" + Uno.capacity());
		Uno.ensureCapacity(100);
		System.out.println("Capacidad:" + Uno.capacity());
		Uno.insert(10, "-Algo entre medias-");
		System.out.println("Cadena" + Uno.toString());
		System.out.println("Longitud:" + Uno.length());
		System.out.println("Cadena Dos:" + Dos);
		System.out.println("Reverse:" + Dos.reverse());

	}

}
