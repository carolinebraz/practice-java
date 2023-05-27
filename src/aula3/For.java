package aula3;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		
		for(int contador = 1; contador < 4; contador ++) {
			System.out.print("Digite o "+ contador+"º nome: ");
			nome = scan.nextLine();
			System.out.print("O "+ contador +"º nome é : " + nome +"\n");
		}
	}

}