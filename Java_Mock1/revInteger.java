package Java_Mock1;

public class revInteger {

	public static void main(String[] args) {
		int n,a=1234231241 ;
		for(;a>0;)
		{
			n = a % 10;
			System.out.print(n);
			a = a / 10;
		}
	}

}
