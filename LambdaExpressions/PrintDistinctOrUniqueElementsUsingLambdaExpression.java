package LambdaExpressions;

import java.util.List;

public class PrintDistinctOrUniqueElementsUsingLambdaExpression {

	public static void main(String[] args) {
		List<Integer> list = List.of(12,2,63,63,12,86,12,28,1,1);
		list.stream().distinct().forEach(e->System.out.println(e+","));
		list.stream().distinct().sorted().forEach(e->System.out.println(e+","));
		list.stream().sorted().forEach(e->System.out.println(e+","));

	}

}
