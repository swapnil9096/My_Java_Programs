package Inheritance;

public class Dog extends Animals
{
String breed="Gavthi";//null
int NoOfLegs=4;
Dog(String breed)
{
	this.breed=breed;
}
Dog()
{
	
}
int eat()
{
	System.out.println("Dog eats pedgree ");
	return NoOfLegs;
}
  public Dog sleep()
{
	System.out.println("Animal sleeps");
	return new Dog();
}
}
