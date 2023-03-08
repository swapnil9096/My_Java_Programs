package Daily_Programs;

import Polymorphism.MethodOverRiding;

public class RunnerMethodOverride extends MethodOverRiding{

	public static void main(String[] args) {
	
      MethodOverRiding in=new child1MethodOverride();
      System.out.println(in.addTwoNo(0, 0, 0));
      
      MethodOverRiding out=new MethodOverRiding();
     System.out.println(out.addTwoNo(9,8,7));
     RunnerMethodOverride ths=new RunnerMethodOverride();
     System.out.println(ths.addTwoNo(0, 0, 0));
	}
	public int addTwoNo(int a,int b,int c)
	{
		a=6;
		b=5;
		c=a+b;
		return c;
	}
}
