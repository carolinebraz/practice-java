package aula8;

public class Gato {

	private int id;
	private String nome;
	private String raca;
	private int idade;
	private float peso;

	public Gato(int id, String nome, String raca, int idade, float peso) {
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void miar() {
		System.out.println("Meow");
	}

	public void dormir() {
		System.out.println("Zzz");
	}

	public void exibir() {
		System.out.println("Nome: " + nome);
		System.out.println("Raça: " + raca);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " kg");
	}

}