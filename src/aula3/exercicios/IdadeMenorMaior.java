package aula3.exercicios;

import java.util.Scanner;

public class IdadeMenorMaior {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade=1, totalMenor = 0, totalMaior = 0;
		
		while(!(idade <= 0)) {
			System.out.print("Digite uma idade: ");
			idade = scan.nextInt();
			if(idade > 0 && idade < 21) {
				totalMenor += 1;
			} else if(idade > 50) {
				totalMaior += 1;
			}
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: "+ totalMenor +""
				+ "\nTotal de pessoas maiores de 50 anos: "+ totalMaior);
	}
}