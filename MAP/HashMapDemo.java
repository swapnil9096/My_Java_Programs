package MAP;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(100,"Virat");
		map.put(200,"hardik");
		map.put(300,"kolhi");
		map.put(400,"pandya");
		
		//System.out.println(map.get(200));
		//System.out.println(map.get((500)));// null
		map.put(800,"Vishakha");
		map.put(700,"Swapnil");
		map.put(null,"null");
		map.put(null,"nullll1");
		map.put(900,"nulll");
		
		System.out.println(map);
		
		
	}

}
