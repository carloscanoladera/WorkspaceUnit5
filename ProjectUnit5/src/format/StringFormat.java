package format;

import java.util.Locale;

public class StringFormat {

	public static void main(String[] args) {

		Locale locale = new Locale("fr");
		System.out.println("locale: " + locale);

		// Create a locale object using two parameters constructor
		Locale locale2 = new Locale("sp", "ES");
		System.out.println("locale2: " + locale2);

		// Create a locale object using three parameters constructor
		Locale locale3 = new Locale("en", "US", "south");
		System.out.println("locale3: " + locale3);

		// A local object from Locale.Builder
		Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("GB").build();
		System.out.println("localeFromBuilder: " + localeFromBuilder);

		String name = "Wolfy";

		float salary = 45777.678756885f;

		System.out.println(String.format("The name is %s", name));
		String sf2 = String.format("The salary is %f1", salary);
		System.out.println(sf2);

		System.out.println(String.format(locale2, "The value of the salary is %1$6.4f", salary));

		System.out.println(String.format(locale2, "Person with name %s receives the salary of %4.4f", name, salary));

		System.out.println(String.format(locale2,
				"For the Employee %1$20s  with salary %2$4.4f  %n " + " or with more precision %2$2f and age %3$f",
				name, salary, 56.3f));

		System.out.println(
				String.format(locale2, "%1$-20s %2$-10s %3$-20s %4$-6s ", "Name", "salary", "salary-precision", "Age"));

		System.out.println(String.format(locale2, "%1$-20s %2$-10s %3$-20s %4$-6s ", "--------------------",
				"----------", "-----------------", "------"));

		System.out.println(String.format(locale2, "%1$-20s %2$-10.4f %2$-20f %3$-6.1f", name, salary, 56.3f));

	}

}
