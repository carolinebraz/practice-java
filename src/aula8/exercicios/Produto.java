package aula8.exercicios;

public class Produto {

	private String nome;
	private String desenvolvedor;
	private String plataforma;
	private String genero;
	private int id;
	private double preco;
	private int estoque;

	public Produto(String nome, String desenvolvedor, String plataforma, String genero, int id, double preco,
			int estoque) {
		this.nome = nome;
		this.desenvolvedor = desenvolvedor;
		this.plataforma = plataforma;
		this.genero = genero;
		this.id = id;
		this.preco = preco;
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void visualizar() {
		System.out.println("Título do jogo: " + nome);
		System.out.println("Desenvolvedor: " + desenvolvedor);
		System.out.println("Plataforma: " + plataforma);
		System.out.println("Gênero: " + genero);
		System.out.println("Código do produto: " + id);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Estoque: " + estoque + " unidades");
	}
}