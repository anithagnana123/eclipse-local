import java.util.Arrays;
import java.util.Collections;

public class DriverSearch {

	public static void main(String[] args) {
		
		int[] arr = {5,6,7,8,9,1,2,3,4};
		
//		Searching.linear(arr, 5);

		//Sort an array
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr)); 
		
		Searching.binary(arr,3);
		
	
	}

}
