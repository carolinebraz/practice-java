package aula9;

public class TesteAutomovel {

	public static void main(String[] args) {
		Automovel carro = new Automovel(5, 4, 110.5f, "vermelho", 4, "GEN 6523", 3); 
		Automovel carro2 = new Automovel("azul", 2, "DIA 1406", 3);
		
		carro.visualizar();
		System.out.println();
		carro2.visualizar();
		
	}

}