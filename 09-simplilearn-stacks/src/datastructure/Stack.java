package datastructure;

public class Stack {

	// FILO - first in last out algorithm
	
	int[] arr;
	int topstack;
	
	public Stack(int size) {
		this.arr = new int[size];
		this.topstack = -1; //stack is empty
		System.out.println("Stack is created with a size of "+size);
	}
	
	public boolean isEmpty() {
		if(topstack == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(topstack == arr.length - 1 ) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int value) {
	     if (isFull()) {
	    	 System.out.println("Stack is full");	    
	      } else {
	    	 arr[topstack + 1] = value;
	    	 topstack++;
	    	 System.out.println("the value is inserted successfully");
	     }
	}
	public int pop () {
		// return the last added element from stack
		if ( isEmpty() ) {
			System.out.println(" Stack is empty");
			return -1; 
		}else {
			int topOfstack = arr[topstack];
			topstack--;
			return topOfstack;
			
		}
		
	}
	     

	
}