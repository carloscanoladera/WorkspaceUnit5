package exercises;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		
		String string;
		String string2;
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		
		string= sc.nextLine();
		
		System.out.println("Enter another String to verify if both String are equal:");
		
		string2= sc.nextLine();
		
		System.out.println("The String \"" + string + "\" equals to \"" +string2 + "\": "+  string.contains(string2));


	}

}
