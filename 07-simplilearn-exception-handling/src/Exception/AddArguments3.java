package Exception;

public class AddArguments3 {

	public static void main(String[] args) {
	  //before java 7
/*		try {
		
			int [] numbers = new int[10];
			
			numbers[1] = 100/0;
			numbers[11] = 20;
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
  */
    
//		after java7
		try {
         	int [] numbers = new int[10];
			
			numbers[1] = 100/0;
			numbers[11] = 20;
			
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e) {
	
			System.out.println(e.getMessage());
		}
		
	}

}
