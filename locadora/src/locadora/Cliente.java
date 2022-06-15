package locadora;

public class Cliente {
	private String nome;
	private int cpf;
	private int ano_nasc;
	
	public Cliente (String nome, int cpf, int ano_nasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.ano_nasc = ano_nasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public int getAno_nasc() {
		return ano_nasc;
	}
	
}
