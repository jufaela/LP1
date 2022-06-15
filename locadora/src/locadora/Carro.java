package locadora;
//classe carro com os seus atributos
public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private float preco;
//metodo construtor para obrigar o usuario a inserir todas as informações	
	public Carro (String marca, String modelo, int ano, String placa, float preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.preco = preco;
	}
//metodos de acesso para pegar as informações que estavam privadas e alterar aquilo que for possivel com o metodo set
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public String getPlaca() {
		return placa;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
		
}
