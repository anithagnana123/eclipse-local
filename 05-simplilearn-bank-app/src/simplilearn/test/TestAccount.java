package simplilearn.test;
import simplilearn.domain.Account;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Declaration
		Account acct;
		
		//Initialization
		acct = new Account(1523);
		
	    acct.deposit(200);
	    
	    acct.withdraw(100);
		
		System.out.println(acct.getbalance());	
		
	}

}
