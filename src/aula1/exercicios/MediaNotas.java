package aula1.exercicios;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		float media, nota1, nota2, nota3, nota4;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Digite a 1ª nota:\n ");
		nota1 = scan.nextFloat();
		
		System.out.printf("Digite a 2ª nota:\n ");
		nota2 = scan.nextFloat();
		
		System.out.printf("Digite a 3ª nota:\n ");
		nota3 = scan.nextFloat();
		
		System.out.printf("Digite a 4ª nota:\n ");
		nota4 = scan.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.printf("\nMédia das notas:\n %.1f", media);


	}

}
