package Stringejemplos;

public class StringsMetodosSubcadenas {
	
	public static void main(String[] args) {
		
		
		String s = "Víctor Cuervo";
		
		System.out.println("subcadena 7 de 'Victor Cuervo': " + s.substring(7));
		
		System.out.println("subcadena (3,8) de 'Victor Cuervo': " + s.substring(3,8));
		
		
		System.out.println("To UpperCase devuelve:" + s.toUpperCase());		
		
		
		System.out.println("To replace devuelve:" + s.replace("Cuervo", "Persona"));	
		
		String s2= "  Comparaciones elimina espacios    ";
		
		System.out.println("Cadena sin espacios:" + s2.trim());	
		
		// Transformar la i a mayusculas
		
		s = String.valueOf(s.charAt(0)) + String.valueOf(Character.toUpperCase(s.charAt(1))) + s.substring(2);
		
		System.out.println(s);
		
	}

}
