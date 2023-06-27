package br.triangulo.java.br.TesteTriangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.triangulo.Triangulo;

public class TrianguloTest {
	private Triangulo triangulo;

	@BeforeEach
	void setup() {
		triangulo = new Triangulo();
	}

	@Test
	public void testTrianguloEscalenoValido() {
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(3, 4, 5),
				"Triângulo escaleno");
	}

	@Test
	public void testTrianguloIsocelesValido() {
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(5, 7, 7),
				"Triângulo isósceles");
	}
	
	@Test
	public void testTrianguloEquilateroValido() {
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(5, 5, 5), 
				"Triângulo equilátero");
	}
	
	@Test
	public void testisoscelesValidoContendoPermutacaoDosMesmosValores() {
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(5, 7, 7),
				"Triângulo isósceles");
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(7, 5, 7),
				"Triângulo isósceles");
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(7, 7, 5),
				"Triângulo isósceles");
	}
	
	@Test
	public void testUmValorZero() {
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(0, 8, 8), 
				"Os lados do triângulo devem ser números inteiros positivos.");
	}
	
	@Test
	public void testUmValorNegativo() {	
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(-3, 3, 3), 
				"Os lados do triângulo devem ser números inteiros positivos.");
	}

	@Test
	public void testASomaDe2LadosExatamenteIgualAoTerceiroLado() {
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(8, 4, 4), 
				"Os lados não formam um triângulo válido.");
	}

	@Test
	public void testASomaDe2LadosExatamenteIgualAoTerceiroLadoPermutacaoDosMesmosValores() {
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(8, 4, 4), 
				"Os lados não formam um triângulo válido.");
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(4, 8, 4), 
				"Os lados não formam um triângulo válido.");
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(4, 4, 8), 
				"Os lados não formam um triângulo válido.");
	}
	
	@Test
	public void testASomaDe2LadosMenorQueOTerceiroLado() {
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(8, 3, 3), 
				"Os lados não formam um triângulo válido.");
	}
	
	@Test
	public void testASomaDe2LadosMenorQueOTerceiroLadoPermutacaoDosMesmosValores() {
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(8, 3, 3), 
				"Os lados não formam um triângulo válido.");
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(3, 8, 3), 
				"Os lados não formam um triângulo válido.");
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(3, 3, 8), 
				"Os lados não formam um triângulo válido.");
	}
	
	@Test
	public void testParaOsTresValoresIguaisAZero() {
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(0, 0, 0), 
				"Os lados do triângulo devem ser números inteiros positivos.");
	}
	
	@Test
	public void testPrimeiroNegativoOutrosZero() {	
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(-3, 0, 0), 
				"Os lados do triângulo devem ser números inteiros positivos.");
	}
	
	@Test
	public void testSegundoNegativoOutrosZero() {	
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(0, -3, 0), 
				"Os lados do triângulo devem ser números inteiros positivos.");
	}
	
	@Test
	public void testTerceiroNegativoOutrosZero() {	
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(0, 0, -3), 
				"Os lados do triângulo devem ser números inteiros positivos.");
	}
	
	@Test
	public void testTodosNegativo() {	
		Assertions.assertEquals(triangulo.verificarTipoTriangulo(-3, -3, -3), 
				"Os lados do triângulo devem ser números inteiros positivos.");
	}
}

