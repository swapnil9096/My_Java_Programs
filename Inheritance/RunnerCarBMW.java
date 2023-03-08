package Inheritance;

public class RunnerCarBMW //runner class in the same package
{
public static void main(String[] args) 
{
BMW bmw=new BMW();
bmw.brand="x class"; //protected istance variable is accessible
System.out.println(bmw.brand);
}
}
