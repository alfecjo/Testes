package br.identifierSolucion;

public class IdentifierSolucion {

	public String validateIdentifier(String varIdentifier) {
		
		String response = "Ok";
		char cChar;
		int iInt, nInt;

		try {
			nInt = varIdentifier.length();
			for (iInt = 0; iInt < nInt; iInt++) {
				cChar = varIdentifier.charAt(iInt);
				if (nInt > 6) {
					response = "noOk";
					throw new Exception("...Identifier's > 6 ");
				}
				if (!Character.isLetter(varIdentifier.charAt(0))) {
					response = "noOk";
					throw new Exception("...First character isn't letter ");
				}
				if (!(Character.isLetter(cChar) || Character.isDigit(cChar))) {
					response = "noOk";
					throw new Exception("...There is invalid character ");
				}
			}
			System.out.println("Perfect...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return response;
	}
}
