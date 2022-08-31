import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		
		// unordered
		// no duplicates
		Set set = new HashSet();
		
		set.add("one");
		set.add("two");
		set.add(new Integer(90));
		set.add(new Float(10.09));
		
		// trying to add duplicates
		set.add("two");
		set.add(new Integer(90));
		
		System.out.println(set);
	}
	
}
