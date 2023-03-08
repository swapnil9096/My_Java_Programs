package Daily_Programs;

public class SplitDemo {

	public static void main(String[] args) {
		String str="Java is Awesome";
		String[] tokens=str.split(" ");
		for(int i=0;i<tokens.length;i++)
			System.out.println(tokens[i]);

	}

}
