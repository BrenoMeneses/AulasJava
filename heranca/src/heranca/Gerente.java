package heranca;

public class Gerente extends Funcionario implements Autenticavel {
	
	private String senha = "12345";
	
	public Gerente(String nome, String cargo, double salario) {
		super(nome, cargo, salario);
	}
	
	@Override
	public boolean autenticaSenha(String senha) {
		if(senha == this.senha) {
			return true;
		}else {
			return false;
		}}
	
	@Override
	public double bonificacao() {
		return super.getSalario();
	}
	
}
