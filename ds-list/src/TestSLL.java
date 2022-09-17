
public class TestSLL {

	public static void main(String[] args) {
		
		SinglyLinkedList Sll = new SinglyLinkedList();
	
	//	Sll.traverse(); - gives output SLL does not exist

		Sll.create(7);
	
		Sll.traverse();

		Sll.insert(8, 1);
		Sll.insert(6, 0);
		Sll.insert(5, 0);
		Sll.insert(9, 4);
		Sll.insert(10, 2);
		
		Sll.traverse();
		
		Sll.search(7);
		
		// deleted the first node 
		Sll.delete(0);
		Sll.traverse();
		
		//deleted the last node 
		Sll.delete(4);
		Sll.traverse();
		
		//delete invalid node
		Sll.delete(5);
		Sll.traverse();
		
		//delete in between node
		Sll.delete(1);
		Sll.traverse();
		
		Sll.delete();
		Sll.traverse();
		
	}

}
