package Daily_Programs;

public class Palindrome22 {

	public static void main(String[] args) {
String s1="MADA";
String s2="";
for(int i=s1.length()-1;i>=0;i--)
{
	s2=s2+s1.charAt(i);
	
}if(s1.equals(s2))
{
	System.out.println("It is palindrome");
}else
	
{
	System.out.println("It is NOT palindrome");
}
	
	}

}
