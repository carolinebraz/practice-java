package aula1.exercicios;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		float salarioLiquido, salarioBruto, adicionalNoturno, horasExtras, descontos;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Digite o valor do salário bruto: \nR$ ");
		salarioBruto = scan.nextFloat();
		
		System.out.printf("Digite o valor do adicional noturno: \nR$ ");
		adicionalNoturno = scan.nextFloat();
		
		System.out.printf("Digite o valor das horas extras: \nR$ ");
		horasExtras = scan.nextFloat();
		
		System.out.printf("Digite o valor dos descontos: \nR$ ");
		descontos = scan.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nO valor do salário líquido é de: \nR$ %.2f", salarioLiquido);

	}

}
