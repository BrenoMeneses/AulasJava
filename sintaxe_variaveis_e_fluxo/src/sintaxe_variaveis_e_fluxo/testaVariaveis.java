package sintaxe_variaveis_e_fluxo;

/**
 * 
 */
public class testaVariaveis {

	public static void main(String[] args) {
		
		System.out.println("VARIAVEIS INTEIRAS");
		System.out.println("");
		
		int idade = 90;
		
		System.out.println("sua idade é " + idade);
		
		System.out.println("");
		System.out.println("VARIAVEIS DOUBLE");
		System.out.println("");
		
		double salario = 1000.40;
		
		System.out.println("seu salario é " + salario);
		
		System.out.println("");
		System.out.println("CONVERSAO");
		System.out.println("");
		
		int valor = (int) salario;
		
		System.out.println(valor);
		
		System.out.println("");
		System.out.println("numericos");
		System.out.println("");
		
		long numeroGrande = 34123123123L;
		
		short numeroPequeno = 1233;
		
		byte b = 123;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		System.out.println(valor1 + valor2);
		
		System.out.println("");
		System.out.println("CARACTERES");
		System.out.println("");
		
		char letra = 'a';
		
		char outraLetra = 89;
		
		System.out.println(letra + " " + outraLetra);
		
		outraLetra = (char) (outraLetra + 1);
		
		System.out.println(outraLetra);
		
		String texto = "algum texto ai sla";
		System.out.println(texto);
		
		texto = texto + " " + 1000;
		System.out.println(texto);
		
	}

}
