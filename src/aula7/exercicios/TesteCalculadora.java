package aula7.exercicios;

import java.util.Scanner;

import aula7.exercicios.calc.Calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float numero1 = 0, numero2 = 0;

		System.out.println("Digite o primeiro número: ");
		numero1 = scan.nextFloat();

		System.out.println("Digite o segundo número: ");
		numero2 = scan.nextFloat();

		System.out.println("\nSoma: " + numero1 + " + " + numero2 + " = " + Calculadora.somar(numero1, numero2));
		System.out.println("Subtração: " + numero1 + " - " + numero2 + " = " + Calculadora.subtrair(numero1, numero2));
		System.out.println("Multiplicação: " + numero1 + " * " + numero2 + " = " + Calculadora.multiplicar(numero1, numero2));
		System.out.println("Divisão: " + numero1 + " / " + numero2 + " = " + Calculadora.dividir(numero1, numero2));

		scan.close();
	}
}