package Interface;

public interface TestInterface {
	int NOOFWHEELS = 4; // public static final

	void display();

	void show();

	void name();
	void students();
	void m1();
	void m2();
	default void m3()
	{
		System.out.println(" In default method...");
	}
}
