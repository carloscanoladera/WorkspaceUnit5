package laclasearrays;

import java.util.Arrays;
import java.util.Comparator;

public class EjemploClaseUtilidadArrayObjects  {
	
	
	public static Empleado[] devuelveArrayEmpl() {
		Empleado[] array = new Empleado[8];
		
		array[0] = new Empleado(0,"Pepe" ,"Lopez");
		array[1] = new Empleado(1,"Raul" ,"Fernandez");
		array[2] = new Empleado(2,"Luis" ,"Suñer");
		array[3] = new Empleado(3,"Ivan" ,"Garcia");
		array[4] = new Empleado(4,"Rodolfo" ,"Langostino");
		array[5] = new Empleado(5,"Jeru" ,"Abad");
		array[6] = new Empleado(6,"Joshua" ,"Edelman");
		array[7] = new Empleado(7,"Rob" ,"Camavinga");
		
		return array;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado[] arrayEmpl = devuelveArrayEmpl();
		
		System.out.println("Array sin ordenar: " + Arrays.toString(arrayEmpl));
		
		
		//Ordenar por el comparator de empleado
		Arrays.sort(arrayEmpl);
		System.out.println("Array ordenado por el comparator de la clase Empleado, Aoellidos nombre:\n " + Arrays.toString(arrayEmpl));
		
		//Ordenar por el comparator pasado como parametro
		
		Arrays.sort(arrayEmpl, new ComparatorEmpleadoNombre());
		
		System.out.println("Array ordenado por el comparator ComparatorEmpleadoNombre, ordenado por nombre:\n " + Arrays.toString(arrayEmpl));
		

		//Ordenar por el comparator pasado como parametro lambda
		
		
		Arrays.sort(arrayEmpl, (e1,e2) -> e1.getId()>e2.getId()?1:e1.getId()==e2.getId()?0:-1);
		
		
		System.out.println("Array ordenado por el comparator lambda, ordenado por id:\n " + Arrays.toString(arrayEmpl));
	
		
		//Ordenar paralelo usando nucleos de procesador
		
		Arrays.parallelSort(arrayEmpl);
		  
        System.out.println("Array ordenado por el comparator de empleado, apellidos-nombre, en paralelo, más rápido: "
                           + Arrays.toString(arrayEmpl));
		
		
	}



}
