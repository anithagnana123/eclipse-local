package simplilearn.examples;

public class SwitchWithEnums {

	public static void main(String[] args) {
		System.out.println(Month.JANUARY);
		
		Month month = Month.FEBRUARY;
		
		switch(month){
		case JANUARY:
				System.out.println("Month 1");
			    break;
		}
		
	}

}