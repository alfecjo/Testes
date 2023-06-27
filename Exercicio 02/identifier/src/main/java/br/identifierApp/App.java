package br.identifierApp;

import br.identifierSolucion.IdentifierSolucion;

public class App {

	public static void main(String[] args) throws Exception {
		
		IdentifierSolucion identifierSolucion = new IdentifierSolucion();		
		identifierSolucion.validateIdentifier("A1b2c3d");
	}
}
