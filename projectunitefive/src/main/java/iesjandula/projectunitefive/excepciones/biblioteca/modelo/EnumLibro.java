package iesjandula.projectunitefive.excepciones.biblioteca.modelo;

public enum EnumLibro {
	
	NOVELA, EDUCATIVO, TECNICO, POEMARIO , CUENTOS;
	
	
	
	public static boolean esEducativo(EnumLibro tipoLibro) {
		
		
		return (tipoLibro== EDUCATIVO || tipoLibro== TECNICO);
	}

}
