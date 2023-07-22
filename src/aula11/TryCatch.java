package aula11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dividendo = 0, divisor = 0;
		boolean loop = true;

		do {
			try {
				System.out.println("Digite o dividendo: ");
				dividendo = scan.nextInt();

				System.out.println("Digite o divisor: ");
				divisor = scan.nextInt();

				dividir(dividendo, divisor);

				loop = false;

			} catch (InputMismatchException e) {
				System.err.println("\nExceção: " + e);
				scan.nextLine();
				System.out.println("\nPor favor, digite apenas valores numéricos e inteiros!");

			} catch (ArithmeticException e) {
				System.err.println("\nExceção: " + e);
				scan.nextLine();
				System.out.println("\nDigite números inteiros positivos!");

			} finally {
				System.out.println("\nSempre serei executada!\n");

			}

		} while (loop);

	}

	public static void dividir(int dividendo, int divisor) {
		System.out.println("Divisão: " + (dividendo / divisor));
		;
	}

}