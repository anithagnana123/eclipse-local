import java.util.Arrays;

public class SelectionSort {

	public static void sort(int[] givenArray) {
		
		for(int startIndex = 0; startIndex < givenArray.length; startIndex++ ) {
			int minimumIndex = startIndex;
			for ( int nextIndex = startIndex + 1; nextIndex < givenArray.length ; nextIndex++ ) {
	        if ( givenArray[nextIndex] < givenArray[minimumIndex] ) {
	        	minimumIndex = nextIndex;
	        }
			}
			
			//Swap the startIndex element with the last matched smallest element
			if(minimumIndex != startIndex) {
			   int temp = givenArray[startIndex];
			   givenArray[startIndex] = givenArray[minimumIndex];
			   givenArray[minimumIndex] = temp;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] givenArray = {9,8,7,1,2,4,5,6,7,3};
		
		System.out.println("Before sort : " + Arrays.toString(givenArray));
		
		sort(givenArray);
		
		System.out.println("After sort : "+ Arrays.toString(givenArray));
	}
	
}
