package br.gerador.aleatorio;

import java.util.Random;

/** @param begin inicio do intervalo
 * @param end   fim do intervalo
 * @return retornar um numero aleatorio entre [begin, end] o numero aleatorio
 *         retornado nao pode ser igual ao anterior
 * @throws IntervaloInvalidoException essa excecao eh lancada quando begin >=
 *                                    end ou (begin<0 || end<0)*/

public class MyRandomNumber {
	Random random = new Random();

	public int nextRandomNumber(int begin, int end) throws IntervaloInvalidoException {
		if (begin < 0)
			throw new IntervaloInvalidoException("begin eh menor que zero");
		// TODO implementar o codigo aqui
		if (begin >= end || begin < 0 || end < 0)
			throw new IntervaloInvalidoException("Intervalo inválido!");

		int randomNumber = -1;
		int previusRandomNumber = 0;

		while (randomNumber == -1) {
			int newRandomNumber = random.nextInt((end - begin) + 1) + begin;
			if (newRandomNumber != previusRandomNumber) {
				randomNumber = newRandomNumber;
				previusRandomNumber = newRandomNumber;
			}
		}
		return randomNumber;
	}
}
