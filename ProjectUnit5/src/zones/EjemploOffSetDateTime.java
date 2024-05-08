package zones;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class EjemploOffSetDateTime {
	
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		ZoneOffset zoneOffSet= ZoneOffset.of("+02:00");

		
		System.out.println(zoneOffSet);
	
		OffsetDateTime offSetZonePlusTwo = OffsetDateTime.now(zoneOffSet);
		
		
	
		LocalDateTime Local = offSetZonePlusTwo.toLocalDateTime();
		
		System.out.println("Local Date:\n");
		System.out.println(Local);
		
	
		String string = "'Aaran ',  'Aaren ',  'Aarez ',  'Aarman ',  'Aaron ',  'Aaron-James ',  'Aarron ',  'Aaryan ',  'Aaryn ',  'Aayan ',  'Aazaan ',  'Abaan ',  'Abbas ',  'Abdallah ',  'Abdalroof ',  'Abdihakim ',  'Abdirahman ',  'Abdisalam ',  'Abdul ',  'Abdul-Aziz ',  'Abdulbasir ',  'Abdulkadir ',  'Abdulkarem ',  'Abdulkhader ',  'Abdullah ',  'Abdul-Majeed ',  'Abdulmalik ',  'Abdul-Rehman ',  'Abdur ',  'Abdurraheem ',  'Abdur-Rahman ',  'Abdur-Rehmaan ',  'Abel ',  'Abhinav ',  'Abhisumant ',  'Abid ',  'Abir ',  'Abraham ',  'Abu ',  'Abubakar ',  'Ace ',  'Adain ',  'Adam ',  'Adam-James ',  'Addison '";
		
	}

}
