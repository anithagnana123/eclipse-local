import java.util.Arrays;

public class QuickSort {

	public static void sort(int[] givenArray,int startIndex, int endIndex) {
		
		if (startIndex < endIndex) {
			int pivot = partition(givenArray, startIndex, endIndex);
			sort(givenArray, startIndex, pivot - 1 );
			sort(givenArray, pivot + 1, endIndex);
			
		}
	 
				
		
	}
	
	private static int partition(int[] givenArray, int startIndex, int endIndex) {
		int pivot = endIndex;
		int i = startIndex - 1;
		
		// put all small numbers to the left of the pivot
		// put all large numbers to the right of the pivot
		for (int j= startIndex ; j <= endIndex; j++) {
			if(givenArray[j] <= givenArray[pivot] ) {
				i++;
				int temp = givenArray[i];
				givenArray[i] = givenArray[j];
				givenArray[j] = temp;
			}
		}
		return i;
	}

	public static void main(String[] args) {
    
		int[] givenArray = { 9,6,7,8,3,2,4,5,1};
		
		System.out.println("Before sort : " +Arrays.toString(givenArray));
		
		sort(givenArray,0,givenArray.length-1);
		
		System.out.println("After sort : " +Arrays.toString(givenArray));
		

	}

}
