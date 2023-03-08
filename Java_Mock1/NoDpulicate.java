package Java_Mock1;

public class NoDpulicate {

	public static void main(String[] args) {
		
		int n=2,cnt=0;
		int [] a= {2,3,4,3,6,2,2,2};
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
