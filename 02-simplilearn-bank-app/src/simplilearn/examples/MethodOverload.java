package simplilearn.examples;

public class MethodOverload {

	 static int Sum = 0;
	 static String concat;
	public static void main(String[] args) {

		
	 addValue(10,20);
     addValue(10,20,30);
     addValue("10","20");
     
	}

	private static void addValue(String s1, String s2) {
	   concat = s1+s2;
	   System.out.println("concatenated String is " + concat);
		
	}

	private static void addValue(int i, int j, int k) {
		Sum = i+j+k;
		System.out.println("Sum is "+ Sum);
	}

	private static void addValue(int i, int j) {
		Sum = i+j;
		System.out.println("Sum is "+ Sum);
	}

}
