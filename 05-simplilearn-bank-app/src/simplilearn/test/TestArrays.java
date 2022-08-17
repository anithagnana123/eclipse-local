package simplilearn.test;

public class TestArrays {

	public static void main(String[] args) {
		
		//Declare an array
		int[] array1 = {2,3,5,7,11,13,17,19};
		int[] array2;
		array2 = array1;
		
		//print the array1
		System.out.print("array1 : ");
	    printArray(array1);
	    System.out.println();
	    
	    //Modify array2
	    array2[0] = 0;
	    array2[2] = 2;
	    array2[4] = 4;
	    array2[6] = 6;
	    
	  //print the array1
	  	System.out.print("array1 : ");
	  	printArray(array1);
	    System.out.println();
		
	}

	private static void printArray(int[] array1) {
		for(int index = 0 ; index < array1.length ; index++)
		{
		  System.out.print(array1[index] + " ");
		}
		
	}
}
