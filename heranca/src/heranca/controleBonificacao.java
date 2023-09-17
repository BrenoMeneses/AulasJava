package heranca;

public class controleBonificacao {

	private double soma;
	
	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.bonificacao();
		soma += bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}
	
}
