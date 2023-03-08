package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllIntegersFromList {
public static void main(String[] args) {
	
	List<Integer> al=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
	int sum=al.stream().reduce(0,(n1,n2)->(n1+n2));
	System.out.println("Sum of first 10 numbers "+sum);
	
	List<Integer> am=new ArrayList<>(List.of(1,2,3,4,5));
	int sum1=am.stream().reduce(1,(d1,d2)->(d1*d2));
	System.out.println("Multiplication of first 5 numbers=: "+sum1);
	
	List<Integer> al2=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
	int sum3=al2.stream().filter(e->e%2==0).reduce(0,(p1,p2)->(p1+p2));
	System.out.println(sum3);

	List<Integer> al4=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
	int sum5=al4.stream().filter(o->o%2!=0).reduce(0,(n1,n2)->n1+n2);
	System.out.println(sum5);
}
}
