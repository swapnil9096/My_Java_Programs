package LambdaExpressions;

import java.util.List;

public class PrintLegthOfStrings {

	public static void main(String[] args) {
		List<String> list=List.of("Apple","Bat","Cat","Dog","Elephant");
		list.stream().map(e->e.length()).forEach(e->System.out.println(e+","));
	}

}
