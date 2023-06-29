package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortUsingLambdaExpression {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>(Arrays.asList(9,5,3,2,7,4,1));
		
//		al.stream().distinct().sorted().forEach(e -> System.out.print(e+","));
		
		al.stream().sorted().forEach(e-> System.out.print(e + ","));
		
	}

}
