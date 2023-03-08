package Basic_Assignment;
//Write a program to print all prime number in between 1 to 100.
public class LoopAssignment14 {


    //function to check if a given number is prime
   static boolean isPrime(int p)
   {
        //since 0 and 1 is not prime return false.
        if(p==1||p==0)
        	return false;
  
        //Run a loop from 2 to p-1
        for(int i=2; i<p; i++)
        {
          // if the number is divisible by i, then n is not a prime number.
              if(p%i==0)
            	  return false;
        }
        //otherwise, n is prime number.
        return true;
  }


  
  public static void main (String[] args) 
  { 
      int n = 100; 
      //check for every number from 1 to N
      for(int i=1; i<=n; i++)
      {
          //check if current number is prime
          if(isPrime(i)) 
          {
              System.out.print(i + " ");
          }

      }}}

