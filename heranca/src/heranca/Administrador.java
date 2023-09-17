package heranca;

public class Administrador extends Funcionario implements Autenticavel{
	
	private String senha = "12345";
	
	public Administrador(String nome, String cargo, double salario) {
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
		return (super.getSalario() / 100) * 50;
	}
	
}
