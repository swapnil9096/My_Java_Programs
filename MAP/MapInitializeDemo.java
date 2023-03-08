package MAP;

import java.util.HashMap;
import java.util.Map;

public class MapInitializeDemo {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>(Map.of(10 ,"Virat",20 ,"rhoit",30,"surya"));
	 // max 10 entries are allowed with Map.of
	System.out.println(map);
}
}
