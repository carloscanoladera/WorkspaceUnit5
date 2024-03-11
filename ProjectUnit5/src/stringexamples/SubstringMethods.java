package stringexamples;

public class SubstringMethods {
	
	public static void main(String[] args) {
		
		
		String s = "Victor Crows";
		
		System.out.println("substring 7 of 'Victor Crows': " + s.substring(7));
		
		System.out.println("substring (3,8) de 'Victor Crows': " + s.substring(3,8));
		
		
		System.out.println("To UpperCase returns:" + s.toUpperCase());		
		
		
		System.out.println("To replace returns:" + s.replace("Crows", "People"));	
		
		String s2= "  Comparison delete whitespaces    ";
		
		System.out.println("String without whitespaces:" + s2.trim());	
		
	}

}
