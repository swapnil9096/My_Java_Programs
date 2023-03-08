package Constructors_Programs;

public class ConstructorDemo {
	
	int age=500;
	boolean gender=true;
	
	ConstructorDemo()
	{
		System.out.println("it is demo of Constructor ");
	}
	ConstructorDemo(int a,boolean g)
	{
		 this.age=a;
		 this.gender=g;
	}
		public static void main(String[] args) 
		{
		ConstructorDemo n1=new ConstructorDemo();
		ConstructorDemo n2=new ConstructorDemo(100,true);
	          System.out.println(n2.age);//100 
	          System.out.println(n2.gender);//true
		
		System.out.println(n1.age);//true
		System.out.println(n1.gender);//500

		
		
	}
}
