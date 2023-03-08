package Daily_Programs;
//how to compare two objects
	//By overriding equals methods of object class
	
public class overrideToString {
	int price;
	String model;
	
	void drive()
	{
		System.out.println("Abhishek is Driving");
		System.out.println("Pranav is Driving");

	}
	
	
	public static void main(String[] args) {
		overrideToString c1=new overrideToString();
		c1.model="Thar";
		c1.price=200000;
		overrideToString c2=new overrideToString();
		c2.model="Speleder";
		c2.price=100000;
		System.out.println(c1.hashCode()+"="+c2.hashCode());
		System.out.println(System.identityHashCode(c1)+"="+System.identityHashCode(c2));
		c1.drive();

		if(c1==c2)//compare references hashcode
		{
		System.out.println("c1==c2");			
		}
		else
		{
			System.out.println("c1<>c2");
		}
		if(c1.equals(c2))//Compares content of an object 
		{
			System.out.println("c1 EQUALS TO C2");
		}
		else
		{
			System.out.println("c1 is NOT EQUALS TO C2");
		}
		System.out.println(c1.toString()+"="+c2.toString());
		System.out.println(c1.equals(c2));
		}
	//overriden toString method from object class 
	public String toString()
      {
		return this.model+"="+this.price;
		}
	public boolean equals (overrideToString S)
	{
		if(this.model.equals(S.model) && this.price==this.price)
			return true;
		else
			return false;
	}
	}
