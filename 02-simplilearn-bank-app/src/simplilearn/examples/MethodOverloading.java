package simplilearn.examples;

public class MethodOverloading {
	static int Sum=0;
	static String concat;

	public static void main(String[] args) {
		addValue(10,20);
		addValue(10,20,30);
		addValue("10","20");

		double resultofMultiple = addMultipleValues(1,2,3,4,5);
		System.out.println("The answer is" + resultofMultiple);
		
	}
	
	private static double addMultipleValues(double... values) {
		int result=0;
		for (double d: values)
		{
			result +=d;
		}
		return result;
	}

	//add 2 values
	private static void addValue(int x,int y)
	{
		Sum = x + y;
		System.out.println(Sum);
	}

	//add 3 values
	private static void addValue(int x,int y,int z)
	{
		Sum = x + y + z;
		System.out.println(Sum);
	}
	
	// concat 2 strings
	private static void addValue(String x,String y)
	{
		concat = x + y;
		System.out.println(concat);
	}
	
	
}
