package stringejemplos;

public class StringsMetodos {
	
	
	public static void main(String[] args) {
		
		String s1 = "Cuervo";
		String s2 = "Cuenca";
		int compara= s1.compareTo(s2);
		System.out.println("Comparacion s1,s2: " + compara );
		
		System.out.println("El caracter en la posición 4 es: " + s1.charAt(4));
		
		
		System.out.println("El indice del caracter \'C\' es:"+ s1.indexOf("C"));
		
		System.out.println("s1 empieza por el caracter \"C\":" +  s1.startsWith("C"));
		
		System.out.println("s2 contiene la secuencia \"ue\":" +  s2.contains("ue"));
		
		
	}

}
