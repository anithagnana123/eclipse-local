package simplilearn.examples;

public class Loops {

	// declare String array
	static private String[] months= {"January","February","March","April","May","June","July",
			                          "August","September","October","November","December"};
	
	public static void main(String args[]) {

		
		// for loop
		/*
		System.out.println(months.length);
		for(int i=0;i<months.length;i++)
		{
			System.out.println(months[i]);
		}
*/		
		//for each loop
		for(String month:months) {
			System.out.println(month);
		}
		
		//while loop
		int[] number = {1,2,3,4,5,6};
		int index=0;
	/*	while(index<number.length)
		{
		   System.out.println(number[index]);
		   index++;
		}
*/		
		
		//Do-while loop
		index=0;
		do {
			System.out.println(number[index]);
			   index++;
		} while(index<number.length);
			
			
		
	}
}
