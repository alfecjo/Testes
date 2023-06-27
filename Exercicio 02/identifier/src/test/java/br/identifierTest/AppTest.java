package br.identifierTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.identifierSolucion.IdentifierSolucion;

public class AppTest {
	
	String test = "";
	String tamanhoDoIdentificadorOk = "a1";
	String tamanhoDoIdentificadorNoOk = "A1b2c3d";
	String primeiroCaracterLetraOk = "a1deq";
	String primeiroCaracterLetraNoOk = "2b3";
	String soContemCaracteresValidosOk = "a1de5q";
	String soContemCaracteresValidosNoOk = "Z-12";

	@Test
	void sizeIdentifierOk() {
		test = new IdentifierSolucion().validateIdentifier(tamanhoDoIdentificadorOk);
		assertEquals("Ok", test);
	}

	@Test
	void sizeIdentifierInvalidate() {
		test = new IdentifierSolucion().validateIdentifier(tamanhoDoIdentificadorNoOk);
		assertEquals("noOk", test);
	}

	@Test
	void identifierFirstCharacterOk() {
		test = new IdentifierSolucion().validateIdentifier(primeiroCaracterLetraOk);
		assertEquals("Ok", test);
	}

	@Test
	void identifierFirstCharacterInvalidate() {
		test = new IdentifierSolucion().validateIdentifier(primeiroCaracterLetraNoOk);
		assertEquals("noOk", test);
	}

	@Test
	void identifierOwnCharacterOk() {
		test = new IdentifierSolucion().validateIdentifier(soContemCaracteresValidosOk);
		assertEquals("Ok", test);
	}

	@Test
	void identifierNoContainCharacterValid() {
		test = new IdentifierSolucion().validateIdentifier(soContemCaracteresValidosNoOk);
		assertEquals("noOk", test);
	}
}
