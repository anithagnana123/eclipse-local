package simplilearn.test;

import simplilearn.domain.Account;
import simplilearn.domain.Bank;
import simplilearn.domain.CheckingAccount;
import simplilearn.domain.Customer;
import simplilearn.domain.SavingsAccount;

public class TestBanking {

	public static void main(String[] args) {
		
	Bank bank = new Bank();
	Customer customer;
	Account acct;
	
	System.out.println("Creating Jane Smith");
	bank.addCustomer("Jane", "Smith");
	customer = bank.getCustomer(0);
	System.out.println("creating her savings account with a 500.00 balance and 3% interest");
	customer.setAccount(new SavingsAccount(500.00,0.03));
	
	System.out.println("Creating Will Smith");
	bank.addCustomer("Will", "Smith");
	customer = bank.getCustomer(1);
	System.out.println("creating his checking account with a 500.00 balance and no overdraft protection");
	customer.setAccount(new CheckingAccount(500.00));
	
	System.out.println("Creating Tom Cruise");
	bank.addCustomer("Tom", "Cruise");
	customer = bank.getCustomer(2);
	System.out.println("creating his checking account with a 500.00 balance and 500.00 in overdraft protection");
	customer.setAccount(new CheckingAccount(500.00,500.00));
	
	System.out.println("Creating Nichol Kidman");
	bank.addCustomer("Nichol", "Kidman");
	customer = bank.getCustomer(3);
	System.out.println("Maria shares account with her husband");
	customer.setAccount(bank.getCustomer(2).getAccount());
	
	System.out.println();
	System.out.println("=======================");
	
	//Test standard savings account
	System.out.println("Creating Jane Smith Savings Account details");
	customer = bank.getCustomer(0);
	acct = customer.getAccount();
	//perform transactions
	System.out.println("Withdraw 150.00" + acct.withdraw(150.00));
	System.out.println("Deposit 10.00" + acct.withdraw(10.00));
	System.out.println("Withdraw 20.00" + acct.withdraw(20.00));
	System.out.println("Withdraw 20.00" + acct.withdraw(20.00));
	//print acccount final balance
	System.out.println("Customer [" + customer.getlastName() + "," + customer.getfirstName()
	                   + "] has a balance of "+acct.getbalance());
	
	System.out.println();
	System.out.println("=======================");
	
	//Test standard checking account
	System.out.println("Creating Will Smith Checking Account details with no overdraft protection");
	customer = bank.getCustomer(1);
	acct = customer.getAccount();
	//perform transactions
	System.out.println("Withdraw 150.00" + acct.withdraw(150.00));
	System.out.println("Deposit 10.00" + acct.withdraw(10.00));
	System.out.println("Withdraw 20.00" + acct.withdraw(20.00));
	System.out.println("Withdraw 400.00" + acct.withdraw(400.00));
	//print acccount final balance
	System.out.println("Customer [" + customer.getlastName() + "," + customer.getfirstName()
	                   + "] has a balance of "+acct.getbalance());
	
	System.out.println();
	System.out.println("=======================");
	
	//Test standard checking account
		System.out.println("Creating Tom Checking Account details with overdraft protection");
		customer = bank.getCustomer(2);
		acct = customer.getAccount();
		//perform transactions
		System.out.println("Withdraw 150.00" + acct.withdraw(150.00));
		System.out.println("Deposit 10.00" + acct.withdraw(10.00));
		System.out.println("Withdraw 20.00" + acct.withdraw(20.00));
		System.out.println("Withdraw 400.00" + acct.withdraw(400.00));
		//print acccount final balance
		System.out.println("Customer [" + customer.getlastName() + "," + customer.getfirstName()
		                   + "] has a balance of "+acct.getbalance());
	
		System.out.println();
		System.out.println("=======================");
		
		//Test standard checking account
			System.out.println("Creating Maria Checking Account details with overdraft protection");
			customer = bank.getCustomer(3);
			acct = customer.getAccount();
			//perform transactions
			System.out.println("Withdraw 50.00" + acct.withdraw(50.00));
			//print acccount final balance
			System.out.println("Customer [" + customer.getlastName() + "," + customer.getfirstName()
			                   + "] has a balance of "+acct.getbalance());
		
	}	

}
