
public class SinglyLinkedList {

	public Node head;
	public Node tail;
	public int size;
	
	public void delete() {
		head = null;
		tail = null;
		System.out.println("SLL deleted successfully");
	}
	
	public void deleteNode(int location) {
        if ( head == null ) {
            System.out.println("the SLL does not exist");
            return ;
        }else if ( location == 0 ) {
            head = head.next;
            size --;
            if ( size == 0) {
                tail = null;
            }
        }else if ( location >= size) {
            Node tempNode = head;
            
            for ( int i = 0 ; i < size -1 ; i++) {
                tempNode = tempNode.next;
            }
            if ( tempNode == head ) {
                tail = head = null;
                size --;
                return ;
            }
            tempNode.next =null;
            tail = tempNode;
            size --;
        }else {
            Node tempNode = head;
            for ( int i = 0 ; i < location-1 ; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    
	
	public boolean search(int value) {
		if (head != null) {
			Node tempNode = head;
			
			for(int i = 0;  i < size ; i++) {
				if(tempNode.value == value) {
					System.out.println("Found the node at location: " + i + "\n");
					return true;
				}
				tempNode  = tempNode.next;
			}
		}
		System.out.println("Node not found!");
		return false;
	}
    public void insert(int value, int location) {
    	Node node = new Node();
    	node.value = value;
    	
    	if(head == null) {
    		create(value);
    		return;
    	}else if ( location == 0) {
    		node.next = head;
    		head = node;
    	}else if (location >= size) {
    		node.next = null;
    		tail.next = node;
    		tail  = node;
    		
    	}else {
    		Node tempNode = head;
    		int index = 0;
    		while( index < location - 1) {
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
		if ( head == null ) {
			System.out.println("SLL does not exist");
		}else {
			Node tempNode = head;
			for( int i = 0; i< size; i++ ) {
				System.out.print(tempNode.value);
				if (i != size - 1 ) {
					System.out.print("->");
		        }
				tempNode = tempNode.next;
			}
			
		}
	System.out.println();
	}
	
	public Node create(int value) {
		head = new Node();
		tail = new Node();
		
	//	create a new node
		Node node = new Node();
		node.value = value;
		node.next = null;
		
		head = node;
		tail = node;
		size = 1;
		return head;
	}
}
