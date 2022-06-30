
public class Cadeira {
	private String marca;
	private String modelo;
	private String cor;

	// metodo construtor para obrigar o usuario a inserir todas as informações
	public Cadeira(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}

	public String subirAlturaCadeira() {
		String Texto = "Você subiu a cadeira";
		System.out.println(Texto);
		return Texto;
	}

	public String descerAlturaCadeira() {
		String Texto = "Você desceu a cadeira";
		System.out.println(Texto);
		return Texto;
	}

	// metodos de acesso para pegar as informações que estavam privadas e alterar
	// aquilo que for possivel com o metodo set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


	public static void main(String[] args) {

		Cadeira cadeira = new Cadeira("Elements Veda Ignis", "gamer", "Preta e Vermelha");
		cadeira.subirAlturaCadeira();
		Cadeira cadeira2 = new Cadeira("Elements Veda Ignis", "gamer", "Preta e Azul");
		cadeira2.descerAlturaCadeira();
		CadeiraMadeira cadeira3 = new CadeiraMadeira("Elements Veda Ignis", "gamer", "Rosa e Branco");
		cadeira3.descerAlturaCadeira();
	}
}
