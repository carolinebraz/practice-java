package aula6.exercicios;

import java.util.Stack;
import java.util.Scanner;

public class PilhaLivros {

	public static void main(String[] args) {

		Stack<String> livros = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		String titulo;
		int opcao;

		do {
			
			System.out.println("\n\t\t\t\tPILHA DE LIVROS"
					+ "\n***********************************************************************************\n"
					+ "\n\t\t\t1 - Adicionar livro na pilha"
					+ "\n\t\t\t2 - Listar todos os livros"
					+ "\n\t\t\t3 - Retirar livro da pilha"
					+ "\n\t\t\t0 - Sair\n"
					+ "\n***********************************************************************************\n"
					+ "Digite a opção desejada: ");

			opcao = scan.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("\nPrograma finalizado");
				return;

			case 1:
				System.out.println("Qual o título do livro que deseja adicionar? ");
				scan.skip("\\R?");
				livros.push(titulo = scan.nextLine());

				System.out.println("\nPilha:\n");

				for (String livro : livros) {
					System.out.println(livro);
				}

				System.out.println("\nO livro \"" + titulo + "\" foi adicionado na pilha!");
				break;

			case 2:
				if (!livros.isEmpty()) {
					System.out.println("\nLista de livros:\n");
					for (String livro : livros) {
						System.out.println(livro);
					}
				} else {
					System.out.println("\nA lista de livros está vazia! Você pode adicionar um livro utilizando a opção 1");
				}
				break;

			case 3:
				if (livros.isEmpty()) {
					System.out.println("\nA pilha de livros está vazia!");
				} else {
					System.out.println("\nO livro \"" + livros.pop() + "\" foi retirado da pilha!");
				}
				break;

			default:
				System.out.println("\nPor favor, digite uma opção válida!");
				break;
			}

		} while (true);

	}

}