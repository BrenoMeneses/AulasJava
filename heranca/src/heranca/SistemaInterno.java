package heranca;

public class SistemaInterno {
	
	public void entrarNoSistema(Autenticavel funcionario, String senha) {
		if(funcionario.autenticaSenha(senha)) {
			System.out.println("bem vindo ao sistema " + funcionario.getNome());
		}else {
			System.out.println("senha incorreta!!");
		}
	}
	
}
