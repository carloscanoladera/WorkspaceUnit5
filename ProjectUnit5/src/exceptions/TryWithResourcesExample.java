package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

	public static void main(String[] args) {

		try (ExceptionalResource exceptionalResource = new ExceptionalResource()) {

			exceptionalResource.readFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error " + e.getMessage());
		}

	}

}
