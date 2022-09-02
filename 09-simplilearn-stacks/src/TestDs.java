
public class TestDs {

	 static long val;
	 static char val1 ='a';
	 static char val2 = val1;
	public static void main(String[] args) {
	
		Stack s = new Stack(3);
		
		s.push(1);
		s.push(2);
		s.push(3);
	  
		System.out.println("Pop : " + s.pop());
		s.push(4);
		
	    System.out.println(val2);
		
	    Queue q = new Queue(2);
	    
	    q.enQueue(1);
	    q.enQueue(2);
	    
	    System.out.println("deQueue : " + q.deQueue() );
	   
	    q.peek();
	    
	}

}
