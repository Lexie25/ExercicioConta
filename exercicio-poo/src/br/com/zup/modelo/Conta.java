package br.com.zup.modelo;

public class Conta {

	// Atributos
	private String numeroConta;
	private String banco;
	private String agencia;
	private double saldo;

	// Construtor
	public Conta(String numeroConta, String banco, String agencia,
			double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.banco = banco;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	// Gets e Sets
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// toString
	@Override
	public String toString() {

		String modelo = "";
		modelo += "\n - Número Conta -> " + this.getNumeroConta() + "\n";
		modelo += " -Banco ->" + this.getBanco() + "\n";
		modelo += " -Agência -> " + this.getAgencia() + "\n";
		modelo += " -Saldo -> " + this.getSaldo() + "\n";

		return modelo;
	}
	public void depositar(double valor) {
		double totalValor =  this.getSaldo()+ valor;
		this.setSaldo(totalValor);

	}
	public void sacar(double valor) { 
		if (this.getSaldo() >= valor) { 
			double valorTotal = this.getSaldo()-valor;
			this.setSaldo(valorTotal);
		}else { 
			System.out.println("Você não pode sacar!");
		}

	}
	public void saldoAtual(){
		System.out.println("Seu saldo é:" + this.getSaldo());
	}
	public void transferencia(double valorTransferencia, conta conta) {
		this.setSaldo(this.getSaldo()-valorTransferencia);
		conta.setSaldo(conta.getSaldo()+ valorTransferencia);
		if(valorTransferencia > this.getSaldo());
		System.out.println("Saldo insuficiente");
	} else{ 
		System.out.println("Você conseguiu transferir com sucesso!"); 
	}
}


