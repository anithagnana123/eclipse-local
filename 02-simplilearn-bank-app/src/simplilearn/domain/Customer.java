package simplilearn.domain;

public class Customer {
	
	private String firstName,lastName;
	private Account account;// customer has an account
	
	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account acct) {
		account = acct;
	}

}
