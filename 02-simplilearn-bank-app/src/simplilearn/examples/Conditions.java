package simplilearn.examples;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month=2;
		
		if(month>=1 && month<=3)
		{
			System.out.println("You are in Quarter1");
		}
		else if(month>=4 && month<=6)
		{
			System.out.println("You are in Quarter2");
		}
		else {
			System.out.println("You are not in first half of the year");
		}
		
		
	}

}
