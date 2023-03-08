package LambdaExpressions;

import java.util.List;

public class PrintStringsEndingWithAT {

	public static void main(String[] args) {
		List<String> list = List.of("Apple","Bat","Cat","Dog");
		//printwithBasics(list);
		printWithFP(list);
	}
	private static void printwithBasics(List<String> list)
	{
		for(String x:list)
		{
			if (x.endsWith("at"))
				System.out.println(x);
		}
	}
	private static void printWithFP(List<String> list) {
		list.stream()
		.filter(x->x.endsWith("at"))   //sending logic to the filter function
		.forEach(element->System.out.println(element) );
	}

}
