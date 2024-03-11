package exceptions;

public class ExampleOutOfBounds {

	public static void main(String[] args) {

		try {

			showArray();

		}

		catch (IndexOutOfBoundsException e) {

			System.out.println("You have try to accede to an array entry out of the bounds of the array");
			e.printStackTrace();

		} finally {

			System.out.println("Finally always get executed");
		}

	}

	private static void showArray() {

		int[] array = { 4, 2, 6 };

		for (int i = 0; i <= 3; i++) {

			System.out.println(array[i]);

		}

	}

}
