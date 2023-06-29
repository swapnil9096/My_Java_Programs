package Daily_Programs;

public class PerefectNoGenration {
	public static void main(String[] args) {

		int noPrint=1, sum=0, loop=1;//2

		while(loop<=noPrint)
		{
			if(noPrint % loop==0)
			{
				sum=sum+loop;//1
				noPrint++;
			}
			loop++;
		}
		if(noPrint==sum)
			System.out.println(noPrint);
		
	}
}






