
public class Searching {

	
	// Linear search
	public static int linear(int[] givenArray,int searchValue) {
		
		for(int i = 0 ; i < givenArray.length ; i++) {
			if ( givenArray[i] == searchValue ) {
				System.out.println("The element was found at the index " + i);
				return i;
			}
		}
		System.out.println("The element was not found");
		return -1;	
	}
	

	//Binary search
	//Array should be sorted for binary search
	public static int binary(int[] givenArray, int searchValue){
	    
		int startIndex = 0;
		int endIndex = givenArray.length - 1;
		int middleIndex = ( startIndex + endIndex ) / 2;
		
		while ((givenArray[middleIndex] != searchValue) && (startIndex <= endIndex)) {
			if(searchValue < givenArray[middleIndex]) {
				endIndex = middleIndex - 1;
			} else {
				startIndex = middleIndex + 1;
			}
			
			middleIndex = ( startIndex + endIndex ) / 2;
		}
		
		if (givenArray[middleIndex] == searchValue) {
			System.out.println("The element is found at the index " + middleIndex);	
			return middleIndex;
		}
		
		System.out.println("The element " + searchValue + " is not found");
		return -1;
		
		
		
    }
	
	
}