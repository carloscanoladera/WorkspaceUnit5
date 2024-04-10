package exercises;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		String string;
		String substring;
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		
		string= sc.nextLine();
		
		System.out.println("Enter another String to verify if the first one contains the second:");
		
		substring= sc.nextLine();
		
		System.out.println("The String \"" + string + "\" contains \"" +substring + "\": "+  string.contains(substring));
		
		
		

	}

}
