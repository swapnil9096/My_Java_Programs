package Programs10;

public class ReverseNo {
public static void main(String[] args) {
	int n = 223141;
	while(n>0)
	{
		int p = n%10;
		System.out.println(p);
		n=n/10;
	}
}
}
