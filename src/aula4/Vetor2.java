package aula4;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {

		int vetorInteiros[] = new int[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vetorInteiros[i] = scan.nextInt();
		}

		System.out.println("\nOs números digitados foram: \n");

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "º número: " + vetorInteiros[i]);
		}

	}

}