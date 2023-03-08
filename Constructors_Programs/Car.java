package Constructors_Programs;

public class Car 
{
int price;
String model;
//0 arguments constructor which does nothing
//default=>package protector
public Car()
{
	System.out.println("In 0 arguments contructor");
}
public static void main(String[] args) {
	Car c=new Car();
	c.price=10000;
	c.model="Splender";
	System.out.println("c=>"+c.toString());// automatically called c.toString()
	System.out.println("c=>"+c.price());
	//toString=returns a string representation of the objects
	}

public String toString()
{
	return this.model;
}
public int price()
{
	return this.price;
}
}
