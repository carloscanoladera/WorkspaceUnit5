package operacionesavanzadas.ordenaciones;

public class OrdenacionesIterativas {
	// método java de ordenación por selección
	public static void seleccion(int A[]) {
		int i, j, menor, pos, tmp;
		for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
			menor = A[i]; // de los elementos que quedan por ordenar
			pos = i; // y guardamos su posición
			for (j = i + 1; j < A.length; j++) { // buscamos en el resto
				if (A[j] < menor) { // del array algún elemento
					menor = A[j]; // menor que el actual
					pos = j;
				}
			}
			if (pos != i) { // si hay alguno menor se intercambia
				tmp = A[i];
				A[i] = A[pos];
				A[pos] = tmp;
			}
		}
	}

	public static void insercion(int K[]) {
		int n = K.length;
		for (int i = 1; i < n; ++i) {
			int V = K[i];
			int j = i - 1;

			/*
			 * mueve los elementer arr[0..i-1], que son mayores que V , una posicion a la
			 * derecha de su posicion actual
			 */
			while (j >= 0 && K[j] > V) {
				K[j + 1] = K[j];
				j = j - 1;
			}
			K[j + 1] = V;
		}
	}

	public static void burbuja(int[] A) {
		int i, j, aux;
		for (i = 0; i < A.length - 1; i++) {
			for (j = 0; j < A.length - i - 1; j++) {
				if (A[j + 1] < A[j]) {
					aux = A[j + 1];
					A[j + 1] = A[j];
					A[j] = aux;
				}
			}
		}
	}
	
	public static String  arrayAString(int[] array) {
		
		
		String arrayStr= "\n[";
	
		
		for (int i=0 ; i<array.length-1 ; i++) {
			
			
			arrayStr+= array[i] + " ,"; 
			
		}
		
		arrayStr+= array[array.length-1] + "]\n";
		
		return arrayStr;
	}

	public static void main(String[] args) {

		

		int arrayOrdDirecta[]={54,26,93,17,77,31,44,55,20};
		int arrayOrdSeleccion[]={50,26,7,9,15,27};		
		int arrayOrdBurbuja[]={45,17,23,67,21};
		
		
		System.out.println("Array desordenado ordenación inserción directa: "+ arrayAString(arrayOrdDirecta));
		insercion(arrayOrdDirecta);
		System.out.println("Array ordenado con ordenación inserción directa: "+ arrayAString(arrayOrdDirecta));

		System.out.println("Array desordenado ordenación selección: "+ arrayAString(arrayOrdSeleccion));
		insercion(arrayOrdSeleccion);
		System.out.println("Array ordenado con ordenación selección: "+ arrayAString(arrayOrdSeleccion));

		
		System.out.println("Array desordenado ordenación de la burbuja: "+ arrayAString(arrayOrdBurbuja));
		burbuja(arrayOrdBurbuja);
		System.out.println("Array ordenado con ordenación de la burbuja: "+ arrayAString(arrayOrdBurbuja));

	}

}
