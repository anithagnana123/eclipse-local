
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		//unordered
		//no duplicates
		// keys and values can be of any type
		Map map = new HashMap();
		
		map.put("S001","Red shirt");
		map.put("S002","White shirt");
		map.put("S003","Green shirt");
		map.put("S004","Black shirt");
		map.put(new Integer(4), new Float(78));
		
		//will not add duplicates
		map.put("S003","Green shirt");
		//override the value for a key
		map.put("S004","Purple shirt");
		
		System.out.println(map);
		
		//print the keys 
		Set keys = map.keySet();
		System.out.println("Keys:");
		System.out.println(keys);
		
		//print the values
		Collection collect = map.values();
		System.out.println("Values");
		System.out.println(collect);
		
		//print the map key and values
		Set set =  map.entrySet();
		System.out.println("Map keys and values");
		System.out.println(set);
		
		
	}
	
}
