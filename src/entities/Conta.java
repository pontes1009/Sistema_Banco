package entities;

public class Conta {
	private String titular;
	private double saldo;
	private int numeroConta;
	
	public Conta(String titular, int numeroConta) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
	}

	public Conta(String titular, double depositoInicial, int numeroConta) {
		super();
		this.titular = titular;
		deposito(depositoInicial);
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void deposito (double quantia) {
		saldo = saldo + quantia;
	}
	public void saque (double quantia) {
		saldo = saldo - quantia - 5;
	}
	public String toString() {
		return "Conta :"
				+ numeroConta
				+ " Titular: "
				+ titular
				+ " Saldo: $"
				+String.format("%.2f", saldo);
				
	}
}
