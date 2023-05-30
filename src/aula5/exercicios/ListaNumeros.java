package aula5.exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ListaNumeros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();
		int numero;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número inteiro: ");
			numero = scan.nextInt();
			numeros.add(numero);
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("\nListar dados do Set: ");
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}