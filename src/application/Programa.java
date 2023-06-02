package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Entre com o numero da conta");
		int numero = sc.nextInt();
		System.out.println("Entre com o titular da conta");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("tem deposito inicial? (y/n)");
		char resposta = sc.next().charAt(0);
		if(resposta =='y') {
			System.out.println("Entre com o deposito inicial");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(titular,depositoInicial, numero );
		} else {
			conta = new Conta (titular, numero);
		}
		System.out.println();
		System.out.println("Dados da conta");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do deposito");
		System.out.println();
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Dados da conta atualizados");
		System.out.println(conta);
		
		
		System.out.println();
		System.out.print("Entre com o valor do saque");
		System.out.println();
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Dados da conta atualizados");
		System.out.println(conta);
	}

}
