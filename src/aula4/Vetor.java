package aula4;

public class Vetor {

	public static void main(String[] args) {
		String vetorCachorros[] = { "Boxer", "Pastor A", "Pinscher", "Husky", "Corgi" };

		for (int i = 0; i < vetorCachorros.length; i++) {
			System.out.println((i + 1) + "ª casa: " + vetorCachorros[i]);

		}
		System.out.println("\nO tamanho do vetor é [" + vetorCachorros.length + "]");
	}

}
