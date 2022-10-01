package test2;

import bankApp2.Account;
import bankApp2.Customer;

public class TestBanking {

	public static void main(String[] args) {
		
		
		// Customer Jane Smith
		System.out.println("Creating customer Jane Smith");
		Customer theCustomer = new Customer("Jane", "Smith");
	
		System.out.println("Creating her account with 500.00 balance");
	    Account account = new Account(500.00);
	    theCustomer.setAccount(account);
	    
	    System.out.println("Withdraw 150.00" + account.withdraw(150));  
	    System.out.println("Deposit 22.50" + account.deposit(22.50));
	    System.out.println("withdraw 47.62" + account.withdraw(47.62));
	    System.out.println("Withdraw 400.00" + account.withdraw(400.00));
	     
	    	    
		System.out.println("The customer " + theCustomer.getFirstName()+" " + theCustomer.getLastName() +
		                   "has a balance of " + theCustomer.getAccount().getBalance());

	
	}

}
