package datastructure;

public class TestQueue {

	public static void main(String[] args) {
		Queue theQueue = new Queue(3);
		
		theQueue.enQueue(1);
		theQueue.enQueue(2);
		theQueue.enQueue(3);
		
		
		System.out.println("DeQueue : " +theQueue.deQueue() );
		System.out.println("DeQueue : " +theQueue.deQueue() );
		System.out.println("DeQueue : " +theQueue.deQueue() );
		theQueue.enQueue(4);
	
		System.out.println("Peek : " + theQueue.peek() );
	}

}
