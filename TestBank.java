package JavaAssignment5;

public class TestBank {

	public static void main(String[] args) {
	
		BankA bank = new BankA();
		bank.setAmount(2000);
		System.out.println(" Bank A balance is"+ bank.applyInterest());

		BankB bankb = new BankB();
		bankb.setAmount(1000);
		System.out.println(" Bank A balance is"+ bankb.applyInterest());
		
		
	}

}

