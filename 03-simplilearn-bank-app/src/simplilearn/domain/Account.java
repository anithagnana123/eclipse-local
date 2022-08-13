package simplilearn.domain;

public class Account {

	protected double balance;
	
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
    
    public boolean deposit(double amt) { 	
    	balance = balance + amt;
    	return true;
    }
    
    public boolean withdraw(double amt){
    	boolean result = false; //assume operation failure
    	if (balance >= amt) {
    		balance = balance-amt;
    		result  = true; // operation succeeded
    	}
    	return result;
      }
}

