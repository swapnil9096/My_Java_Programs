package Daily_Programs;

public class ReverseStringUsingBuffer {

	public static void main(String[] args) {
		
		String str = "hello";
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(str);
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.reverse());
		
		
		
		String str1 = "Swapnil";
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(str1);
		sb1.reverse();
		
		System.out.println(sb1);
		
		String str2 = "India";
		
		String actual="";
		
		for(int i = str2.length()-1;i>=0;i--)
		{
			actual = actual + str2.charAt(i);
					
		}
		
		System.out.println(actual);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
