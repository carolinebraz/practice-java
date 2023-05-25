package aula2.exercicios;

import java.util.Scanner;

public class OperacoesMatematicas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float numero1, numero2;
		int operacao;
		
		System.out.print("Digite o 1º número: ");
		numero1 = scan.nextFloat();
		
		System.out.print("Digite o 2º número: ");
		numero2 = scan.nextFloat();
		
		System.out.print("Digite o código da operação "
				+ "[ 1 - Soma "
				+ "| 2 - Subtração "
				+ "| 3 - Multiplicação "
				+ "| 4 - Divisão ] ");
		operacao = scan.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("\n"+ numero1 +" + "+ numero2 +" = "+ (numero1 + numero2));
			break;
		case 2:
			System.out.println("\n"+ numero1 +" - "+ numero2 +" = "+ (numero1 - numero2));
			break;
		case 3:
			System.out.println("\n"+ numero1 +" * "+ numero2 +" = "+ (numero1 * numero2));
			break;
		case 4:
			System.out.println("\n"+ numero1 +" / "+ numero2 +" = "+ (numero1 / numero2));
			break; 
		default:
			System.out.println("\nOperação inválida!");
		}
		
	}

}
