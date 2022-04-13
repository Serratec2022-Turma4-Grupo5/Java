package br.com.residencia.sistema_bancario;

public class Conta {

	String titular;
	int numeroDaConta;
	double saldo;

	public void depositar(double quantidade) {
		this.saldo += quantidade;
	}

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			double saldoAtual = this.saldo - valor;

			return true;
		}
	}

	public boolean transferir(Conta destino, double valor) {
		boolean retirou = this.sacar(valor);
		if (retirou == false) {
			System.out.println("Saldo insuficiente. Transa��o Abortada. Fa�a um dep�sito antes de transferir.");
			return false;
		} else {

			destino.depositar(valor);
			System.out
					.println("Transa��o realizada com sucesso, a conta dep�sito receber� o valor em at� 2 anos �teis");
			return true;

		}
	}
}
