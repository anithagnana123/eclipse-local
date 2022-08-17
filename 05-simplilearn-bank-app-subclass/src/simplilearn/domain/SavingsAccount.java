package simplilearn.domain;


//Savings Account is a subclass of Account(Super class)
public class SavingsAccount extends Account{

	// instance variable 
    private double interestRate;
	
	// Subclass does not inherit constructor from super class
	public SavingsAccount(double initialbalance, double interestRate) {
		super(initialbalance);
		
		// to resolve the name ambiguity
	    this.interestRate = interestRate;	
	}


	
}
