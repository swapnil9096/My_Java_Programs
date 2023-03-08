package Daily_Programs;

//Reverse each And Every token of the String 
public class TokenIndexRev {

	public static void main(String[] args) {
		String str = "Java Is Awesome";
		char strRev;
		for (int i = str.length() - 1; i >= 0; i--) {
			strRev = str.charAt(i);
			System.out.print(strRev);
		}

	}

}
//OUTPUT==emosewA sI avaJ