package operacionesavanzadas.busquedas;
public class BusquedaBinariaRecursiva {
	public int busquedaBinaria (int array[], int izq, int der, int x) 
	{ 
		
		int medio=0;
	    if (der >= izq) { 
	    			medio = izq + (der - izq) / 2; 
	  
	        // Si el elemento está presente en la posición medio

	        if (array[medio] == x) 
	            return medio; 
	  
	     
	        //el elemento está a la izquierda del array
	        if (array[medio] > x) 
	             return busquedaBinaria(array, izq, medio - 1, x); 
	  
	       //El elemento esta a la derecha del array
	         
	        else 
	          return busquedaBinaria(array, medio + 1, der, x); 
	    } 
	  
	    // Si no está devolvemos un -1
	    return -1; 
	} 
	
	public static void main(final String[] args) {

		 int[] array1 = {1,3,5,7,9,11,13,15,17,19,21,23};
		 
		 BusquedaBinariaRecursiva busqueda= new BusquedaBinariaRecursiva();
		 int resultado = busqueda.busquedaBinaria(array1, 0, array1.length-1,19);
		 
		 if  (resultado==-1) {
			 
			 
			 System.out.println("Numero 19 no encontrado en el array");
		 } else {
			 
			 
			 System.out.println("La posición que ocupa en el array es: " +resultado);
		 }
		 
	}

	

}
