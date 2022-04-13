package br.com.residencia.sistema_bancario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conta devSix = new Conta();
		Conta serratec = new Conta();

		devSix.titular = "José Aldo";
		devSix.saldo = 10000.00;
		devSix.numeroDaConta = 001;
		
		serratec.titular = "Marcos André";
		serratec.saldo = 30000.00;
		serratec.numeroDaConta = 002;
		
		
		//testando impressoes

		System.out.println("Saldo atual: " + devSix.saldo + 
				"\nNome do titular: " + devSix.titular);
		
		System.out.println(devSix.sacar(2000.00));
		System.out.println(devSix.saldo);
		
		System.out.println("Quanto deseja transferir para Serratec?");
		double vlr = sc.nextDouble();
		devSix.transferir(serratec, vlr);
		
		System.out.println("Saldo atual: " + devSix.saldo);
		System.out.println("Saldo atual da conta destino: " + serratec.saldo);
		
		sc.close();
	}

}
