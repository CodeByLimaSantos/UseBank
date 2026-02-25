package Main;

public class UserBank {
	private String donoConta;
	private int numConta;
	private double saldo;
	
	public double novoDeposito (double quantidade) {
		return saldo += quantidade;
		
	}
	public double pagamento (double quantidade) {
		return saldo -= quantidade;
	}
	public String getDonoConta() {
		return donoConta;
	}
	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
