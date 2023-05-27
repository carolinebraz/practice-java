package aula3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		String continua = "s";
		int numero1, numero2, resultado = 0;
		Scanner scan = new Scanner(System.in);

		while (continua.equals("s")) {

			System.out.println("Digite o primeiro valor: ");
			numero1 = scan.nextInt();

			System.out.println("Digite segundo valor: ");
			numero2 = scan.nextInt();

			resultado = numero1 + numero2;

			System.out.println("Resultado Final: " + resultado);

			System.out.println("Deseja continuar? (s/n)");
			continua = scan.next();
		}

		System.out.println("Fim da aplicação");

	}

}