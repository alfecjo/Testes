package br.gerador.aleatorio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyRandomNumberTest {
	private MyRandomNumber randomNumberGenerator;
	
	@BeforeEach
	void setup() {
		randomNumberGenerator = new MyRandomNumber();
	}
	
	@Test
	void shouldThrowIntrvaloInvalidoExceptionWhenBeginIsNegative() {
		Assertions.assertThrows(IntervaloInvalidoException.class, ()
				-> randomNumberGenerator.nextRandomNumber(-1, 10));
	}
	
	@Test
	void shouldThrowIntrvaloInvalidoExceptionWhenEndIsNegative() {
		Assertions.assertThrows(IntervaloInvalidoException.class, ()
				-> randomNumberGenerator.nextRandomNumber(10, -1));
	}
	
	@Test
	void shouldThrowIntrvaloInvalidoExceptionWhenBeginIsGreaterThanEqualToEnd() {
		Assertions.assertThrows(IntervaloInvalidoException.class, ()
				-> randomNumberGenerator.nextRandomNumber(10, 10));
		Assertions.assertThrows(IntervaloInvalidoException.class, ()
				-> randomNumberGenerator.nextRandomNumber(10, 5));
	}
	
	@Test
	void shouldReturnRandomNumberInRange() throws IntervaloInvalidoException{
		int randomNumber = randomNumberGenerator.nextRandomNumber(10, 20);
		Assertions.assertTrue(randomNumber >= 10 && randomNumber <=20);
	}
	
	@Test
	void shouldReturnDifferentRandomNumberOnEachInvocation() throws IntervaloInvalidoException{
		int randomNumber1 = randomNumberGenerator.nextRandomNumber(10, 20);
		int randomNumber2 = randomNumberGenerator.nextRandomNumber(10, 20);
		int randomNumber3 = randomNumberGenerator.nextRandomNumber(10, 20);
		Assertions.assertNotEquals(randomNumber1, randomNumber2);
		Assertions.assertNotEquals(randomNumber1, randomNumber3);
		Assertions.assertNotEquals(randomNumber2, randomNumber3);
	}
}
