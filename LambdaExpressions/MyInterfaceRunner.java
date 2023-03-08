package LambdaExpressions;

public class MyInterfaceRunner {

	public static void main(String[] args) {
		MyInterface myintfc =() ->
		{
			System.out.println(100);
		};
			myintfc.printNo();
		
		MyInterface2 my2=(x)-> System.out.println(x);
		my2.printName("pune");
		
		MyInterface3 my3=(x,y)-> System.out.println(x+y);
			my3.add(110, 120);
			
			MyInterface4 my4=(x,y)->x+y; 
			{	
				System.out.println(my4.add(10, 20));
			}
			
		MyInterface4 my41=(x,y)->
		{
			System.out.println("I am inside myinterface 4");
			System.out.println( x+y);
			return x+y;
		};
	my41.add(200,400);
		}

}
