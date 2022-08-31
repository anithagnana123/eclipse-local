package dsarray;

public class TwoDimensionalArray {

	int[] [] twoDim = null;
	
	public TwoDimensionalArray(int row, int col) {
		//create an array
		this.twoDim = new int[row] [col];
		
		//intialize the array
		for(int i = 0; i < twoDim.length ; i++) {
			for (int j = 0; j < twoDim[i].length ; j++) {
				twoDim [i] [j] = Integer.MIN_VALUE; 
			}
		}
	}
		
		public void traverse() {
			for(int i = 0; i < twoDim.length ; i++) {
				for (int j = 0; j < twoDim[i].length ; j++) {
					System.out.println(twoDim[i][j]);
				}
				System.out.println();
			}
		}
		
		public void insert(int row, int col, int val) {
			try {
				if ( twoDim[row][col] == Integer.MIN_VALUE) {
				   twoDim[row][col] = val;
				   System.out.println("successfully inserted");
				} else {
					System.out.println("this call is already occupied");
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid index to access twoDim array");
			}
		}
	
		public void accesscell(int row, int col) {
			System.out.println("\nAccessing row:  "+ row + "col#"+col);
			try {
				System.out.println("cell value is" + twoDim[row] [col]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid index for 2D array");
			}
		}
		
		public void delete(int row,int col) {
			try {
				twoDim [row][col] = Integer.MIN_VALUE;
				System.out.println("the value has been successfully deleted");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("the value that is provided is not in range of array");
			}
		}
	
	   public void search(int value) {
		   for(int i = 0; i < twoDim.length; i++) {
			   for(int j = 0; j < twoDim[i].length; j++) {
				   if(twoDim[i][j] == value) {
					   System.out.println("the value is found at row :"+i + "col : "+j);
					   return;
				   }
			   }
		   }
			   System.out.println("Value is not found");
		   
		   
	   }
}
