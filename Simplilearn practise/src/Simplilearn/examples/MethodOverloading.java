package Simplilearn.examples;

public class MethodOverloading {

	public static void main(String[] args) {
		
		addValue(10,20);
		addValue(10,20,30);
		addValue("John","Smith");
		addMultipleValues(1,2,3,4,5);

	}

	private static void addValue(String str1, String str2) {
		System.out.println("Concatenation : " + str1 + str2);
	}

	private static void addValue(int i, int j, int k) {
		System.out.println("Sum :" +(i+j+k));
		
	}

	private static void addValue(int i, int j) {
		System.out.println("Sum : " +  (i+j));
		
	}
	
	private static void addMultipleValues(double... values) { // varags - pass multiple arguments
		double result = 0;
	    for(double d : values) {
	    	result += d; // result = result + d;
	    }
	    System.out.println(result);
	}

}
