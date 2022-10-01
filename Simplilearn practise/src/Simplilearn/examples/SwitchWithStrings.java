package Simplilearn.examples;

public class SwitchWithStrings {

	public static void main(String[] args) {
		
		String s1 = "January";
		
		switch(s1) {
		case "January":
			System.out.println("Value is 1");
			break;
		case "February":
			System.out.println("Value is 2");
			break;
		default:
			System.out.println("Other value");
			break;
		}

	}

}
