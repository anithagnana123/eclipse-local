package Exception;

public class AddArguments1 {

	public static void main(String[] args) {
		try {
			int sum = 0;
			for (String arg : args) {
				sum += Integer.parseInt(arg);
			}
			System.out.println(sum);
		}
		catch(NumberFormatException nfe) {
			System.out.println("one of the command line argument is not an Integer");
		}
		finally {
			System.out.println("Finally block is executed");
		}
		

	}

}
