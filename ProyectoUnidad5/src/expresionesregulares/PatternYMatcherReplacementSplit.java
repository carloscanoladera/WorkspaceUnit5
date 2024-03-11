package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternYMatcherReplacementSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// reemplazar “as” por "bt"
		
				String cadenasASREP = "adadasdasdfdfasfd";

				Pattern patAsRep = Pattern.compile("\\B(as)\\B");
				Matcher matAsRep = patAsRep.matcher(cadenasASREP);
				
				String resultado = matAsRep.replaceAll("bt"); 

				System.out.println("Cadena original " + cadenasASREP);
				System.out.println("Resultado de reemplazar as: " + resultado);
				
				
				// reemplazar “as” por "bt" con la clase String
				
				String cadenasASREPString = "adadasdasdfdfasfd";
				String resultadoString = cadenasASREPString.replaceAll("\\B(as)\\B", "bt");
				

				System.out.println("Cadena original " + cadenasASREPString);
				System.out.println("Resultado de reemplazar as: " + resultadoString);
				
				
				

	}

}
