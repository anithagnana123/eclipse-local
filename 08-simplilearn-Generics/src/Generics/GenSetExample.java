package Generics;

import java.util.HashSet;
import java.util.Set;

public class GenSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("third");
		set.add("third");
	//	set.add(new Integer(9)); compile error 
		System.out.println(set);
	}

}
