package Method_Programs;

public class RevArrUsingFunction {
public static int[] copyreverseArray(int[] numbers) 
{
	int[] c =new int[numbers.length];
	int ind=0;
	for(int i=numbers.length-1;i>=0;i--)
		c[ind++]=numbers[i];
	return c;
}
	public static void main(String[] args) {
   int a[]= {12,4,4,5,6};
   
   int revArr [] =copyreverseArray(a);
   	for(int x:revArr)	
   	{
   		System.out.print(x+ " ");
   	}
	}

}
