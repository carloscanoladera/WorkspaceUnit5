package exercises;

import java.util.Objects;
import java.util.Scanner;

public class Problem8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		string= sc.nextLine();
		
		
		System.out.println("Hashcode for the string is: "+  Objects.hash(string));
		

	}

}
