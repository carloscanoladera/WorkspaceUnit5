package fechas;

import static java.time.temporal.ChronoUnit.MINUTES;

import java.time.LocalDate;
import java.time.LocalTime;

public class OperarConHoras {
	
	

		
		public static void main(String[] args) {
			
			LocalTime time= LocalTime.now();
			
			
			System.out.println("time:" + time);
			
			LocalTime time2 = LocalTime.of(10, 12, 20);
			
			System.out.println("time2:" + time2);
			
			System.out.println("comparamos time y time2:" + time.compareTo(time2) );
			
			
			LocalTime time3 = time2.minusHours(2);
			
			System.out.println("restamos dos horas a time2 obteniendo time3:"+time3);
			
			long minutes = MINUTES.between(time2, time3);
			
			
			System.out.println("Diferencia en minutos entre Time2 y Time3:" + minutes);
			

		
		}

}
