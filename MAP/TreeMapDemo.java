package MAP;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
// it preserve Ascending order based on key
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		map.put(2,"virat");
		map.put(9,"Surya");
		map.put(4,"Rohit");
		map.put(8,"bangad");
		System.out.println(map);
		
		
	}

}
