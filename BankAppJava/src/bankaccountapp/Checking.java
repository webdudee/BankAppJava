package bankaccountapp;

public class Checking extends Account {
	private int debitCArdNumber;
	private int debitCardPin;

	public Checking(String name, String socialNumber, double balance) {
		super(name, socialNumber, balance);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
		
	}
	
	private void setDebitCard() {
		debitCArdNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo () {
		System.out.println("Account Type: CHECKING");
		super.showInfo();
		System.out.println("Your Checking Account Features" + 
				"\n Debit Card Number: " + debitCArdNumber +
				"\n Debit Card PIN: " + debitCardPin);
		
	}

	
}
