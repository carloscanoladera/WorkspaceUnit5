package chars;

public class ClassCharacter {

	public static void main(String[] args) {
		Character ch = 'a';
		Character ch2 = '2';
		char[] array = { 'h', 'o', 'l', 'a' };

		System.out.println(ch + " " + Character.toUpperCase(ch));
		System.out.println(ch2 + " " + Character.isDigit(ch2));
		System.out.println(ch + " " + Character.isLetter(ch));
		System.out.println(ch2+ "==3" + " " + Character.compare(ch2 ,'3'));
		System.out.println(ch + " is white space " + Character.isWhitespace(ch));
		

		System.out.println(Character.codePointAt(array, 2));
		System.out.println(Character.codePointBefore(array, 2));

		System.out.println("code point of x:" +Character.getNumericValue('x'));
		System.out.println( Character.valueOf('x'));

	}

}
