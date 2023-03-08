package Daily_Programs;

public class VariableArrayLengthDemo {
 public static int AddNos(int... a)
 {
	 int sum=0;
	 for(int x:a)
	 {
		System.out.println("x="+x);
		sum=sum+x;
	 }
	 return sum;
 }
	public static void main(String[] args) {
		int sum=AddNos(4,6,7,8,9);
		System.out.println("Sum="+sum);
	}

}
