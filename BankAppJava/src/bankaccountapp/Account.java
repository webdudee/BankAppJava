package bankaccountapp;

public abstract class Account implements IBaseRate {

	private String name;
	private String socialNumber;
	protected double balance;
	protected String accountNumber;
	protected double rate;
	static  int index = 10000;
	
	
	public Account (String name,String socialNumber,double balance) {
		this.name = name;
		this.socialNumber = socialNumber;
		this.balance = balance;
		
		
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println(getBaseRate());
		setRate();
		}

	public abstract void setRate();

	public void compound () {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" +  accruedInterest) ;
	}
	
	public String setAccountNumber() {
		String lastTwoOfSSN= socialNumber.substring(socialNumber.length()-2, socialNumber.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void showInfo() {
		System.out.println("Name: " + name +
				"\nAccount Number: " + accountNumber +
				"\nBalance: " + balance +
				"\nRate: " + rate + "%" );
	}
	
	
}
