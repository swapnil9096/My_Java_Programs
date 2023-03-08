package Abstraction;

public class ThreeWheeler extends Cycle {
	ThreeWheeler()
	{  
		System.out.println("In 0 args constructor.....");
	}

	@Override
	void disp() 
	{
		System.out.println("in disp method");
	}

	@Override
	void show() {
		System.out.println("in show method");
	}

	@Override
	void printFile() {
		System.out.println("In ThreeWheeler");
		super.printFile();
	}
	void name()
	{ super.name();
		System.out.println("Pranav");
	}

}
