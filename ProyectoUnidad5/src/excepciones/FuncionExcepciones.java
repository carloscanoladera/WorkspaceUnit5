package excepciones;

public class FuncionExcepciones {
	
	
	public static int division(int a, int b) {
		
		int result =0;
		
		
		try {
			
			result = a/b;
			
		}
		
		catch (ArithmeticException ae) {
			
			System.out.println("Hubo un error al dividir porque se dividio por cero");
			
			
			
		} 	finally {
			
			return result;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
