package aula4.exercicios;

import java.util.Scanner;

public class ElementosVetor {

	public static void main(String[] args) {

		int soma = 0, vetorInteiros[] = new int[10];
		float media = 0.0f;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vetorInteiros[i] = scan.nextInt();
			soma += vetorInteiros[i];
			media = (float) soma / vetorInteiros.length;
		}

		System.out.println("\nElementos nos índices ímpares: ");

		for (int i = 1; i < vetorInteiros.length; i += 2) {
			System.out.print(vetorInteiros[i] + " ");
		}

		System.out.println("\n\nElementos pares: ");

		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] % 2 == 0) {
				System.out.print(vetorInteiros[i] + " ");
			}
		}

		System.out.print("\n\nSoma: " + soma);

		System.out.print("\n\nMédia: " + media);
	}

}