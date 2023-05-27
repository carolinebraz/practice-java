package aula3.exercicios;

import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = scan.nextInt();
			if(numero > 0) {
				soma += numero;
			}
		} while(numero != 0);
		System.out.println("\nA soma dos números positivos é: "+ soma);
	}
}