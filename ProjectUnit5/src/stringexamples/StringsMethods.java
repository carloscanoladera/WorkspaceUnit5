package stringexamples;

public class StringsMethods {
	
	
	public static void main(String[] args) {
		
		String s1 = "Crows";
		String s2 = "Pensylvania";
		int compara= s1.compareTo(s2);
		System.out.println("Comparison of s1,s2: " + compara );
		
		System.out.println("The string s1 character at index 4 is: " + s1.charAt(4));
		
		//System.out.println("The string s1 character at index 5 would throw OutofBounds: " 
		//+ s1.charAt(5));
		System.out.println("The index of c character is \'C\' es:"+ s1.indexOf("C"));
		
		System.out.println("s1 starts with \"C\":" +  s1.startsWith("C"));
		
		System.out.println("s2 contains the sequence \"ue\":" +  s2.contains("yl"));
		
		
	}

}
