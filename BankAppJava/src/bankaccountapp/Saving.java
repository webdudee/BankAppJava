package bankaccountapp;

public class Saving extends Account {
	private int safetyDepositBoxId;
	private int safetyDepositeBoxKey;

	public Saving(String name, String socialNumber, double balance) {
		super(name, socialNumber, balance);
		accountNumber = "1" + accountNumber;
		setsafetyDepositBoxId();
	}

	
	public void depositt (double amount) {
		balance = balance + amount;
		System.out.println("Depositing $ " + amount);
		printBalance();
	}
	public void withdraw (double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $ " + amount);
		printBalance();
	}
	
	public void transfer (String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $ " + amount + "to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance in now: $ " + balance);
	}
	
	
	
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;

	}

	private void setsafetyDepositBoxId() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));

		safetyDepositeBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		System.out.println("Account Type: SAVINGS");
		super.showInfo();
		System.out.println("Your Saving Account Features" + "\n Safety Deposit Box ID: " + safetyDepositBoxId + "\n Safety Deposit Box KEY: "
				+ safetyDepositeBoxKey);

	}

}
