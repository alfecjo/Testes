package br.triangulo;

public class Triangulo {
		
	public String verificarTipoTriangulo(int ladoA, int ladoB, int ladoC) {
		String response = "";
		try {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
        	response = "Os lados do triângulo devem ser números inteiros positivos.";
            throw new Exception("Os lados do triângulo devem ser números inteiros positivos.");
            
        } else if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
        	response = "Os lados não formam um triângulo válido.";
            throw new Exception("Os lados não formam um triângulo válido.");
            
        } else if (ladoA == ladoB && ladoB == ladoC) {
            response =  "Triângulo equilátero";
            
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
        	response =  "Triângulo isósceles";
            
        } else {
        	response =  "Triângulo escaleno";
        }
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return response;
    }    
}