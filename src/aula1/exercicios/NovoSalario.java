package aula1.exercicios;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		
		float salario, abono;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Digite o salário: \nR$ ");
		salario = scan.nextFloat();
		
		System.out.printf("Digite o abono: \nR$ ");
		abono = scan.nextFloat();
		
		salario += abono;
		System.out.printf("\nNovo salário: \nR$ %.2f", salario);

	}

}
