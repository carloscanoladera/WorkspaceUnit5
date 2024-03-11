package format;

import java.time.LocalDate;
import java.util.Formatter;
import java.util.Locale;

public class FormatterExample {

	public static void main(String[] args) {

		Formatter formatter = new Formatter();

		Employee[] arrayEmpl = new Employee[6];

		arrayEmpl[0] = new Employee("John Doe", 30000.5, 40, LocalDate.parse("2004-05-14"));

		arrayEmpl[1] = new Employee("John Williams", 27200.5, 40, LocalDate.parse("2002-11-04"));

		arrayEmpl[2] = new Employee("Elon Chat", 27000.0, 31, LocalDate.parse("2000-01-25"));

		arrayEmpl[3] = new Employee("Mike Mayers", 34300.56, 40, LocalDate.parse("2002-02-24"));

		arrayEmpl[4] = new Employee("John Doe", 50000.3, 45, LocalDate.parse("2010-03-11"));

		arrayEmpl[5] = new Employee("John Doe", 52000.1, 52, LocalDate.parse("2014-05-21"));

		Locale locale2 = new Locale("US");
		System.out.println("locale: " + locale2);

		formatter = new Formatter();

		formatter.format(locale2, "%n%1$-20s %2$-20s %3$-6s %4$-20s  ", "Name", ""
				+ "Salary", "Age", "Date");

		formatter.format(locale2, "%n%1$-20s %2$-20s %3$-6s %4$-20s ", "--------------------", "--------------------",
				"------", "-------------------");

		for (Employee em : arrayEmpl) {
			formatter.format(locale2, "%n%1$-20s %2$-20.3f %3$-10d %4$ta %4$tb %4$td %4$tY  ", em.getFullname(),
					em.getSalary(), em.getAge(), em.getStartDate());

		}

		System.out.println(formatter);
	}

}
