package iesjandula.projectunit5.excepciones.ejercicios.biblioteca.excepciones;
public class MenuException extends Exception {

   private final static String MENSAJE = "Error al introducir el número solicitado. ";

   public MenuException(String mensaje, int minOpt, int maxOpt) {
       super(MENSAJE + mensaje + "Debe introducir un numero entre " + minOpt + " y " + maxOpt);

   }
}