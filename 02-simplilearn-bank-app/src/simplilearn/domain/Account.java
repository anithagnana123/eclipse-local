package simplilearn.domain;

public class Account {

	private double balance;
	
	//Constructor
	public Account(double initialbalance){
		
		if ( initialbalance > 10) {
		balance = initialbalance;
		}
		else {
			System.err.println("Account balance should be greater than 10");
		}
	}
	
	//Getter method
    public double getbalance(){
		return balance;
	}
    
    public void deposit(double amt) { 	
    	balance = balance + amt;    	
    }
    
    public void withdraw(double amt){
    	if (balance >= amt) {
    		balance = balance-amt;	
    	}
    	
    }
}

