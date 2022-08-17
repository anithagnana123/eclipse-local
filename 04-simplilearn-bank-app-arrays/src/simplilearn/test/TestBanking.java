package simplilearn.test;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import simplilearn.domain.Bank;
import simplilearn.domain.Customer;

public class TestBanking {

	public static void main(String[] args) {
		
		// create a Bank object
		Bank myBank = new Bank();
		
		myBank.addCustomer("Will", "Smith");
		myBank.addCustomer("Chris", "Pratt");
		myBank.addCustomer("Tom", "Cruise");
	    // accept user input
		String f1 = getInput("Enter the customer firstName: ");
		String l1 = getInput("Enter the customer lastName: ");
		myBank.addCustomer(f1, l1);
		
		
		System.out.println(myBank.getNoCustomers());
		
		for(int index =0 ; index < myBank.getNoCustomers(); index++) {
			Customer theCustomer = myBank.getCustomer(index);
			
			System.out.println("Customer[" + (index + 1) + "] is " + theCustomer.getlastName() + ","+
			                    theCustomer.getfirstName());
		}
	}

	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		}
		catch ( Exception e ) {
			return "Error: " + e.getMessage();
		}
		
	}	

}
