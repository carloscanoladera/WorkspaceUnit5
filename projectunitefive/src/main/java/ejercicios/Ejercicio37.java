package ejercicios;

import java.util.Formatter;
import java.util.Locale;
import java.util.Random;

import validaciones.Validaciones;

public class Ejercicio37 {

	private static final String nombres[] = { "ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JOSE ANTONIO",
			"JAVIER", "DANIEL", "JOSE LUIS", "FRANCISCO JAVIER", "CARLOS", "JESUS", "ALEJANDRO", "FRANCISCA", "LUCIA",
			"MARIA ISABEL", "MARIA JOSE", "ANTONIA", "DOLORES", "SARA", "PAULA", "ELENA", "MARIA LUISA", "RAQUEL" };

	private static final String apellidos[] = { "García", "Gonzalez", "Rodriguez", "Fernandez", "Lopez", "Martinez",
			"Sanchez", "Perez", "Gomez", "Martin", "Jimenez", "Ruiz", "Hernandez", "Diaz", "Moreno", "Muñoz", "Alvarez",
			"Romero", "Alonso", "Gutierrez", "Navarro", "Torres", "Dominguez", "Vazquez", "Ramos", "Gil", "Ramirez",
			"Serrano", "Blanco", "Molina", "Morales", "Suarez", "Ortega", "Delgado", "Castro", "Ortiz", "Rubio",
			"Marin", "Sanz", "Nuñez", "Iglesias", "Medina", "Garrido", "Cortes", "Castillo", "Santos" };

	private static final String BLANCO = " ";
	private static final String GUION = "-";

	public static void main(String[] args) {

		String nombreyAp = "";
		int edad;
		int telefono;
		Locale localeES = new Locale("ES");
		Formatter formatter = new Formatter(localeES);

		formatter.format("%n%1$-40s %2$-6s %3$-12s", "Nombre y Apellidos", "Edad", "telefono");
		formatter.format("%n%1$-40s %2$-6s %3$-12s", GUION.repeat(40), GUION.repeat(6), GUION.repeat(12));

		for (int i = 0; i < 20; i++) {

			nombreyAp = generaNombreYApellidosAleatorio();
			edad = generarEdadAleatorio();
			telefono = generarTelefonoAleatorio();

			formatter.format("%n%1$-40s %2$6d %3$-12d", nombreyAp, edad, telefono);

		}

		System.out.println(formatter);

		// TODO Auto-generated method stub

	}

	private static String generaNombreYApellidosAleatorio() {

		return generaNombreAleatorio() + BLANCO + generaApellidoAleatorio() + BLANCO + generaApellidoAleatorio();

	}

	private static String generaNombreAleatorio() {
		Random random = new Random();
		int index = random.nextInt(0, nombres.length);

		return Validaciones.capitalizaPalabras(nombres[index]);

	}

	private static String generaApellidoAleatorio() {

		return Validaciones.capitalizaPalabras(apellidos[new Random().nextInt(0, apellidos.length)]);

	}

	private static int generarEdadAleatorio() {

		return new Random().nextInt(0, 101);
	}

	private static int generarTelefonoAleatorio() {

		return new Random().nextInt(955000000, 1000000000);
	}
}
