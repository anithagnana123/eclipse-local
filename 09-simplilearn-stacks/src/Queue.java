
public class Queue {

	int[] arr;
	int topOfQueue;
	int beginningOfQueue;
	
	public Queue(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("the queue is successfully created with size of" +size);
	}
	
	public boolean isFull() {
		if (topOfQueue == arr.length -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if ((beginningOfQueue == -1 ) || (beginningOfQueue == arr.length)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void enQueue(int value) // insert into the queue
	{
		if(isFull()) {
			System.out.println("the queue is full");
		} else if (isEmpty()) {
			beginningOfQueue = 0;
			topOfQueue ++;
			arr[topOfQueue] = value;
			System.out.println("successfully inserted "+ value +"in the queue");
		} else {
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("successfully inserted "+ value +"in the queue");
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("the queue is empty");
			return -1;
		} else {
			int result  = arr[beginningOfQueue];
			beginningOfQueue ++;
			if( beginningOfQueue > topOfQueue) {
				beginningOfQueue = topOfQueue = -1;
			}
			return result;
			}
			
		}
	 public int peek() {
		 if(!isEmpty()) {
			 int result = arr[beginningOfQueue];
			 return result;
		 } else {
			 System.out.println("the Queue is empty");
			 return -1; 
		 }
		
	 }
	
	
	}
	

