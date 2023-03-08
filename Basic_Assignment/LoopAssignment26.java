package Basic_Assignment;

public class LoopAssignment26 {

//	WAP=> write a program to print perfect number in the range of 1-1000
   static boolean perfectNo(int n)
{   
	   int Sum=0;
		for(int i= 1 ; i <n; i++)//1 2 3 4 5 6 7 8 9 10 11 12 13   14  27
		{
			if(n % i == 0) 
			
				Sum = Sum + i; // 1 3 7 14 28
			
	    }
	   if (n==Sum) 
	    return true;	
	   else
			return false;
}

public static void main(String[] args) {
	for(int i=1;i<=1000;i++)
		
	if(perfectNo(i))
		System.out.println(i);
}
}

