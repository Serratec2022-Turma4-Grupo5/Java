package sistemaBancario;

public class Conta {

	String titular;
	int numeroDaConta;	
	double saldo;
	
	public void checkTransferencia(Conta destino, double valor) {
		if(!transferir(Conta destino, double valor)) {
			System.out.println("Saldo atual: "+this.saldo);
		}else {
			System.out.println("Saldo novo: "+this.saldo);
		}
	}

	public double sacar(double valor) {
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
		

		boolean retirou = this.sacar(valor);
		if (retirou == false) {
			System.out.println("Saldo insuficiente. Transa��o Abortada. Fa�a um dep�sito antes de transferir.");
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
			destino.deposita(valor);
			System.out.println("Transa��o realizada com sucesso, a conta dep�sito receber� o valor em at� 2 anos �teis");
			return true;
			
		}
	}
}
