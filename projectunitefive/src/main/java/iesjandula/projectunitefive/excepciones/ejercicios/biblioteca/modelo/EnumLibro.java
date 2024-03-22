package iesjandula.projectunitefive.excepciones.ejercicios.biblioteca.modelo;

public enum EnumLibro {
	
	NOVELA, EDUCATIVO, TECNICO, POEMARIO , CUENTOS;

	
	public static boolean esEducativo(EnumLibro tipoLibro) {
		
		// devuelve true cuando el libro es educativo
		return tipoLibro==EDUCATIVO || tipoLibro==TECNICO;
		
	}
}
