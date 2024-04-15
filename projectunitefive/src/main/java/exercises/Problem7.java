package exercises;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string;
		int index=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		string = sc.nextLine();
		System.out.println("Enter a position in the string no longer than " + (string.length()-1) );
		
		index = sc.nextInt();
		
		System.out.println("The codepoint at this  position is: " + Character.codePointAt(string, index ));  
		
		

	}

}
