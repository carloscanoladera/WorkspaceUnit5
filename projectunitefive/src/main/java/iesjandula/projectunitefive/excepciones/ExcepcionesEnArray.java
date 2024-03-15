package iesjandula.projectunitefive.excepciones;
public class ExcepcionesEnArray {  
    public static void main(String[] args) {  
        int array[] = null;  
        int arraySize = 4;  
        int arrayInc = -0;  
        int output;  
        for (int i = 0; i < 6; i++) {  
            try {  
                // Multiple condiciones en el switch  
                switch (i) {  
                    case 0:  
                        output = array[0]; // Genera NullPointerException.  
                        break;  
                    case 1:  
                        array = new int[arrayInc]; // Genera NegativeArraySizeException.  
                        output = array[arrayInc];  
                        break;  
                    case 2:  
                        array = new int[arraySize]; // Genera ArrayIndexOutOfBoundsException.  
                        output = array[arraySize];  
                        break;  
                    case 3:  
                        array = new int[5]; // Genera IndexOutOfBoundsException.  
                        output = array[5];  
                    case 4:  
                        Object newArray = 0; // Genera ClassCastException.  
                        System.out.println((String) newArray);  
                    case 5:  
                        Object X[] = new String[-5]; // Genera ArrayStoreException.  
                        X[0] = 0;  
                        System.out.println(X);  
                }  
            } catch (NullPointerException ex1) {  
                System.out.println("\n Excepción Generada: "  
                    +  
                    ex1.getMessage());  
                ex1.printStackTrace();  
            } catch (NegativeArraySizeException ex2) {  
                System.out.println("\n Excepción Generada: "  
                    +  
                    ex2.getMessage());  
                ex2.printStackTrace();  
            } catch (ArrayIndexOutOfBoundsException ex3) {  
                System.out.println("\n Excepción Generada: "  
                    +  
                    ex3.getMessage());  
                ex3.printStackTrace();  
            } catch (IndexOutOfBoundsException ex4) {  
                System.out.println("\n Excepción Generada: "  
                    +  
                    ex4.getMessage());  
                ex4.printStackTrace();  
            } catch (ClassCastException ex5) {  
                System.out.println("\n Excepción Generada: "  
                    +  
                    ex5.getMessage());  
                ex5.printStackTrace();  
            } catch (ArrayStoreException ex6) {  
                System.out.println("\n Excepción Generada: "  
                    +  
                    ex6.getMessage());  
                ex6.printStackTrace();  
            }  finally {
            	//Se usa para cerra los recursos abiertos
            	System.out.println("Finaliza cerrando recursos");  
                        
            }
        }  
    }  
} 
