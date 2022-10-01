package bankApp2;

public class Account {
	
	public double balance;
	
	//constructor
	public Account(double initBalance) {
		balance = initBalance;
	}

	//getBalance
	public double getBalance() {
		return balance;
	}
	
	//deposit
	public boolean deposit(double amt) {
	        balance += amt;
	        return true;
	}
	
	//withdraw
	public boolean withdraw(double amt)	{
		
		boolean result = false; // withdraw operation failure
		
		if(balance >= amt) {
			balance -= amt;
			result = true; // operation succeeded
		} 
		
		return result;
	}
		
	
}
