package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllEvenNosUsingLambdaExpresssion {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(2, 4, 4, 5, 7, 9, 33, 24, 56, 75, 43, 78));
		int a= list.stream().filter(j-> j%2==0).reduce(0,(n1,n2)->n1+n2);
		System.out.println(a+",");

		// other apporoach
		int b = list.stream().filter(j -> j % 2 == 0).reduce(10, (n1, n2) -> {
			System.out.println("n1: " + n1 + "  n2" + n2);
			return n1 + n2;//in block return is mandatory
		});
		System.out.println(a + ",");

	}
}
