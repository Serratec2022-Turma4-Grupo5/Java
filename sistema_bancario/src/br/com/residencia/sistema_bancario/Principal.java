package br.com.residencia.sistema_bancario;

public class Principal {

	public static void main(String[] args) {

		Conta devSix = new Conta();
		Conta serratec = new Conta();

		devSix.titular = "Jos� Aldo";
		devSix.saldo = 10000.00;
		devSix.numeroDaConta = 001;
		
		serratec.titular = "Marcos Andr�";
		serratec.saldo = 30000.00;
		serratec.numeroDaConta = 002;
		
		

		System.out.println("Saldo atual: " + devSix.saldo + 
				"\nNome do titular: " + devSix.titular);
		
		System.out.println("Saldo atual: " + serratec.saldo + 
				"\nNome do titular: " + serratec.titular);

	}

}
