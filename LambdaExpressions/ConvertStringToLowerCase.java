package LambdaExpressions;

import java.util.List;

public class ConvertStringToLowerCase {
public static void main(String[] args) {
	List<String> list=List.of("Apple","Banana","chkku","pineapple");
	list.stream().map(e->e.toUpperCase()).forEach(e->System.out.println( e +","));
	System.out.println(list);
}
}
