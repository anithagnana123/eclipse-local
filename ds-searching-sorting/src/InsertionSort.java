import java.util.Arrays;

public class InsertionSort {
	
	public static void sort(int [] givenArray) {
		
		// progress through the index one by one
		for(int i = 1; i < givenArray.length; i++) {
		  int temp = givenArray[i], j = i;
		  
		  // move the smallest number to the left
		  while(j > 0 && givenArray[j-1] > temp) {
			  givenArray[j] = givenArray[j-1];
			  j--;
			  
		  }
		  
		  givenArray[j] = temp;
		}
	}

	public static void main(String[] args) {
		
		String[] arr = {"A" , "e" , "d", "B", "c"};
		
		Arrays.sort(arr);
		System.out.println("Sort String array : " + Arrays.toString(arr) );
		
		int[] givenArray = { 9,6,5,4,3,8,7,1,2};
		
		sort(givenArray);
		
		System.out.println("After sort : "+ Arrays.toString(givenArray));
		
	}

}
