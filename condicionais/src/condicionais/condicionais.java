package condicionais;

public class condicionais {

	public static void main(String[] args) {
		System.out.println("TESTANDO CONDICIONAIS EM JAVA\n");

		int idade = 10;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas > 1;
		
		if(acompanhado) {
			System.out.println("você está acompanhado!!!!!");
		}else {
			System.out.println("você não está acompanhado!!!");
		}

		if (idade >= 18) {
			System.out.println("você é maior de idade, seja bem vindo!!!!");
		} else {

			if (acompanhado) {
				System.out.println("é menor de idade mas pode entrar pois você está acompanhado!!!!");
			} else {
				System.out.println("você é menor de idade, não pode entrar!!!");
			}

		}
	}

}
