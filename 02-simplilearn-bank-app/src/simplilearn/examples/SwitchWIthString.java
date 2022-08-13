package simplilearn.examples;

public class SwitchWIthString {

	public static void main(String[] args) {
		String value = "February";
	
		switch(value) {
		case "January":
		     System.out.println("Value is 1");
		     break;
		case "February":
		     System.out.println("Value is 2");
		     break;
		case "March":
			 System.out.println("Value is 3");
			 break;
		default:
			 System.out.println("Value is something else");
			 break;
		}
				
				
				
	}

}
