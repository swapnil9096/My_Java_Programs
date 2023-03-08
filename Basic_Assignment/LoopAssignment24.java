package Basic_Assignment;
//write a program to find the multiplication of 2 numbers without *using operator
public class LoopAssignment24 {

	
		public static int multOut(int a, int b) {
		    int mult= 0;
		    for (int i = 0; i < a; i++) 
		    {
		        mult += b;//5 10 15 20 25
		    }
	        System.out.println(mult);

		    return mult;
		}
		public static void main(String[] args) 
		{
			multOut(5,5);
			
		}
	

}
