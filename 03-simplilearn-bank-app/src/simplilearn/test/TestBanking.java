package simplilearn.test;

import simplilearn.domain.Account;
import simplilearn.domain.Customer;

public class TestBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println("Creating customer Jane Smith");
      Customer theCustomer = new Customer("Jane","Smith");
      
      System.out.println("Creating her account with a 500.00 balance");
      Account account = new Account(500.00);
      theCustomer.setAccount(account);
      
      System.out.println("Withdraw 150 " +  account.withdraw(150.00));
      System.out.println("Deposit 22.50 " +  account.deposit(22.50));
      System.out.println("Withdraw 47.62 " +  account.withdraw(47.62));
      System.out.println("Withdraw 400.00 " +  account.withdraw(400.00));
      
      System.out.println("Customer ["+ theCustomer.getfirstName() + "," 
                         + theCustomer.getlastName()
                         + "] has a balance of " + theCustomer.getAccount().getbalance());
      
	}

}
