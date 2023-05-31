package aula6;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<Integer>();

		for (int i = 0; i <= 10; i++) {
			fila.add(i);
		}

		System.out.println("\nPrimeiro elemento da fila: " + fila.peek());
		
		System.out.println("\nExibe elementos na fila: " + fila);
		
		System.out.println("\nRemover elemento: " + fila.poll());
		
		System.out.println("\nFila atualizada: " + fila);
		
		System.out.println("\nAdicionar elemento: " + fila.add(11));
	}

}