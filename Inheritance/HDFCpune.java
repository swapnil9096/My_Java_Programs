package Inheritance;

public class HDFCpune extends HDFC {
	int hello = 900;
	float intRate = 8.5f;

	public HDFCpune(int b) {
		super(b);
		this.hello = b;

		System.out.println("HDFCpune:: 1 args constructor called");

	}

	public static void main(String[] args) {
		System.out.println("Start program");
		HDFCpune hdfcpune = new HDFCpune(90);
		System.out.println("End of program");
		System.out.println(hdfcpune.intRate);
		System.out.println(hdfcpune.hello);

	}
}
