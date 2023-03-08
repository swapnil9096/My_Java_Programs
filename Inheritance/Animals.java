package Inheritance;

public class Animals
{
	String type;
	int noOfLegs=10;
	boolean gender;
	void walk()  //this method is going to override in child method dog to 	
	{
	 System.out.println("Animal walks");//explain access modifier
	}
	int eat() //this method is going to override in child method dog to explain return data type can not be changed when it is primitive type
	{
		System.out.println("Animal eats");
		return this.noOfLegs;
	}
	protected Animals sleep() //this method is going to override in child method dog to explain return data type can be changed when it is non-primitive  
	{
		System.out.println("Animal sleeping");
	    return new Animals(); 
	}
}
