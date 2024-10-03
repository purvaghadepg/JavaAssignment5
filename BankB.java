package JavaAssignment5;

public class BankB extends Bank {
	private double amount;
	private double balance;
	
	public BankB() {
		amount=0.0;
		balance=0.0;
	}
	public BankB(double amount, double balance) {
		super();
		this.amount = amount;
		this.balance = balance;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	 
	public double applyInterest() {
		balance=amount*(0.03+interestrate);
		balance=balance+amount;
		return balance;

	

}
}


