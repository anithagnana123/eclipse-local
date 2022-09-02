package datastructure;

public class Queue {

	// FIFO - First in First Out
	
	int[] arr;
	int topOfQueue;
	int beginningOfQueue;
	
	public Queue(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("Queue is created with a size of "+ arr.length);
	}
	
	public boolean isFull() {
		if ( topOfQueue == arr.length -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(beginningOfQueue == -1 || beginningOfQueue == arr.length ) {
			return true;
		} else {
			return false;
		}
	}
	
	// insert an element to Queue
	public void enQueue(int value) {
		if ( isFull()) {
			System.out.println("Queue is full");
		} else if(isEmpty()) {
		   beginningOfQueue = 0;
		   topOfQueue++;
		   arr[topOfQueue] = value;
		   System.out.println("the value is inserted in queue successfully");
		} else {
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("the value is inserted in queue successfully");
		}		
	}
	
	//return the FIFO element
	//Once all elements are deQueued(deleted), then we will be able to add a new element
	
	public int deQueue() {
		if ( isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
			
		} else {
		    int result = arr[beginningOfQueue];
		    beginningOfQueue++;
		    // check if Queue is empty
		    if(beginningOfQueue > topOfQueue) {
		    	beginningOfQueue = topOfQueue =-1;
		    }
			return result;
		}
		}
		
	 // check if Queue is empty
	 // if not empty, return the beginningOfQueue element
	 public int peek() {
		 if (!isEmpty()) {
			 return arr[beginningOfQueue];
		 }else {
			 System.out.println("Queue is empty");
			 return -1;
		 }
		 
	 
		
	}
}
