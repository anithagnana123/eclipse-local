
public class TestDLL {

	public static void main(String[] args) {
		DoublyLinkedList Dll = new DoublyLinkedList();
		
		Dll.create(3);
		Dll.traverse();
		
	    Dll.insert(2, 1);
	    Dll.traverse();
	    Dll.insert(1, 1);
	    Dll.insert(5, 0);
	    Dll.traverse();
	    Dll.reverse();
	    
	    Dll.search(2);
	    Dll.delete(3);
	    Dll.traverse();

	    Dll.delete();
	    Dll.traverse();
	}

}
