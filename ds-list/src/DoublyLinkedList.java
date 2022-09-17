
public class DoublyLinkedList {
    
	public DoublyNode head;
	public DoublyNode tail;
	int size;
	
	public void delete() {
		DoublyNode tempNode = head;
		for ( int i = 0; i < size; i++) {
			tempNode.previous = null;
			tempNode = tempNode.next;
			size--;
		}
		head = null;
		tail = null;
		System.out.println("DLL has been deleted successfully");
	}
	
	public void delete(int location) {
		if ( head == null ) {
			System.out.println("DLL does not exist");
		}else if (location == 0) {
			if (size == 1) {
				head = null;
			    tail = null;
			    size--;
			    return;
			}else {
				head = head.next;
				head.previous = null;
				size--;
			}
			
		}else if ( location <= size) {
			DoublyNode tempNode = tail;
			if ( size == 1 ) {
				head = null;
				tail = null;
			}else {
				tail = tail.previous;
				tail.next = null;
				size--;
			}
		}else {
			DoublyNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			tempNode.next.previous = tempNode;
			size--;
		}
	}
	
	public boolean search(int value) {
		if ( head != null ) {
			DoublyNode tempNode = head;
			for ( int i = 0; i < size; i++) {
				
				if (tempNode.value == value) {
					System.out.println("Found the node at location "+ i );
					return true;
				}
				tempNode = tempNode.next;
			}
		} 
			System.out.println("node not found");
			return false;
		
	}

	
	public void insert(int value, int location) {
		DoublyNode node = new DoublyNode();
		node.value = value;
		
		if(head == null) {
			create(value);
			return;
		} else if(location == 0) {
			node.next = head;
			node.previous = null;
			head.previous = node;
			head = node;
		} else if ( location >= size) {
			node.next = null;
			node.previous = tail;
			tail.next = node;
			tail = node;
		} else {		
			DoublyNode tempNode = head;
			int index = 0;
			while(index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			
			node.previous = tempNode;
			node.next = tempNode.next;
			tempNode.next = node;
			node.next.previous = node;
			
		}
		
		size++;
	}
	
	public void reverse() {
		if (head != null) {
			DoublyNode tempNode = tail;
			for(int i = 0; i < size ; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print(" <- ");
				}
				tempNode = tempNode.previous;
			}
		}else {
			System.out.println("DLL does not exist");
		}
		System.out.println("\n");
	}
	
	public void traverse() {
		if ( head != null ) {
			DoublyNode tempNode  = head;
			for ( int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if ( i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}	
		} else {
				System.out.println("DLL does not exist");
		    	}
	            System.out.println("\n");
	}
	
	public DoublyNode create(int value) {
		// initially set head and tail to hold a new dummy node
		head = new DoublyNode();
		
		//create a new node
		DoublyNode node = new DoublyNode();
		node.value = value;
		node.next = null;
		node.previous = null;
		
		// head and tail are pointing to the node
		head = node;
		tail = node;
		size = 1;
				
	    return head;
	}
	
	
}
