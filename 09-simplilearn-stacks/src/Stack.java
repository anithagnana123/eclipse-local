
public class Stack {

	int[] arr;
	int topstack;
	
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("the stack is empty");
			return -1;
		}else {
			int topOfStack = arr [topstack];
			topstack--;
			return topOfStack;
		}
	}
	
	public void push(int value) {
	
		if (isFull()) {
			System.out.println("the stack is full");
		} else {
			arr[topstack + 1] = value;
			topstack++;
			System.out.println("the value is successfully inserted");
		}
	}
	
	private boolean isFull() {
		if(topstack == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public Stack(int size) {
		this.arr  =  new int[size];
		this.topstack = -1;//stack is empty
		System.out.println("the stack is created with size of: "+size);
	}
	
	public boolean isEmpty() {
		if(topstack == arr.length -1) {
			return true;
		} else {
			return false;
		}
	}
}
