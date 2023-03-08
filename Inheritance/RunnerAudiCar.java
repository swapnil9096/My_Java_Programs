package Inheritance;

import Getter_Setter.Audi;

public class RunnerAudiCar {
// this is runner class in different package and is a child class where protected
	//data members of a Car class not accessible
	public static void main(String[] args)
	{
Audi audi=new Audi();
audi.brand="S class";
System.out.println(audi.brand);
//audi brand....>not accesible
	}

}
