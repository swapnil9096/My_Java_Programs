package LambdaExpressions;

import java.util.List;

public class OddNoPrintingWithLambdaExpression {
public static void main(String[] args) {
	List<Integer>list=List.of(1,2,3,4,5,6,7,8,9,10);
//	for(Integer x : list )
//	{
//		System.out.println(x);
//	}
	// using lamda expression 
//	list.stream().forEach(e->System.out.println(e));
	
	list.stream().filter(o->o%2==1).forEach(o1->System.out.println(o1));
	
	
}
}
