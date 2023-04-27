package entidade;

public class Extrato {
	private String nome;
	private int conta;
	private double saldo;
	
	public Extrato(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;		
	}

	public Extrato(String nome, int conta, double depositoInicial) {
		this.nome = nome;
		this.conta = conta;
		deposito(depositoInicial);
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito (double quantia) {
		saldo += quantia;
	}
	public void saque (double quantia) {
		saldo -= quantia;
	}
	public String toString() {
		return   nome 
	            +", Conta : "
				+ conta
				+ ", Saldo : R$ "
				+ String.format("%.2f", saldo);
			
	}
}
