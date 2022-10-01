package bankApp2;

public class Customer {

// declare three private variables FirstName, LastName and Account
   private String firstName, lastName;
   private Account account;//customer 'has-a' account
	
// declare a public constructor that takes two paramaters firstName, lastName
	public Customer (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
// getter and setter methods for the instance variables	
	public String getFirstName() {
		return firstName;
	}
		
	public String getLastName() {
		return lastName;
	}
	

	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
		// can I have a return statement in the method ?
		// yes
		// return;  The control goes back to main method.There will always be implicit return statement
		// return 0 or any variable will give error
	}
	
}
