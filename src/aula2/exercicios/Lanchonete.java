package aula2.exercicios;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final float CACHORROQUENTE = 10, 
				XSALADA = 15,
				XBACON = 18,
				BAURU = 12,
				REFRIGERANTE = 8,
				SUCODELARANJA = 13;
		
		int produto, quantidade;
		float valorTotal;
		
		System.out.println("Digite o código do produto:"
				+ "\n1 - Cachorro Quente"
				+ "\n2 - X-Salada"
				+ "\n3 - X-Bacon"
				+ "\n4 - Bauru"
				+ "\n5 - Refrigerante"
				+ "\n6 - Suco de Laranja");
		produto = scan.nextInt();
		
		System.out.println("Digite a quantidade consumida:");
		quantidade = scan.nextInt();		
		
		switch (produto) {
		case 1:
			valorTotal = CACHORROQUENTE * quantidade;
			System.out.printf("Produto: Cachorro Quente\nValor total: R$ %.2f", valorTotal);
			break;
		case 2: 
			valorTotal = XSALADA * quantidade;
			System.out.printf("Produto: X-Salada\nValor total: R$ %.2f", valorTotal);
			break;
		case 3:
			valorTotal = XBACON * quantidade;
			System.out.printf("Produto: X-Bacon\nValor total: R$ %.2f", valorTotal);
			break;
		case 4: 
			valorTotal = BAURU * quantidade;
			System.out.printf("Produto: Bauru\nValor total: R$ %.2f", valorTotal);
			break;
		case 5:
			valorTotal = REFRIGERANTE * quantidade;
			System.out.printf("Produto: Refrigerante\nValor total: R$ %.2f", valorTotal);
			break;
		case 6:
			valorTotal = SUCODELARANJA * quantidade;
			System.out.printf("Produto: Suco de laranja\nValor total: R$ %.2f", valorTotal);
			break;
		}	
		
	}

}