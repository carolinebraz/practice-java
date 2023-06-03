package aula8;

public class TesteGato {

	public static void main(String[] args) {

		Gato gato1 = new Gato(1, "Safira", "Maine Coon", 5, 4.2f);

		gato1.exibir();
		System.out.println();
		gato1.miar();
		System.out.println();
		gato1.dormir();

	}

}