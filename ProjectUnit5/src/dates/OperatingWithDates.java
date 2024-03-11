package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;

public class OperatingWithDates {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		System.out.println(date);

		LocalDate date2 = LocalDate.of(2021, 5, 9);

		System.out.println("Comparing date and date2: " + date.compareTo(date2));

		LocalDate date3 = LocalDate.parse("2021-08-14");

		System.out.println("fecha 3" + date3 + " fecha 3 minus 200 days:" + date3.minusDays(200));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		// create a LocalDate object and
		LocalDate date4 = LocalDate.parse("06-09-2021", formatter);

		long dias = DAYS.between(date3, date4);

		System.out.println("Nummber of days between: " + date3 + " and " + date4 + " is: " + dias); // 365 dias

		formatter = DateTimeFormatter.ofPattern("ee-W-MM-yyyy");

		// create a LocalDate object and
		LocalDate dateMes = LocalDate.parse("07-2-09-2021", formatter);

		System.out.println(dateMes);

		formatter = DateTimeFormatter.ofPattern("DD-yyyy");

		// create a LocalDate object and
		LocalDate date5 = LocalDate.parse("123-2021", formatter);

		LocalDate date6 = date5.plusMonths(8);

		System.out.println("Date with day  in the year:" + date5 + " we added to it 8 months " + date6);

	}

}
