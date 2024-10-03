package JavaAssignment5;

public class Bank {
	 protected double amount;
	 protected double balance;
	 protected static double interestrate=0.05;
	 
	 
	public Bank() {
	
		amount = 0.0;
		balance = 0.0;
	}


	public Bank(int amount) {
		super();
		this.amount = amount;
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


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public double applyInterest() {
		balance=amount*interestrate;
		balance=balance+amount;
		return balance;
	}
	 
}
