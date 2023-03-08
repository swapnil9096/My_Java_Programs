package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserinputDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("enter number");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inp = new BufferedReader(isr);
		int t = Integer.parseInt(inp.readLine());
		System.out.println("enter String");
		String str = inp.readLine();
		System.out.println("you entered no " + (t + 100));
		System.out.println("you entered str " + str);

	}
}
