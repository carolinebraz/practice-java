package aula3;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int numero, resultado;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Digite um número inteiro: ");
			numero = scan.nextInt();

			resultado = numero * 5;

			System.out.println("Resultado: " + resultado);

		} while (numero >= 0);

		System.out.println("\nFim do Programa");

	}
}