package datastructure;

public class TestStack {

	public static void main(String[] args) {
		Stack theStack = new Stack(3);
		
		System.out.println("Empty : "+ theStack.isEmpty());
		
		theStack.push(1);
		theStack.push(2);
		theStack.push(4);
	
		theStack.push(5);
		
		System.out.println("Popped : "+ theStack.pop());
		
		System.out.println("Popped : "+ theStack.pop());
		
	}

}
