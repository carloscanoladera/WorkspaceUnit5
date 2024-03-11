package dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HandlingLocalTime {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();

		System.out.println("Current time:" + time);

		LocalTime time2 = LocalTime.of(9, 12, 3);

		System.out.println("Time with hours, minutes, seconds:" + time2);

		System.out.println("Time with hours " + time2.getHour() + " minutes " + time2.getMinute() + " seconds "
				+ time2.getSecond() + " and nanoseconds " + time2.getNano());

		LocalTime time3 = LocalTime.of(9, 12, 3, 100000);

		System.out.println("Time with hours, minutes,seconds and nanoseconds:" + time3);

		LocalTime time4 = LocalTime.parse("10:15:45");

		System.out.println("Local time parsed: " + time4);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H m s");
		LocalTime time5 = LocalTime.parse("14 30 40", formatter);

		System.out.println("Local time parsed with formatter:" + time5);

		// DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm a");
		// LocalTime time6 = LocalTime.parse("12:08 PM", formatter2);

	}

}
