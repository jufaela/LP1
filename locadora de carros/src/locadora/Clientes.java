package locadora;

public class Clientes {
	public String nome;
	private String cpf;
	private int ano_nasc;
	
	public Clientes(
			String nome,
			String cpf,
			int nasc)
	
	{
		this.nome=nome;
		this.cpf=cpf;
		this.ano_nasc=nasc;
	}
	
	public void alugar() {
		System.out.println("Obrigada por alugar com a gente! Volte sempre!");
	}
	
	public void cancelar() {
		System.out.println("Seu aluguel foi cancelado.");
	}
	
	public static void main(String[] args) {
		
		Clientes C1 = new Clientes("Maria", "000.000.000-00", 1986);
		Clientes C2 = new Clientes ("Roberta", "111.111.111-11", 1990);
		
		C1.alugar();
		C2.cancelar();
	}


}
