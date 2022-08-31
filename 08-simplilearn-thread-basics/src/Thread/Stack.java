package Thread;

import java.util.ArrayList;
import java.util.List;


// Sir's own stack creation
public class Stack {

	private List<Character> buffer = new ArrayList();
	
	public synchronized char pop() {
		char c;
		
		//thread to wait until the stack has an item
		//synchronized keyword is used to access it by one thread at a time
		while(buffer.size() == 0) {
			try {
				this.wait();// place a thread in a wait pool
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		c = buffer.remove(buffer.size() - 1);
		
		return c;
	}
	
	public synchronized void push(char c) {
		this.notify();// brings thread from wait pool to lock pool
		buffer.add(c);
	}
	
}
