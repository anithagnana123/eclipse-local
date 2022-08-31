package Thread;

public class SyncTest {

	public static void main(String[] args) {
		
		Stack theStack = new Stack();
		
		Producer producer = new Producer(theStack);
		Thread prdt = new Thread(producer);
		prdt.start();
		
		Consumer consumer = new Consumer(theStack);
		Thread Cont = new Thread(consumer);
		Cont.start();
		

	}

}
