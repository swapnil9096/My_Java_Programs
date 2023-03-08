package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class PrintArrayListOfInteger {
	static void myPrint(Integer i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>(List.of(1,2,3,4,5,6,7));
		for(Integer x:al)
			myPrint(x);
		//(i,i) -> System.out.print(i+j)
	}

}
