package aula3.exercicios;

import java.util.Scanner;

public class IntervaloMultiplos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int contador, primeiro, ultimo;
		
		System.out.print("Digite o primeiro número do intervalo: ");
		primeiro = scan.nextInt();
		System.out.print("Digite o último número do intervalo: ");
		ultimo = scan.nextInt();
		
		if(primeiro < ultimo) {
			for(contador = primeiro; contador <= ultimo; contador ++) {
				if(contador % 3 == 0 && contador % 5 == 0 && contador !=0) {
					System.out.println(contador +" é múltiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("\nIntervalo inválido!");
		}

	}

}
