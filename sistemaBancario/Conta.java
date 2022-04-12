package sistemaBancario;

public class Conta {

	String titular;
	int numeroDaConta;	
	double saldo;

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} 
		else {
			double saldoAtual = this.saldo - valor;
			//this.saldo = saldoAtual;
			return true;
		}

	}

	public boolean transferir(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;

		boolean retirou = this.sacar(valor);
		if (retirou == false) {
			return false;
		}
		else {
			destino.deposita(valor);
			return true;

		}
	}
}
