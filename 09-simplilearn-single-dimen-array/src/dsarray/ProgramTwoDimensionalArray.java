package dsarray;

public class ProgramTwoDimensionalArray {

	public static void main(String[] args) {
	 TwoDimensionalArray t = new TwoDimensionalArray(3,3);
	 
	 t.traverse();
	 t.insert(0,0,1);
	 t.insert(0,1,2);
	 t.insert(0,2,3);
	 
	 t.insert(1,0,4);
	 t.insert(1,1,5);
	 t.insert(1,2,6);
	 
	 t.insert(2,0,7);
	 t.insert(2,1,8);
	 t.insert(2,2,9);
	 t.traverse();
	 
	 t.accesscell(0,1);
	 t.delete(0, 2);
	 t.traverse();
	 
	 t.search(6);
	}

}
