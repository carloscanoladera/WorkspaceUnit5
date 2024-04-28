package validaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidacionesTest {

	@DisplayName("Test Es Entero")
	@ParameterizedTest
	@CsvSource({ "99, true", "99.99, false", "AD1.45, false" })

	void testEsNumerica(String valor, boolean valorEsperado) {

		assertEquals(Validaciones.esEntero(valor), valorEsperado);
		

	}

	@DisplayName("Test Es Decimal")
	@ParameterizedTest
	@CsvSource({ "99, true", "99.99, true", "AD1.45, false" })
	void testEsDecimal(String valor, boolean valorEsperado) {

		assertEquals(Validaciones.esDecimal(valor), valorEsperado);

	}

	@DisplayName("Test validaNombre")
	@ParameterizedTest
	@CsvSource({ "dd ada daf asfad asfasd, false", "Carlos Lu4s Julian, false", "Carlos Luis Julian, true" })
	void testvalidaNombre(String nombre, boolean valorEsperado) {

		assertEquals(Validaciones.validarNombre(nombre), valorEsperado);

	}

	@DisplayName("Test Capitaliza Palabra")
	@ParameterizedTest
	@CsvSource({ "caRlos, Carlos", "cAAAAA ,Caaaaa" })
	void testCapitalizaPalabra(String valor, String valorEsperado) {

		assertEquals(Validaciones.capitalizaPalabra(valor), valorEsperado);

	}

	@DisplayName("Test Capitaliza Palabras")
	@ParameterizedTest
	@CsvSource({ "caRlos cAno LAdera,Carlos Cano Ladera", "cAAAAA ORueta,Caaaaa Orueta" })
	void testCapitalizaPalabras(String valor, String valorEsperado) {

		assertEquals(Validaciones.capitalizaPalabras(valor), valorEsperado);

	}

	@DisplayName("Test Valida Dni")
	@ParameterizedTest
	@CsvSource({ "77373737G, true", "3456732H,true", "838738383T,false", "4544844,false" })
	void testValidaDNI(String valor, boolean valorEsperado) {

		assertEquals(Validaciones.validaDni(valor), valorEsperado);

	}

	@DisplayName("Test Valida Telefono")
	@ParameterizedTest
	@CsvSource({ "677373737, true", "+33 345673245,true", "+34 838738383T,false", "4544844,false" })
	void testValidaTelefono(String valor, boolean valorEsperado) {

		assertEquals(Validaciones.validaTelefono(valor), valorEsperado);

	}

	@DisplayName("Test Valida Annio")
	@ParameterizedTest
	@CsvSource({ "6773, false", "1995,true", "h783d,false" })
	void testValidaAnnio(String valor, boolean valorEsperado) {

		assertEquals(Validaciones.validaAnnio(valor), valorEsperado);

	}

	@DisplayName("Test Valida Fecha")
	@ParameterizedTest
	@CsvSource({ "12/12/2023, true", "12/13/2023,false", "31/04/2024,false", "01/01/2000,true" })
	void testValidaFecha(String valor, boolean valorEsperado) {

		assertEquals(Validaciones.validaFecha(valor), valorEsperado);

	}
	
	@DisplayName("Test Valida Hora")
	@ParameterizedTest
	@CsvSource({ "12:10:11, true", "24:10:15,false", "03:60:01,false", "01:01:59,true" })
	void testValidaHora(String valor, boolean valorEsperado) {

		assertEquals(Validaciones.validaHora(valor), valorEsperado);

	}
	
	@DisplayName("Test Valida Dirección")
	@ParameterizedTest
	@CsvSource({ "Calle Ramón y Cajal, true", "Vi Alfonso XIII,false", "va ,false", "Ronda la Cuadra nº3,true" })
	void testValidaDireccion(String valor, boolean valorEsperado) {

		assertEquals(Validaciones.validaDireccion(valor), valorEsperado);

	}

}
