package MAP;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
//it preserve insertion order
	public static void main(String[] args) {
		Map<Integer,String> map= new LinkedHashMap<>();
		map.put(3,"mithlesh");
		map.put(7,"bangad");
		map.put(4,"Swapnil");
		map.put(6,"Virat");
		map.put(9,"mahesh");
		
		
		System.out.println(map);
	}

}
