package programacaoOrientadaAObjetos;

public class Conta {

	private double saldo = 0;
	private int agencia;
	private Cliente cliente;
	private static int totalContas;
	
 	public Conta(int agencia, Cliente cliente) {
		this.agencia = agencia;
		this.cliente = cliente;
		Conta.totalContas++;
	}
	public double pegarSaldo() {
		return this.saldo;
	}
	public double pegarAgencia() {
		return this.agencia;
	}
	public void mudarAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	public static int getTotal() {
		return Conta.totalContas;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	

	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("saldo insuficiente!!");
			System.out.println("seu saldo continua: " + this.saldo + " reais\n");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println("saque efetuado com secesso!!");
			System.out.println("seu novo saldo é: " + this.saldo + " reais\n");
		}
	}

	public void transferir(double valor, Conta destino, Conta origem) {
		if (valor > saldo) {
			System.out.println("saldo insuficiente!!");
			System.out.println("seu saldo continua: " + origem.pegarSaldo() + " reais");
			System.out.println("saldo da conta transferida " + destino.pegarSaldo() + " reais\n");
		} else {
			this.saldo = this.saldo - valor;
			destino.depositar(valor);
			System.out.println("transferência efetuada com secesso!!");
			System.out.println("seu novo saldo é: " + origem.pegarSaldo() + " reais");
			System.out.println("saldo da conta transferida " + destino.pegarSaldo() + " reais\n");
		}
	}

}
