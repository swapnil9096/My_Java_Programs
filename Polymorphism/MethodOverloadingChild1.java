package Polymorphism;

public class MethodOverloadingChild1 extends MethodOverloading {
	public void name(String s1, int a) {
		s1 = "Shinde";
		a = 5;
		System.out.println(s1);

	}

	public static void main(String[] args) {

		MethodOverloadingChild1 aa = new MethodOverloadingChild1();
		aa.name(null, null);
		aa.name(null, 0);
	}

}
