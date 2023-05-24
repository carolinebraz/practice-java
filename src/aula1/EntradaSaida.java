package aula1;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String nome;
		float distancia;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nome = scan.next();
		
		System.out.println("Qual a distância percorrida?");
		distancia = scan.nextFloat();
		
		System.out.println("\nParabéns "+ nome +", a distância "
				+ "percorrida foi de "+ distancia +" km.");
	
	}

}
