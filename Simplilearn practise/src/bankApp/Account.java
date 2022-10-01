package bankApp;

public class Account {

	private double balance;
	
	public Account(double initBalance) {
		if(initBalance > 10) {
			balance = initBalance;	
		} 
		else {
			//System.err.ptintln prints the error message in red color
		    System.err.println("Account balance should be greater than 10");	
		}
			
	}

	
	public void deposit(double amt) {
		balance = balance + amt;
		
	}
	
	public void withDraw(double amt) {
		if (amt <= balance ) {
			balance -= amt;
		}
		else {
			System.err.println("Less balance. Unable to withdraw cash");
		}
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
