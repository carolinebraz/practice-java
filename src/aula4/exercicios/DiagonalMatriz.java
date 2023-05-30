package aula4.exercicios;

import java.util.Scanner;

public class DiagonalMatriz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i, j, somaPrincipal = 0, somaSecundaria = 0, matriz[][] = new int[3][3];

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Digite o valor na posição [" + i + "][" + j + "]: ");
				matriz[i][j] = scan.nextInt();
			}
		}

		System.out.println("\nElementos na diagonal principal: ");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j) {
					System.out.print(matriz[i][j] + " ");
					somaPrincipal += matriz[i][j];
				}
			}
		}

		System.out.println("\n\nElementos na diagonal secundária: ");
		for (i = 0; i < 3; i++) {
			for (j = 2; j > -1; j--) {
				System.out.print(matriz[i][j] + " ");
				somaSecundaria += matriz[i][j];
				i++;
			}
		}

		System.out.println("\n\nSoma dos elementos na diagonal principal: " + somaPrincipal);

		System.out.println("\nSoma dos elementos na diagonal secundária: " + somaSecundaria);
	}

}