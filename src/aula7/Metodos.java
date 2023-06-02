package aula7;

public class Metodos {

	public static void main(String[] args) {
		System.out.println(somar(1, 2));
		exibir();
		exibirValor(somar(2,5));
		exibirValor(2+3);
	}

	public static int somar(int n1, int n2) {
		return n1 + n2;
	}

	public static void exibir() {
		System.out.println("Hello world!");
	}

	public static void exibirValor(int valor) {
		System.out.println("Resultado: " + valor);
	}
}