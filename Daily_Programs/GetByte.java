package Daily_Programs;

public class GetByte {
public static void main(String[] args) {
	String s1="ABC";
	byte[] newStr=s1.getBytes();
	for(int i=0;i<s1.length();i++)
	{
		System.out.println(newStr[i]+"");
	}
}
}
