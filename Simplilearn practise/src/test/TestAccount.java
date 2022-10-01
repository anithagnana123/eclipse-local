package test;

import bankApp.Account;

public class TestAccount {

	public static void main(String[] args) {
		//declaration
		Account acct; 
		
		// initialization
		acct = new Account(20.0);
		
		//access the member of Account class
		//acct.setBalance(-10.9);
		
		acct.deposit(100);
	    acct.withDraw(50);
		
	    System.out.println("Final balance is " + acct.getBalance());
	}
	
}
