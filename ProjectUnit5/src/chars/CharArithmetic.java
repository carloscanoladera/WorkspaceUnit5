package chars;

public class CharArithmetic {

	public static void main(String[] args) {

		char f = 'f';
		char a = 'a';

		int diffa = f - a;

		int diffAa = 'A' - 'a';

		System.out.println("dif a-f=" + diffa);

		System.out.println("dif A-a=" + diffAa);
		
		char res = 'b' + 3;
		
		System.out.println(res);
		
		res= 'F' + 4;
		
		System.out.println(res);
		
		res = 'A' + 32;
		
		System.out.println(res);

	}

}
