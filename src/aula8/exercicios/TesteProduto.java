package aula8.exercicios;

public class TesteProduto {

	public static void main(String[] args) {

		Produto jogo1 = new Produto("Escape Zoom", "Corporação Tubo", "DeltaBox", "Ação/Puzzle", 1, 32.99, 8);
		Produto jogo2 = new Produto("Lorem Ipsum Ultimate", "Disnastia Pixel", "Irata 2000", "RPG/Aventura", 2, 39.99, 5);

		jogo1.visualizar();
		System.out.println();
		jogo2.visualizar();
	}
}