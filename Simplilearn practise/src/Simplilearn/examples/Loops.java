package Simplilearn.examples;

public class Loops {
	
	//declare an array of strings
	static private String[] months = { "January","February","March","April","May","June",
			            "July", "August","September", "October", "November", "December"};

	public static void main(String[] args) {
   /* 	  for(int i=0; i<months.length; i++)
	        {
		      System.out.println(months[i]);
	        }
          System.out.println(months.length);
	*/	
		// for each loop
		for (String month : months) {
			System.out.println(month);
		}
    
		int[] numbers = {1,2,3,4,5,6,7};
		int index = 0;
//		while(index < numbers.length) {
//			System.out.println(numbers[index]);
//			index++;
//		}
		
		do {
			System.out.println(numbers[index]);
			index++;
		}while(index < numbers.length);
	}
}
