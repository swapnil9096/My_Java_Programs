package Daily_Programs;

public class METHODDEMO {
	private METHODDEMO() {
		System.out.println("++*//*/*");
	}

	int a = 5;

	void str() {
		System.out.println(a);
		System.out.println("hello");
	}

	public static void main(String[] args) {
		METHODDEMO aa = new METHODDEMO();
		int a = 60;
		aa.str();
		int h = 8, b = 2345;
		float res = ((((h + b) / 3) % 5) * 5);
		System.out.println(res);
		String city = "Surat";
		System.out.printf("%3S", city);
		float m = 12.34456789f;
		System.out.printf("\n%10.2f", m);

	}

	static {
		System.out.println("*********");
		int a = 79;
	}

	{
		System.out.println(".....");
	}
}
