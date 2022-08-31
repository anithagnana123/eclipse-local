package dsarray;

public class SingleDimensionalArray {
	//declare an array
	int[] arr;
	
	public SingleDimensionalArray(int size) {
		arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void delete(int index) {
		try {
			arr[index] = Integer.MIN_VALUE;
			System.out.println("the value has been deleted successfully");
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("the value that is provided is not in the range of the array");
		}
	}
	public void search ( int value ) {
		for( int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
			System.out.println("value is found at index : " + i);
			return;
			}
		}
	}
	
	public void traverse() {
		try {
			for(int i =0; i <arr.length; i++)
			{
				System.out.println(arr[i] + "  ");
			}	
		}catch ( Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void insert(int location, int value) {
		
		try {
			if ( arr[location] == Integer.MIN_VALUE) {
			   arr[location] = value;
			   System.out.println("successfully inserted");
			} else {
				System.out.println("this call is already occupied");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access the array");
		}
	}
	
	
		

}
