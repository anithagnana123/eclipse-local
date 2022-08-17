package simplilearn.domain;

public class Bank {

    // Association one to many
	
	// Array declaration
	private Customer[] customers;
	private int numberOfCustomers;
	
	//Constructor
	public Bank() {
		//Array creation
		customers = new Customer[10];
		numberOfCustomers = 0;
	}
	
	public void addCustomer ( String firstName, String lastName) {
		int i = numberOfCustomers++;
		//create an array for customers
		customers[i] = new Customer(firstName,lastName);
	}
	
	public int getNoCustomers() {
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	

}
