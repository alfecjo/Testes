package br.triangulo;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        int lado1 = 0;
        int lado2;
        int lado3;      

        while (lado1 != 99) {
            System.out.println("Digite o valor do primeiro lado (ou 99 para sair): ");
            lado1 = scanner.nextInt();

            if (lado1 == 99) {
                System.out.println("Programa encerrado.");
                break; // Sai do loop
            }

            System.out.println("Digite o valor do segundo lado: ");
            lado2 = scanner.nextInt();

            System.out.println("Digite o valor do terceiro lado: ");
            lado3 = scanner.nextInt();            
            
            Triangulo triangulo = new Triangulo();
            
            String  tipoDeTriangulo = triangulo.verificarTipoTriangulo(lado1, lado2, lado3);
            System.out.println(tipoDeTriangulo);
        }
        scanner.close();
    }
}

