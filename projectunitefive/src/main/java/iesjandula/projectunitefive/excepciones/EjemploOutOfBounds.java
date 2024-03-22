package iesjandula.projectunitefive.excepciones;
public class EjemploOutOfBounds {

	public static void main(String[] args) {
	
		try {
			
			muestraArray();
			
		}

		catch (IndexOutOfBoundsException e){
			
			
			System.out.println("Ha accedido a una posición fuera del array o cadena");
			e.printStackTrace();
			
		}
		finally {
			
		System.out.println("Finally siempre se ejecuta");
		}
		
		
		
		
	}

	private static void muestraArray() {
		// TODO Auto-generated method stub
		
		int [] array = {4,2,6};
		
		for (int i=0 ; i<=3 ; i++) {
			
			System.out.println(array[i]);
			
		}
		
	}
	
}
