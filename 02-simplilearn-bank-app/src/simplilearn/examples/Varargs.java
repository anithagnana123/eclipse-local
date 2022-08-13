package simplilearn.examples;

public class Varargs {

	public static void main(String[] args) {
		addMultipleValues(10,20,30);	
		addMultipleValues(10,78,90,10,10);
	}

	private static void addMultipleValues(int... i) {
		int result = 0;
		for(int val : i ) {
			result += val;
		}
		System.out.println("Result is " + result);
		
	}

}
