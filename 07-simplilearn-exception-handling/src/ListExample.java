
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		
		// ordered( same as order of insertion )
		// has duplicates
		List list = new ArrayList();
		
		list.add("one");
		list.add("two");
		list.add("third");
		list.add(new Integer(4));
		list.add(new Float(8.7));
		
		//trying to add duplicates
		list.add("third");
		list.add(new Integer(4));
		
		System.out.println(list);
		
		
	}
}
