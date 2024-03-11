package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEjemplo {

	public static void main(String[] args) {

		String name = "Carlos Cano Ladera";
		StringTokenizer tokens = new StringTokenizer(name);
		System.out.println("Numero de tokens: " + tokens.countTokens());
		
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}

		int i = 0;
		String strDatos = "6.3\n6.2\n6.4\n6.2";
		tokens = new StringTokenizer(strDatos, "\n");
		int nDatos = tokens.countTokens();
		double[] datos = new double[nDatos];

		while (tokens.hasMoreTokens()) {
			String str = tokens.nextToken();
			datos[i] = Double.valueOf(str).doubleValue();
			System.out.println(datos[i]);
			i++;
		}

		String separator = "Hello#Good#Morning";
		tokens = new StringTokenizer(separator, "#", true);
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}

	}

}
