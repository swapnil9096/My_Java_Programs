package CollectionSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OccurrenceOfStringDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		String s1 = "India is my country , India has the largest population and India is a great country";
		String[] tokenArray = s1.split(" ");
		for (String x : tokenArray) {
			if (map.get(x) == null) {
				map.put(x, 1);
			} else {
				int cnt = map.get(x);
				cnt++;
				map.put(x, cnt);
			}
		}
		System.out.println(map);

		System.out.println("==".repeat(40));

		Set<String> ks = map.keySet();
		Iterator<String> i1 = ks.iterator();

		while (i1.hasNext()) {
			String k = i1.next();

			Integer v = map.get(k);
			if (v == 1) {
				System.out.println(k + "=" + v);
			}

		}

		System.out.println("==".repeat(50));

		for (Map.Entry<String, Integer> kv : map.entrySet()) {
			if (kv.getValue() == 1)
				System.out.println(kv.getKey() + "==" + kv.getValue());

		}

	}

}
