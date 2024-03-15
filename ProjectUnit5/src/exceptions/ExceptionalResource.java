package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionalResource implements AutoCloseable {

	BufferedReader fileReader = null;

	public void readFromFile() throws IOException {

		File file1 = new File("E:\\EJERCICIOS\\UNI1\\ejemplo1.txt");

		BufferedReader fileReader = new BufferedReader(new FileReader(file1));

		fileReader.readLine();

	}

	@Override
	public void close() throws IOException {

		if (fileReader != null)
			fileReader.close();
	}
}