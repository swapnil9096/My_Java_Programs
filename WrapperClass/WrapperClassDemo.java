package WrapperClass;

public class WrapperClassDemo {
	public static void main(String[] args) {
		Double h = Double.valueOf("1000");
		System.out.println(h.BYTES);
		System.out.println(h.MAX_VALUE);
		System.out.println(h.MIN_VALUE);
		System.out.println(h.SIZE);

		Boolean value = Boolean.valueOf("true");
		if (value) {
			System.out.println("Yes i am inside if block");
		} else {
			System.out.println("Yes i am inside else block");
		}

		Float floatwrapper = Float.valueOf(49.0f);
		float floatTolnt = floatwrapper.intValue();
		System.out.println(floatTolnt + 100);
		int a = 20;
		Integer i = Integer.valueOf(a);
		if (i instanceof Integer)
			System.out.println("its Integer object");
		Integer aa = new Integer(10);
		int ii = aa.intValue();// into premitive
		System.out.println(Integer.toBinaryString(7));//111
		System.out.println(Integer.toString(ii, 16));//a

		int i1 = 100;
		Integer obj = new Integer(i1);

		System.out.println("obj data type: " + obj.getClass());
		// FQN: Fully qualifies Name
		/// class java lang Integer
		Integer ss = Integer.valueOf("111", 2);//binary to decimal=7
		System.out.println("ss: " + ss);

	}
}
