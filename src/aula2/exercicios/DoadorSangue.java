package aula2.exercicios;

import java.util.Scanner;

public class DoadorSangue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean verdadeiro;
		
		System.out.print("Digite o nome do doador: ");
		nome = scan.nextLine();
		System.out.print("Digite a idade do doador: ");
		idade = scan.nextInt();
		System.out.print("Digite 'true' para a primeira doação de sangue ou 'false', caso contrário: ");
		verdadeiro = scan.nextBoolean();
		
		if ((idade >= 18 && idade < 60) || (idade >= 60 && idade <= 69 && verdadeiro == false)) {
			System.out.println("\n"+ nome +" está apto(a) para doar sangue!");
		} else {
			System.out.println("\n"+ nome +" não está apto(a) para doar sangue!");
		}

	}

}
