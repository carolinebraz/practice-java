package aula3.exercicios;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero, contador, totalPares = 0, totalImpares = 0;
		
		for(contador = 1; contador <= 10; contador++) {
			System.out.print("Digite o "+ contador +"º número: ");
			numero = scan.nextInt();
			if(numero % 2 == 0) {
				totalPares += 1;
			} else {
				totalImpares += 1;
			}
		}
		System.out.println("\nTotal de números pares: "+ totalPares +""
				+ "\nTotal de números ímpares: "+ totalImpares);

	}

}
