package exceptionsapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String name = "";
		int id = -1;
		double salary = 0.0;
		double taxes = 0.0;
		double netSalary = 0.0;

		DataInput dataInput = new DataInput();
		Employee emp = null;
		int option = 0;

		while (option != 1) {
			System.out.println("Enter:");
			System.out.println("0. To introduce the employee data");
			System.out.println("1. To exit");

			try {
				switch (option) {

				case 0:

					id = dataInput.readInteger();

					System.out.println("Enter the employee name");

					name = dataInput.readString();

					System.out.println("Enter the employee salary, a positive number.");

					salary = dataInput.readDouble();

					System.out.println("Introduce the tax withholding. A number between 0 y 0,5");

					taxes = dataInput.readDouble();

					break;

				case 1:
					System.out.println("The program ends");
					break;

				default:

					System.out.println("Enter a correct option number");

				}

				emp = new Employee(id, name, salary, taxes);

				netSalary = emp.calculateSalary();

				System.out.println("The employee salary is " + netSalary);

			} catch (ErrorTaxException e) {
				// TODO Auto-generated catch block

				System.out.println(e.getMessage());

			} catch (ErrorInputException eee) {

				System.out.println(eee.getMessage());

			}

			finally {

				// Borramos el empleado incorrecto
				System.out.println("The employee will be deleted");

				emp = null;

			}

		}

	}

}
