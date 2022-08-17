package simplilearn.domain;

//subclass of Account super class
public class CheckingAccount extends Account {

	//additional property
	private double overdraftAmt;

	//constructor 1
	public CheckingAccount(double initialbalance, double overdraftAmt) {
		super(initialbalance);
		this.overdraftAmt = overdraftAmt;
	}
	
	
	/* in a class if there is more than one constructor then it
	 * is constructor overloading
	 */
	
	//constructor 2
	public CheckingAccount(double initialbalance) {
		this(initialbalance,0.0); // invoke a constructor in the same class
	}
	
	//overriding withdraw method
	public boolean withdraw (double amt) {
		boolean result = true;
		if(balance < amt) 
		{
		  double overdraftNeeded = amt - balance;
		  if(overdraftAmt < overdraftNeeded)
		  {
			  result = false;
			
		  } 
		  else {
			  balance = 0.0;
			  overdraftAmt -=overdraftNeeded;
		   }
		}
		else {
			  balance -= amt;
		  }
		
		return result;
	
	}
		
	}
	
	

