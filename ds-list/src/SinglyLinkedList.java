
public class SinglyLinkedList {

	public Node head;
	public Node tail;
	public int size;
	
	public void delete() {
		head = null;
		tail = null;
		System.out.println("SLL deleted successfully");
	}
	
	public void delete(int location) {
		if ( head == null) {
			System.out.println("SLL does not exist");
		} else if (location == 0) {    // delete the first node
			head = head.next;
			size-- ;
			return;
		  }
		  else if(location == size - 1) { // delete the last node
			 Node tempNode = head;
			 for (int i = 0 ; i < size - 1 ; i++ ) {
			 tempNode = tempNode.next;        // stops near one before the last node
		     }
		     tempNode.next = null;
			 tail = tempNode;
			 size--;			
		   } else if (location >= size ){     // invalid location
			   System.out.println("Invalid location");
			   System.out.println("size : "+size);
			   System.out.println("location : "+location);
		   }
			else {
			   Node tempNode = head;    // delete the node in between
			   for (int i = 0; i < location - 1; i++) {
			        tempNode = tempNode.next;  //stops near one before the location
			    }
			   tempNode.next = tempNode.next.next;
			   size--;
		}
	}
	
	public boolean search( int value ) {
		if (head != null) {
			Node tempNode = head;
			for ( int i = 0; i< size ; i++)
			{
				if (tempNode.value == value) {
					System.out.println("Found the node at location " + i + "\n");
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		
		System.out.println("Node not found");
		return false;	
	}
	
	public void insert(int value, int location) {
		Node node = new Node();
		node.value = value;
		
		// if SLL does not exist create it
		if (head == null) {
			create(value);
			return;			
		} else if ( location == 0) {    // Add a node at the starting position
			node.next = head;
			head = node;
		} else if ( location >= size ) {  // Add a node at the End position
		    node.next = null;
		    tail.next = node;   // points to the new node
		    tail = node;        // moving the tail
		} else {   // Add a node in between 
			Node tempNode = head;
			int index  = 0;
			while ( index < location - 1 ) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
			
		}
		size++;
	}
	public void traverse() {
		if( head == null ) {
			System.out.println("SLL does not exist");
		} else {
			Node tempNode = head;
			for(int i = 0; i < size ; i++) {
				System.out.print(tempNode.value);
				if ( i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		}
			 	System.out.println("\n");
	}
	
	public Node create(int value) {
		// initially set head and tail to hold a new dummy node
    	head = new Node();
		tail = new Node();
		
		//create a new node
		Node node = new Node();
		node.value = value;
		node.next = null;
	
		// head and tail are pointing to the node
		head = node;
		tail = node;
		size = 1;
		
		return head;
	}
}
