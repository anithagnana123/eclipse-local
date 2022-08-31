package Thread;

public class HelloRunner implements Runnable {

	public static void main(String[] args) {
		
	}

	private int i;

	@Override
	// run method => child thread
	public void run() {
		i = 0;
		while(true) {
			System.out.println("Hello : " + i++);
			if ( i == 10) {
				break;
			}
		}
		
	}

}
