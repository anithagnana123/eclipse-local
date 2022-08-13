package simplilearn.examples;

public class SwitchWithEnum {

	public static void main(String[] args) {
	
		System.out.println(Month.JANUARY);
		System.out.println(Month.APRIL);
		
		Month month = Month.MARCH;
		
		switch(month) {
		case JANUARY:
			System.out.println("It's the first month");
			break;
		case FEBRUARY:
			System.out.println("It's the second month");
			break;
		case MARCH:
			System.out.println("It's the third month");
			break;
			
		}

	}

}
