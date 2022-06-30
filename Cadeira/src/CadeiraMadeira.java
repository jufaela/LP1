public class CadeiraMadeira extends Cadeira {
	public CadeiraMadeira(String marca, String modelo, String cor) {
		super(marca, modelo, cor);
		// TODO Auto-generated constructor stub
	}

	public String descerAlturaCadeira() {
		String Texto = "A cadeira não pode descer";
		System.out.println(Texto);
		return Texto;
	}
	public static void main(String[] args) {
		CadeiraMadeira cadeira3 = new CadeiraMadeira("Elements Veda Ignis", "gamer", "Preta e Vermelha");
		cadeira3.descerAlturaCadeira();
	}
}
 