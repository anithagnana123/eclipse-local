package Thread;

public class MyThread extends Thread {
	
	private int i;

	public MyThread() {
		
		i = 0;
		
		while (true) {
			System.out.println("Hello : " + i++);
			if ( i == 10) {
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		
		Thread t = new MyThread();
		t.start();

	}

}
