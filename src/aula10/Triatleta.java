package aula10;

public class Triatleta extends Pessoa implements ITriatleta {

	private int idade;

	public Triatleta(String nome, int idade) {
		super(nome);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public void falar() {
		System.out.println("Bora treinar!");
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo...");
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando...");
	}

	@Override
	public void correr() {
		System.out.println("Correndo...");
	}

	@Override
	public void nadar() {
		System.out.println("Nadando...");
	}

}