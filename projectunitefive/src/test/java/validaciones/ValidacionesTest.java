package validaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidacionesTest {
	
	String numero1, numero2, numero3;
	String nombre1, nombre2, nombre3;
	
	@BeforeEach
	void setUp() {
		
		numero1="99";
		numero2="99.99";
		numero3="AD1.45";
		nombre1= "dd ada daf asfad asfasd";
		nombre2= "Carlos Lu4s Julian";
		nombre3= "Carlos Luis Julian";
		
	}

	@Test
	void testEsDecimal() {
		
	assertTrue(Validaciones.esDecimal(numero1));
	assertTrue(Validaciones.esDecimal(numero2));
	assertFalse(Validaciones.esDecimal(numero3));
	
	
	}
	
	@Test
	void testvalidaNombre() {
		
		
		assertFalse(Validaciones.validarNombre(nombre1));
	
		assertFalse(Validaciones.validarNombre(nombre2));
		assertTrue(Validaciones.validarNombre(nombre3));
	}

}
