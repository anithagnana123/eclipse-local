package Generics;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GenMapExample {

	public static void main(String[] args) {
		Map<String,String> map = new TreeMap <>();
		map.put("one", "Blue shirt");
		map.put("two", "white shirt");
		map.put("third","purple shirt");
		
		map.put("two","black shirt");
		Set<String> keys = map.keySet();
		System.out.println("Map");
		for(String key: keys) {
			System.out.println("key " + key);
			System.out.println("Value " + map.get(key));
		}
		
		
	}
}
