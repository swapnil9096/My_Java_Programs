package Daily_Programs;

public class PrimeNoDemo {

	public static void main(String[] args) {

		int no = 7;
		int j;
		
			for(j=2;j<=no;j++)
			{
				if(no%j==0)
					break;
			}
			
			if(no==j)
				System.out.println(no + ",");
		
	}
}
