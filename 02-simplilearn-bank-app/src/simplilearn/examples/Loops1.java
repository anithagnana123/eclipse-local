package simplilearn.examples;

public class Loops1 {

	static private String[] months = {"January", "February", "March", "April", "May", "June","July", "August", 
			                          "September", "October", "November","December"};
	
	public static void main(String[] args) {
		 
		
/*		// Traditional for loop
		for(int i =0 ; i < months.length ; i++)
		{
			System.out.println(months[i]);
		}
			
		// for each loop
		for ( String month : months) {
			System.out.println(month);
			}
*/			
		
		int[] numbers = {1,2,3,4,5,6};
		//while loop
			int index = 0;
			while(index<numbers.length)
			{
				System.out.println(numbers[index]);
				index++;
			}
			
			index = 0;
		do {
			System.out.println(months[index]);
			index++;			
		} while(index>months.length);
		
		
	}
	
}
