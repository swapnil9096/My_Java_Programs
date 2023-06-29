package Daily_Programs;

import java.util.Map;
import java.util.TreeMap;

public class Find_Occurances {
public static void main(String[] args) {
	
	
	String str = "India is my country and i live in India";
	
	Map< Character,Integer> map = new TreeMap<>();
	
	
	for(int i = 0 ; i < str.length() ; i++)
	{
		if(map.get(str.charAt(i))==null)
		{
			map.put(str.charAt(	i), 1);
		}else
		{
		int	cnt = map.get(str.charAt(i));
			cnt++;
			map.put(str.charAt(i), cnt);
	}
	}
	System.out. println(map);
	
}
}
