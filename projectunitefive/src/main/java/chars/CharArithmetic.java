package chars;

public class CharArithmetic {

	public static void main(String[] args) {

		char f = 'f';
		char a = 'a';

		int diffa = f - a;

		int diffAa = 'A' - 'a';

		System.out.println("dif f-a=" + diffa);

		System.out.println("dif A-a=" + diffAa);
		
		char res = 'b' + 3;
		
		System.out.println(res);
		
		res= 'F' + 4;
		
		int numF = 'F';
		
		System.out.println("EL numero F es " + numF);
		
		System.out.println(res);
		
		res = 'A' + 32;
		
		System.out.println(res);
		
		for (char c = 'a' ; c <= 'z' ; c++ ) {
			
			
			System.out.print(c + "|");
		}
		
		String s2;

	}

}
