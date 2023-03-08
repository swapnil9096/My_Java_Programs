package Basic_Assignment;
//WAP=>Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers
public class LoopAssignment8
{
public static void main(String[] args) {
	int a=23,b=37,rem ,hcf=1;
	   
	   while(b!=0) //check for b=0 condition because in a/b ,b should not equal to zero{
	   {
		   rem=a % b;
	      a=b;
	      b=rem;
	   }
	   System.out.println("GCD of 23 and 37 is => "+a);
	   
for(int i=1; i<=a; i++)  
{  

    if(a%i==0 && b%i==0)  
    {  
        hcf = i;  
    }  
    
}  
System.out.println("HCF of 23 and 37 is => "+ hcf);
}}
