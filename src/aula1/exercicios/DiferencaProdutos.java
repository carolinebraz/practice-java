package aula1.exercicios;

import java.util.Scanner;

public class DiferencaProdutos {

	public static void main(String[] args) {
		float calculo, numero1, numero2, numero3, numero4;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Número 1: ");
		numero1 = scan.nextFloat();
		
		System.out.printf("Número 2: ");
		numero2 = scan.nextFloat();
		
		System.out.printf("Número 3: ");
		numero3 = scan.nextFloat();
		
		System.out.printf("Número 4: ");
		numero4 = scan.nextFloat();
		
		calculo = (numero1 * numero2) - (numero3 * numero4);

		System.out.printf("\nDiferença: %.1f" , calculo);
	}

}
