package locadora;

public class Funcionario {
	public String nome;
	private String cpf;
	public int num_alugueis;
	
	public Funcionario (
			String nome,
			String cpf,
			int num_alugueis)
	{
		this.nome=nome;
		this.cpf=cpf;
		this.num_alugueis=num_alugueis;
	}
	
	public void trabalhando() {
		System.out.println("O(a) funcion�rio(a) "+this.nome+" est� em seu hor�rio de servi�o.");
	}
	
	public void folgando() {
		System.out.println("O(a) funcion�rio(a) "+this.nome+" est� folgando.");
	}
	
	public void alugueis() {
		System.out.println("O(a) funcion�rio(a) "+this.nome+" fez "+this.num_alugueis+" alugueis de carros.");
	}
	
	public static void main(String[] args) {
		
		Funcionario C1 = new Funcionario("Maria", "000.000.000-00", 10);
		Funcionario C2 = new Funcionario ("Pedro", "111.111.111-11", 8);
		
		C1.trabalhando();
		C1.alugueis();
		C2.folgando();
	}

}
