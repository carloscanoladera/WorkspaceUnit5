package stringexamples;

public class FirstStrings {

	public static void main(String[] args) {

		String emptystring = "";

		String string = "String with literal ";

		double myNum = 5.0;

		string = string + " concat with second string ";

		System.out.println(" concat result: " + string);

		string = string + myNum;

		System.out.println(" double and string concat: " + string);

	}

}
