package dsarray;

public class TestSingleDimensionalArray {

	public static void main(String[] args) {
	    SingleDimensionalArray s = new SingleDimensionalArray(5);
        s.insert(0, 10);
	    s.traverse();
	    s.insert(1, 20);
	    s.insert(2, 30);
	    s.insert(3, 40);
	    s.traverse();
	    s.insert(4, 50);
	    s.traverse();
	    
	   // s.insert(5,60);
	    
	    s.search(20);
	    s.search(90);
	    
	    s.delete(2);
	    s.traverse();
	    
	}

}
