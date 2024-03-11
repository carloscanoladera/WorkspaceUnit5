package operacionesavanzadas.busquedas;

public class Busquedas {
	
	
	public static int busquedaSequencial(int item, int[] list) {
		// si index = -1 cuando el método ha terminado
		// es que no hemos encontrado el elemento
		int index = -1;
		//recorremos el array con un bucle
		for (int i = 0; i < list.length; i++) {
			if (list[i] == item) {
				index = i;
				break;
			}
		}
		return index;
	}
	public static int busquedaBinaria(int item, int[] list) {
		// si index = -1 cuando el método ha terminado
		// es que no hemos encontrado el elemento
		int index = -1;
		// inicializamos el indice inicial y final del array

		int izq = 0;
		int der = list.length - 1;
		int medio;
		// continuamos la busqueda hasta que lo encontramos
		// o hasta que der e izq se cruzan
		while (der >= izq) {
			medio = (der + izq) / 2;// calculamos el punto medio
			if (item < list[medio]) { // el valor esta en la parte izquierda del array o inferior
				der = medio - 1;
			} else if (item > list[medio]) {
				// el valor esta en la parte derecha del array
				izq = medio + 1;
			} else {
				// encontrado salimos del bucle
				index = medio;
				break;
			}
		}
		return index;
	}



	public static void main(String[] args) {
		
		
		int[] arrayOrdenar = { 1,3,5,7,9,11,13,15,17,19,21,23};
		
		
		
		
		 System.out.println("Busqueda secuencial indice de 19: " + busquedaSequencial(19,arrayOrdenar));
		
		 
		 
		 System.out.println("Busqueda binaria indice de 19: " + busquedaSequencial(19,arrayOrdenar));
			

	}

}
