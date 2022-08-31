package Thread;

public class ThreadTester {
	
	//main method - parent thread
	
	public static void main(String[] args) {
		HelloRunner target = new HelloRunner();
	
	// create an object of Thread class from java.lang package
		Thread t = new Thread(target);
		// t.run(); - bad practice
		t.start();
	}

}
