package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();
	}

	public static void method1() {

		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Error reading the file" + e.getMessage());
		}
	}

	public static void method2() throws IOException {

		method3();
	}

	public static void method3() throws IOException {

		File file1 = new File("E:\\EXERCISES\\UNI1\\file1.txt");

		BufferedReader fileReader = new BufferedReader(new FileReader(file1));

		fileReader.readLine();

	}

}
