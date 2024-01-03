package br.craps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class CrapsTest {

	public final int JOGADOR_GANHA= 1;
	public final int MESA_GANHA = 2;

	@Test
	public void jogadorGanhaNaPrimeiraRolagemComSete() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(5,2);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(JOGADOR_GANHA, craps.getVencedor());
	}
	
	@Test
	public void jogadorGanhaNaPrimeiraRolagemComOnze() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(6,5);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(JOGADOR_GANHA, craps.getVencedor());
	}
	
	@Test
	public void jogadorPerdeNaPrimeiraRolagemComDois() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(1,1);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo()); 
		assertEquals(MESA_GANHA, craps.getVencedor());
	}
	
	@Test
	public void jogadorPerdeNaPrimeiraRolagemComTres() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(2,1);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo()); 
		assertEquals(MESA_GANHA, craps.getVencedor());
	}
	
	@Test
	public void jogadorPerdeNaPrimeiraRolagemComDoze() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(9,3);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo()); 
		assertEquals(MESA_GANHA, craps.getVencedor());
	}
	
	@Test
	public void jogadorGanhaNaSegundaRolagemComQuatro() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(1, 3);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(2, 2);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(JOGADOR_GANHA, craps.getVencedor());
	}
	
	
	@Test
	public void jogadorGanhaNaSegundaRolagemComCinco() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(1, 4);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(2, 3);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(JOGADOR_GANHA, craps.getVencedor());
	}
	
	@Test
	public void jogadorGanhaNaSegundaRolagemComSeis() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(4, 2);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(4, 2);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(JOGADOR_GANHA, craps.getVencedor());
	}
	
	@Test
	public void jogadorGanhaNaSegundaRolagemComOito() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(4, 4);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(4, 4);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(JOGADOR_GANHA, craps.getVencedor());
	}
	
	
	@Test
	public void jogadorGanhaNaSegundaRolagemComNove() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(5, 4);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(4, 5);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(JOGADOR_GANHA, craps.getVencedor());
	}
	
	@Test
	public void jogadorGanhaNaSegundaRolagemComDez() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(5, 5);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(8, 2);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(JOGADOR_GANHA, craps.getVencedor());
	}
	
	@Test
	public void jogadorPerdeNaSegundaRolagem() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(4, 1);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(3, 4);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(MESA_GANHA, craps.getVencedor());
	}

	@Test
	public void jogadorGanhaNaTerceiraRolagem() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(4, 6);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(6, 5);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(5, 5);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(JOGADOR_GANHA, craps.getVencedor());
	}
	
	@Test
	public void jogadorPerdeNaTerceiraRolagem() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(3, 5);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(6, 5);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(5, 2);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(MESA_GANHA, craps.getVencedor());
	}	
	
	@Test
	public void jogadorGanhaNaQuartaRolagem() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(5, 5);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(1, 4);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(4, 5);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(9, 1);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(JOGADOR_GANHA, craps.getVencedor());
	}	
	
	@Test
	public void jogadorPerdeNaQuartaRolagem() {
		Dado dadoMock = Mockito.mock(Dado.class);
		Craps craps = new Craps();
		craps.setDado(dadoMock);
		Mockito.when(dadoMock.rolar()).thenReturn(5, 5);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(1, 4);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(4, 5);
		craps.rolarDados();
		assertFalse(craps.isFimDeJogo());
		Mockito.when(dadoMock.rolar()).thenReturn(6, 1);
		craps.rolarDados();
		assertTrue(craps.isFimDeJogo());
		assertEquals(MESA_GANHA, craps.getVencedor());
	}	
}
