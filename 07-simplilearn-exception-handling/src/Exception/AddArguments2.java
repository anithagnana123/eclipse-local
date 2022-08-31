package Exception;

public class AddArguments2 {

	public static void main(String[] args) {
	  int sum = 0;
	  
	  for (String arg : args) {
		  try {
			  sum += Integer.parseInt(arg);
		  }
		  catch(NumberFormatException nfe){
			  System.out.println("["+arg+"] is not an integer and will not included in the sum");
		  }
	  }
	  
	  System.out.println("Sum =" + sum);
		
	}

}
