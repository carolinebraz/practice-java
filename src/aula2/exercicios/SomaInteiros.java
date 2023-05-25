package aula2.exercicios;

import java.util.Scanner;

public class SomaInteiros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite o número A: ");
		a = scan.nextInt();
		
		System.out.print("Digite o número B: ");
		b = scan.nextInt();
		
		System.out.print("Digite o número C: ");
		c = scan.nextInt();
		
		if (a + b > c) {
			System.out.println("\nA soma de A + B é maior do que C");
		} else if (a + b < c) {
			System.out.println("\nA soma de A + B é menor do que C");
		} else {
			System.out.println("\nA soma de A + B é igual a C");
		}

	}

}