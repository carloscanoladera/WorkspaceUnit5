package dates;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class ClockClassExample {

	public static void main(String[] args) {

		Clock clock = Clock.systemDefaultZone();
		Instant instant = clock.instant();

		System.out.println(clock);
		System.out.println(instant);

		clock = Clock.systemUTC();
		System.out.println(clock);
		System.out.println("UTC time :: " + clock.instant());

		System.out.println(clock.instant());

		Clock baseClock = Clock.systemDefaultZone();

		System.out.println(baseClock);

		ZoneId zoneDef = Clock.systemDefaultZone().getZone();

		System.out.println("ZoneDef: " + zoneDef);

		ZoneOffset offs = zoneDef.getRules().getOffset(LocalDateTime.now());
		int offSetHours = offs.getTotalSeconds() / (60 * 60);
		System.out.println("Offset: " + offSetHours);
		clock = Clock.offset(baseClock, Duration.ofHours(offSetHours));

		System.out.println(clock.instant());

		clock = Clock.systemDefaultZone();
		System.out.println(clock.millis());

		baseClock = Clock.systemDefaultZone();

		// result clock will be later than baseClock
		clock = Clock.offset(baseClock, Duration.ofHours(72));
		System.out.println(clock.instant());

		// result clock will be same as baseClock
		clock = Clock.offset(baseClock, Duration.ZERO);
		System.out.println(clock.instant());

		// result clock will be earlier than baseClock
		clock = Clock.offset(baseClock, Duration.ofHours(-72));
		System.out.println(clock.instant());

		Clock clockDefaultZone = Clock.systemDefaultZone();
		Clock clocktick = Clock.tick(clockDefaultZone, Duration.ofSeconds(30));

		System.out.println("Clock Default Zone: " + clockDefaultZone.instant());
		System.out.println("Clock tick: " + clocktick.instant());

		ZoneId zoneSingapore = ZoneId.of("Asia/Singapore");
		Clock clockSingapore = Clock.system(zoneSingapore);
		System.out.println(clockSingapore.instant());

		ZoneId zoneCalcutta = ZoneId.of("Asia/Calcutta");
		Clock clockCalcutta = clockSingapore.withZone(zoneCalcutta);
		System.out.println(clockCalcutta.instant());

		clock = Clock.systemDefaultZone();
		ZoneId zone = clock.getZone();
		System.out.println(zone.getId());

		Clock fixedClock = Clock.fixed(Instant.parse("2018-04-29T10:15:30.00Z"), ZoneId.of("Asia/Calcutta"));
		System.out.println(fixedClock);

	}

}
