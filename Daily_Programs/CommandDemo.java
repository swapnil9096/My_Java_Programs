package Daily_Programs;

public class CommandDemo {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++)
			System.out.println("args[]:" + args[i]);
		for (int j = 0; j < args.length; j++) {
			System.out.println("args[]:" + args[j]);

			System.out.println("Add no");
		}
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("Adding 2 nos.");
			System.out.println("Res:" + (a + b));
		
	}
}
