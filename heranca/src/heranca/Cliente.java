package heranca;

public class Cliente implements Autenticavel{
	
	private String nome;
	private String cpf;
	private String senha = "12345";
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public boolean autenticaSenha(String senha) {
		if(senha == this.senha) {
			return true;
		}else {
			return false;
		}
	}
	
}
