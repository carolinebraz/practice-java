package aula4;

public class Matriz {

	public static void main(String[] args) {
		int matrizInteiros[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("O valor armazenado na posição [" + i + "][" + j + "] é: " + matrizInteiros[i][j]);
			}
		}
		System.out.println("\nO comprimento da linha é " + matrizInteiros.length);
		System.out.println("O comprimento da coluna é " + matrizInteiros[0].length);
	}
}