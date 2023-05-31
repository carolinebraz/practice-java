package aula6;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		pilha.push("O Assassinato no Expresso do Oriente");
		pilha.push("O Alquimista");
		pilha.push("Como Influenciar Pessoas");
		pilha.push("Persépolis");
		pilha.push("Um Estudo em Vermelho");

		System.out.println("\nElemento no topo da pilha: " + pilha.peek());

		System.out.println("\nElementos da pilha: " + pilha);

		System.out.println("\nRetirar elemento: " + pilha.pop());

		System.out.println("\nPilha atualizada: " + pilha);

		System.out.println("\nAdicionar elemento: " + pilha.push("Duna"));

		System.out.println("\nExibir a pilha atualizada: " + pilha);

	}

}