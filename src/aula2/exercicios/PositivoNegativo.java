package aula2.exercicios;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
				
		if (numero % 2 == 0 && numero > 0) {
			System.out.println("\nO número "+ numero +" é par e positivo!");
		} else if (numero % 2 != 0 && numero < 0) {
			System.out.println("\nO número "+ numero +" é ímpar e negativo!");;
		} else if (numero % 2 == 0 && numero < 0){
			System.out.println("\nO número "+ numero +" é par e negativo!");
		} else {
			System.out.println("\nO número "+ numero +" é ímpar e positivo!");
		}

	}

}
