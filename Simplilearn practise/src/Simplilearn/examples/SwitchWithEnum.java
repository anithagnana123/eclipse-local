package Simplilearn.examples;

public class SwitchWithEnum {

	public static void main(String[] args) {
		
		System.out.println(Month.JANUARY);
		
		Month month = Month.FEBRUARY;
		
		switch(month){
			
			case JANUARY:
				System.out.println("its the first month");
				break;
			case FEBRUARY:
				System.out.println("it's the second month");
				break;
			default:
			    System.out.println("Not the first or second month");
			    break;
		}

	}

}
