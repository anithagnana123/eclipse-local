
public class TestSLL {

	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		
		
		s.create(7);
		s.traverse();
		s.insert(8, 1);
		s.insert(6, 0);
		s.insert(5, 0);
		s.traverse();

		s.search(5);
		
		s.deleteNode(4);
		s.traverse();
		s.delete();
	}

}
