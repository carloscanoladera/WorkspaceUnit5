package excepciones;

public class EjemploOutOfBoundsSinAgrupar {

	public static void main(String[] args) {
	
		try {
			
			muestraArray();
			
		}
		catch (ArrayIndexOutOfBoundsException e){
			
	
			System.out.println("Ha accedido a una posición fuera del array");
			
		}
		catch (IndexOutOfBoundsException e){
			
			
			System.out.println("Indice ilegal. Ha accedido a una posición fuera del array");
			
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
