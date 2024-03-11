package format;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class FormaterClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer sb = new StringBuffer("weakness");
		Formatter f=new Formatter();
		f.format("%3$3s %2$3s %1$3s", "fear",
		   "strengthen", sb);
		System.out.println(f);
		
		StringBuilder builder=new StringBuilder();

		Formatter f1=new Formatter(builder);
		f1.format(Locale.FRANCE,"%.5f", -1325.789);
		System.out.println(f1);

		Formatter f2=new Formatter();
		f2.format(Locale.CANADA, "%.5f", -1325.789);
		System.out.println(f2);
		
		
		Formatter f3=new Formatter();
		f3.format(Locale.FRENCH,"%1$te %1$tB, %1$tY",
		   Calendar.getInstance());
		System.out.println(f3);

		Formatter f4=new Formatter();
		f4.format(Locale.GERMANY,"%1$te %1$tB, %1$tY",
		   Calendar.getInstance());
		System.out.println(f4);
		
	}

}
