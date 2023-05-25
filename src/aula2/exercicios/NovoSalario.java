package aula2.exercicios;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		final float GERENTE = 0.10f, 
				VENDEDOR = 0.07f,
				SUPERVISOR = 0.09f,
				MOTORISTA = 0.06f,
				ESTOQUISTA = 0.05f,
				TECNICODETI = 0.08f;
		
		String nome;
		int cargo;
		float salario;
		
		System.out.print("Nome do(a) colaborador(a): ");
		nome = scan.nextLine();
		
		System.out.print("Digite o código do cargo: ");
		cargo = scan.nextInt();
		
		System.out.print("Digite o salário: R$ ");
		salario = scan.nextFloat();
		
		switch (cargo) {
		case 1:
			salario += GERENTE * salario;
			System.out.print("\nNome do(a) colaborador(a): "+ nome +"\nCargo: Gerente");
			System.out.printf("\nSalário: R$ %.2f", salario);
			break;
		case 2: 
			salario += VENDEDOR * salario;
			System.out.print("\nNome do(a) colaborador(a): "+ nome +"\nCargo: Vendedor");
			System.out.printf("\nSalário: R$ %.2f", salario);
			break;
		case 3:
			salario += SUPERVISOR * salario;
			System.out.print("\nNome do(a) colaborador(a): "+ nome +"\nCargo: Supervisor");
			System.out.printf("\nSalário: R$ %.2f", salario);
			break;
		case 4: 
			salario += MOTORISTA * salario;
			System.out.print("\nNome do(a) colaborador(a): "+ nome +"\nCargo: Motorista");
			System.out.printf("\nSalário: R$ %.2f", salario);
			break;
		case 5:
			salario += ESTOQUISTA * salario;
			System.out.print("\nNome do(a) colaborador(a): "+ nome +"\nCargo: Estoquista");
			System.out.printf("\nSalário: R$ %.2f", salario);
			break;
		case 6:
			salario += TECNICODETI * salario;
			System.out.print("\nNome do(a) colaborador(a): "+ nome +"\nCargo: Técnico de TI");
			System.out.printf("\nSalário: R$ %.2f", salario);
			break;
		}	
		
	}

}