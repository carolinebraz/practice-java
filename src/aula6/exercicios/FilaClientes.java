package aula6.exercicios;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class FilaClientes {

	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList<String>();
		Scanner scan = new Scanner(System.in);
		String nome;
		int opcao;

		do {

			System.out.println("\n\t\t\t\tFILA DE CLIENTES"
					+ "\n***********************************************************************************\n"
					+ "\n\t\t\t1 - Adicionar clientes na fila"
					+ "\n\t\t\t2 - Listar todos os clientes"
					+ "\n\t\t\t3 - Retirar clientes da fila"
					+ "\n\t\t\t0 - Sair\n"
					+ "\n***********************************************************************************\n"
					+ "Digite a opção desejada:");

			opcao = scan.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("\nPrograma finalizado");
				return;

			case 1:
				System.out.println("Digite o nome do(a) cliente: ");
				clientes.add(nome = scan.next());

				System.out.println("\nFila:\n");

				for (String clients : clientes) {
					System.out.println(clients);
				}

				System.out.println("\nO(A) cliente " + nome + " foi adicionado(a) na fila!");
				break;

			case 2:
				System.out.println("\nLista de clientes:\n");

				for (String clients : clientes) {
					System.out.println(clients);
				}
				break;

			case 3:
				if (clientes.isEmpty()) {
					System.out.println("\nA fila de clientes está vazia!");
				} else {
					System.out.println("\nO(A) cliente " + clientes.poll() + " foi chamado(a)!");
				}
				break;

			default:
				System.out.println("\nPor favor, digite uma opção válida!");
				break;
			}

		} while (true);

	}

}