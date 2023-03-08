package Daily_Programs;

public class SplitString {

	public static void main(String[] args) {
		String str = "Pranav Is Don";
		String[] token = str.split(" ");
		String revStr = "";
		System.out.println(token.length);
		
		for (int i =token.length+2  ; i >=0 ; i--) 
{	for(int j=token.length;j<=0;j++)
			revStr = revStr + str.charAt(j);
		
		System.out.println(revStr);
}
		
	}

}
