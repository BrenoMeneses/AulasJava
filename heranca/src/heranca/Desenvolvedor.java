package heranca;

public class Desenvolvedor extends Funcionario {
	
	private String linguagem;
	
	public Desenvolvedor(String nome, String cargo, double salario, String linguagem) {
		super(nome, cargo, salario);
		this.linguagem = linguagem;	
	}
	
	public String getLinguagem() {
		return linguagem;
	}
	
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	@Override
	public double bonificacao() {
		return 500;
	}
	
}
