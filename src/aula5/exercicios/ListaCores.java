package aula5.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCores {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();
		String cor;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite uma cor: ");
			cor = scan.next();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores: " + cores);

		cores.sort(null);
		System.out.println("\nOrdenar as cores: " + cores);
	}
}