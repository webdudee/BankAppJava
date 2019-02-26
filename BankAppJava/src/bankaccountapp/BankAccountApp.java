package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<>();
		
		
		
		/*Checking checkacc = new Checking("John Smith", "123456789", 1500);
		Saving saveacc = new Saving ("Jack Black" , "123456789", 2500);
		saveacc.compound();
		checkacc.showInfo();
		System.out.println("***********");
		saveacc.showInfo();*/

		String file = "C:\\Users\\home\\Downloads\\NewBankAccounts.csv";
		List<String[]> newAccount = utilities.CSV.read(file);
		for (String[] ah : newAccount) {
			String name = ah[0];
			String socialNumber = ah[1];
			String accountType = ah[2];
			double initDeposit = Double.parseDouble(ah[3]);
			System.out.println(name + " " + socialNumber + " " + accountType + " " +  initDeposit );
			if (accountType.equals("Savings")) {
				System.out.println("OPEN A SAVING ACCOUNT");
				accounts.add(new Saving(name,socialNumber,initDeposit));
			}
			else if (accountType.equals("Checking")) {
				System.out.println("OPEN CHECKING ACCOUNT");
				accounts.add(new Checking(name,socialNumber,initDeposit));
			}
			else {System.out.println("ERROR");}
		}
		for (Account acc : accounts) {
			System.out.println("***************");
		acc.showInfo();
		}
	}}
