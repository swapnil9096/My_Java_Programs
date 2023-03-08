package SingletonClass;

public class SingletonClassDemo {
	// obj is class variable(static) of type SingletonDemo (class: NPDT)
	private static SingletonClassDemo obj =null;
	// private constructor: we can't create object of this class outside the class/pkg
	private SingletonClassDemo()
	{
		
	}
	public static SingletonClassDemo getInstance()
	{
		if (obj == null)
			obj = new SingletonClassDemo();//it allows u to create an object
			System.out.println("Inside GetInstacnce");
		return obj;
	}
	
	
}

