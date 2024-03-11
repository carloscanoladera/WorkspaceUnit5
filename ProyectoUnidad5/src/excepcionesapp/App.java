package excepcionesapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String nombre = "";
		int id = -1;
		double sueldo = 0.0;
		double IRPF = 0.0;
		double sueldoNeto = 0.0;

		EntradaDeDatos entradaDatos = new EntradaDeDatos();
		Empleado emp = null;
		int entrada = 0;

		while (entrada != 1) {
			System.out.println("Pulse:");
			System.out.println("0. Para introducir empleado y calcular su sueldo");
			System.out.println("1. Para salir");

			try {
				switch (entrada) {

				case 0:

					id = entradaDatos.leerEntero();

					System.out.println("Introduce el nombre del empleado");

					nombre = entradaDatos.leerString();

					System.out.println("Introduce el sueldo del empleado. Numero positivo");

					sueldo = entradaDatos.leerDouble();

					System.out.println("Introduce el IRPF del empleado. Un numero entre 0 y 0,5");

					IRPF = entradaDatos.leerDouble();

					break;

				case 1:
					System.out.println("Fin del programa");
					break;

				default:

					System.out.println("introduce un número de menú correcto");

				}

				emp = new Empleado(id, nombre, sueldo, IRPF);

				sueldoNeto = emp.calculaSueldo();

				System.out.println("El sueldo del empleado");

			} catch (ErrorIRPFException e) {
				// TODO Auto-generated catch block

				System.out.println(e.getMessage());

			} catch (ErrorEntradaException eee) {

				System.out.println(eee.getMessage());

			}

			finally {

				// Borramos el empleado incorrecto
				System.out.println("Procedemos a borrar el empleado");

				emp = null;

			}

		}

	}

}
