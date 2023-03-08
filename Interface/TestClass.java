package Interface;

public class TestClass implements TestInterface {

	@Override
	public void display() {
		System.out.println("Show Method is being called");
	}

	@Override
	public void show() {
		System.out.println("In print method");
	}

	public void name() {
		System.out.println("In name method");
	}

	public void hello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.show();
		tc.display();
		//tc.print();
		System.out.println(tc.NOOFWHEELS);
		//TestInterface.printAFile();
		tc.name();
		tc.hello();
	}

	@Override
	public void students() {
		
	}

	@Override
	public void m1() {
		
	}

	@Override
	public void m2() {
		
	}

	

	
}
