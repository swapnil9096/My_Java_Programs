package Constructors_Programs;

public class Person {

int acn;

String name;
float height;

  static int eat()
{ System.out.println("Person Eats");
	return 90;
}
void work() 
{
		System.out.println("Person Works");
}
void sleep()
{
	System.out.println("Person Sleeps");
}//constructor type- default/zeroarguments,Parameterized Constructor,Parameterized Constructor with no return data type,Parameterized Constructor with return data type,copy constructor
//constructor name=person
//zero argumentdefault constructor
//return type- nothing
//gets called automatically when we create an object
//to initialize instance variable we use constructor
Person(String name1)
{
	System.out.println("in 1 argument conatructor...");

	name="Swapnil";
}

    Person()
{
	System.out.println("in 0 argument conatructor...");
	this.acn=10;
	this.name="Raksha";
	this.height=5.4f;
}
Person(int acn,String name,float height)
{
	//'this' refers to instance variables
	System.out.println("in 3 arguments constructor...");
	this.acn=acn;
	this.name=name;
	this.height=height;
}
public static void main(String[] args) 
{
  //note: Every object has got an id (unique)-hashcode
	Person p1=new Person(100,"vishakha",5.10f);
	System.out.println("p1.hashCode=>"+p1.hashCode());

	System.out.println("P1.acn=>" + p1.acn);
	System.out.println("P1.acn=>" + p1.name);
	System.out.println("P1.acn=>" + p1.height);
	
	
	Person p2=new Person(200,"Raksha",5.8f);
	System.out.println("p2.hashCode=>"+p2.hashCode());

	System.out.println("P2.acn=>" + p2.acn);
	System.out.println("P2.acn=>" + p2.name);
	System.out.println("P2.acn=>" + p2.height);

	
	
	Person p3=new Person();
	System.out.println("p3.hashCode=>"+p3.hashCode());

	System.out.println("P3.acn=>" + p3.acn);
	System.out.println("P3.acn=>" + p3.name);
	System.out.println("P3.acn=>" + p3.height);
	
	
	
	Person p4=new Person("Swapnil...");

			System.out.println(p4.name);
			
			p2.eat();
			p1.work();
			p3.sleep();

}
}

















